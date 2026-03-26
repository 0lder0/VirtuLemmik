import java.util.Scanner;

public class Mänguhaldur {
    private boolean mängKäib;
    private Lemmikloom lemmikloom;

    public Mänguhaldur(boolean mängKäib, Lemmikloom lemmikloom) {
        this.mängKäib = mängKäib;
        this.lemmikloom = lemmikloom;
    }

    public void alustaMängu(){
        while (mängKäib){
            System.out.println("-".repeat(20) + "HETKE STAATUS" + "-".repeat(20));
            System.out.println("Tervis: " + lemmikloom.getTervis());
            System.out.println("Söömine: " + lemmikloom.getNälg());
            System.out.println("Puhtus: " + lemmikloom.getPuhtus());
            System.out.println("Meeleolu: " + lemmikloom.getMeeleolu());

            for (int i = 0; i < 3; i++) {
                System.out.println("Mida sooviksid teha?");
                System.out.println("[0] - Ravi");
                System.out.println("[1] - Toida");
                System.out.println("[2] - Pese");
                System.out.println("[3] - Mängi");
                Scanner sisend = new Scanner(System.in);
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
                                if (lemmikloom.getTervis() > 100){
                                    lemmikloom.setTervis(100);
                                }
                                break;
                            case 1:
                                System.out.println("Arst ravis su lemmiku terveks. Tervis +20p");
                                lemmikloom.setTervis(lemmikloom.getTervis() + 20);
                                if (lemmikloom.getTervis() > 100){
                                    lemmikloom.setTervis(100);
                                }
                                break;
                            case 2:
                                System.out.println("Puhkus aitas. Tervis +5p");
                                lemmikloom.setTervis(lemmikloom.getTervis() + 5);
                                if (lemmikloom.getTervis() > 100){
                                    lemmikloom.setTervis(100);
                                }
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
                                if (lemmikloom.getPuhtus() > 100){
                                    lemmikloom.setPuhtus(100);
                                }
                                break;
                            case 1:
                                System.out.println("Lemmik käis duši all. Puhtus +10p");
                                lemmikloom.setPuhtus(lemmikloom.getPuhtus() + 10);
                                if (lemmikloom.getPuhtus() > 100){
                                    lemmikloom.setPuhtus(100);
                                }
                                break;
                            case 2:
                                System.out.println("Lemmiku hambad on puhtad. Puhtus +5p");
                                lemmikloom.setPuhtus(lemmikloom.getPuhtus() + 5);
                                if (lemmikloom.getPuhtus() > 100){
                                    lemmikloom.setPuhtus(100);
                                }
                                break;
                            default:
                                System.out.println("Sisend oli vale. Proovi uuesti.");
                        }
                        break;
                    case 3:
                        lemmikloom.mängi();
                        break;
                    default:
                        System.out.println("Sisend oli vale. Proovi uuesti.");
                }
            }
        }
    }
}
