import java.util.Scanner;
import java.util.Random;

public class Mänguhaldur {
    private boolean mängKäib;
    private Lemmikloom lemmikloom;

    public Mänguhaldur(boolean mängKäib, Lemmikloom lemmikloom) {
        this.mängKäib = mängKäib;
        this.lemmikloom = lemmikloom;
    }

    public void setMängKäib(boolean mängKäib) {
        this.mängKäib = mängKäib;
    }

    public void rakendaJuhuslikSündmus() {
        Random rand = new Random();
        int sündmus = rand.nextInt(10); // Genereerib arvu 0 kuni 9

        System.out.println("\n" + "=".repeat(15) + " JUHUSLIK SÜNDMUS! " + "=".repeat(15));

        switch (sündmus) {
            case 0:
                System.out.println("Lemmik hüppas porilompi! Puhtus -25p, Meeleolu +15p");
                lemmikloom.setPuhtus(lemmikloom.getPuhtus() - 25);
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() + 15);
                break;

            case 1:
                System.out.println("Lemmik ajas liblikat taga ja kukkus lillepeenrasse. Meeleolu +10p, Puhtus -10p");
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() + 10);
                lemmikloom.setPuhtus(lemmikloom.getPuhtus() - 10);
                break;

            case 2:
                System.out.println("Lemmik leidis prügikastist 'hõrgutisi'. Söömine +20p, Tervis -15p");
                lemmikloom.setNälg(lemmikloom.getNälg() + 20);
                lemmikloom.setTervis(lemmikloom.getTervis() - 15);
                break;

            case 3:
                System.out.println("Äikesetorm ehmatas lemmikut kohutavalt! Meeleolu -20p");
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() - 20);
                break;

            case 4:
                System.out.println("Lemmik leidis diivani alt vana kadunud mänguasja! Meeleolu +20p");
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() + 20);
                break;

            case 5:
                System.out.println("Lemmikut nõelas herilane. Tervis -20p, Meeleolu -10p");
                lemmikloom.setTervis(lemmikloom.getTervis() - 20);
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() - 10);
                break;

            case 6:
                System.out.println("Lemmik magas pika ja kosutava une. Tervis +10p, Meeleolu +10p");
                lemmikloom.setTervis(lemmikloom.getTervis() + 10);
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() + 10);
                break;

            case 7:
                System.out.println("Pahur naabrikass susises su lemmiku peale. Meeleolu -15p");
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() - 15);
                break;

            case 8:
                System.out.println("Sügasid lemmikut täpselt kõrvatagant, nurr garanteeritud! Meeleolu +25p");
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() + 25);
                break;

            case 9:
                System.out.println("Lemmik sai 'suumid' ja jooksis toas ringi. Meeleolu +15p, Söömine -15p");
                lemmikloom.setMeeleolu(lemmikloom.getMeeleolu() + 15);
                lemmikloom.setNälg(lemmikloom.getNälg() - 15);
                break;
        }

        piiraStaatuseid();

        System.out.println("=".repeat(50) + "\n");
    }

    // Abimeetod, mis hoiab kõik väärtused vahemikus 0-100
    private void piiraStaatuseid() {
        if (lemmikloom.getTervis() > 100) lemmikloom.setTervis(100);
        if (lemmikloom.getTervis() < 0) lemmikloom.setTervis(0);

        if (lemmikloom.getPuhtus() > 100) lemmikloom.setPuhtus(100);
        if (lemmikloom.getPuhtus() < 0) lemmikloom.setPuhtus(0);

        if (lemmikloom.getMeeleolu() > 100) lemmikloom.setMeeleolu(100);
        if (lemmikloom.getMeeleolu() < 0) lemmikloom.setMeeleolu(0);

        if (lemmikloom.getNälg() > 100) lemmikloom.setNälg(100);
        if (lemmikloom.getNälg() < 0) lemmikloom.setNälg(0);

        // Kontrollib, kas loom surnud, kui ja, määrab true
        if (lemmikloom.getTervis() <= 0 || lemmikloom.getNälg() <= 0 || lemmikloom.getMeeleolu() <= 0) {
            lemmikloom.setSurmaSeisund(true);
        }
    }

    public void alustaMängu(){
        Scanner sisend = new Scanner(System.in);
        while (mängKäib){
            if (lemmikloom.isSurmaSeisund()){
                System.out.println(lemmikloom.getNimi() + " suri ära... Mäng läbi!");
                setMängKäib(false);
                break;
            }
            for (int i = 0; i < 3 && mängKäib && !lemmikloom.isSurmaSeisund(); i++) {
                System.out.println("-".repeat(25));
                System.out.println("Mida sooviksid teha?");
                System.out.println("[0] - Ravi");
                System.out.println("[1] - Toida");
                System.out.println("[2] - Pese");
                System.out.println("[3] - Mängi");
                System.out.println("[4] - Vaata staatust");
                System.out.println("[5] - Välju Mängust");
                System.out.println("-".repeat(25));
                int tegevus = sisend.nextInt();

                switch (tegevus){
                    case 0:
                        System.out.println("Kuidas soovid ravida");
                        System.out.println("[0] - Anna ravimeid");
                        System.out.println("[1] - Vii arsti juurde");
                        System.out.println("[2] - Lase magada");
                        Scanner valik = new Scanner(System.in);
                        int raviValik = valik.nextInt();
                        switch (raviValik){
                            case 0:
                                System.out.println("Antud ravimid parandasid tervist. Tervis +10p");
                                lemmikloom.setTervis(lemmikloom.getTervis() + 10);
                                piiraStaatuseid();
                                break;
                            case 1:
                                System.out.println("Arst ravis su lemmiku terveks. Tervis +20p");
                                lemmikloom.setTervis(lemmikloom.getTervis() + 20);
                                piiraStaatuseid();
                                break;
                            case 2:
                                System.out.println("Puhkus aitas. Tervis +5p");
                                lemmikloom.setTervis(lemmikloom.getTervis() + 5);
                                piiraStaatuseid();
                                break;
                            default:
                                System.out.println("Sisend oli vale. Proovi uuesti.");
                        }
                        break;
                    case 1:
                        lemmikloom.söö();
                        break;
                    case 2:
                        System.out.println("Kuidas soovid oma lemmikut pesta?");
                        System.out.println("[0] - Vii lemmik vanni");
                        System.out.println("[1] - Kiire dušš");
                        System.out.println("[2] - Pese hambad");
                        Scanner pesuSisend = new Scanner(System.in);
                        int pesuValik = pesuSisend.nextInt();
                        switch (pesuValik){
                            case 0:
                                System.out.println("Lemmik sai korralikult pestud. Puhtus +20p");
                                lemmikloom.setPuhtus(lemmikloom.getPuhtus() + 20);
                                piiraStaatuseid();
                                break;
                            case 1:
                                System.out.println("Lemmik käis duši all. Puhtus +10p");
                                lemmikloom.setPuhtus(lemmikloom.getPuhtus() + 10);
                                piiraStaatuseid();
                                break;
                            case 2:
                                System.out.println("Lemmiku hambad on puhtad. Puhtus +5p");
                                lemmikloom.setPuhtus(lemmikloom.getPuhtus() + 5);
                                piiraStaatuseid();
                                break;
                            default:
                                System.out.println("Sisend oli vale. Proovi uuesti.");
                        }
                        break;
                    case 3:
                        lemmikloom.mängi();
                        break;
                    case 4:
                        System.out.println("-".repeat(20) + "HETKE STAATUS" + "-".repeat(20));
                        System.out.println(" ".repeat(20) + "Tervis: " + lemmikloom.getTervis());
                        System.out.println(" ".repeat(20) +"Söömine: " + lemmikloom.getNälg());
                        System.out.println(" ".repeat(20) +"Puhtus: " + lemmikloom.getPuhtus());
                        System.out.println(" ".repeat(20) +"Meeleolu: " + lemmikloom.getMeeleolu());
                        break;
                    case 5:
                        System.out.println("Head aega! :)");
                        setMängKäib(false);
                        break;
                    default:
                        System.out.println("Sisend oli vale. Proovi uuesti.");
                }
            }
            rakendaJuhuslikSündmus();
        }
    }
}
