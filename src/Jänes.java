import java.util.Scanner;

public class Jänes extends Lemmikloom{
    public Jänes(String nimi, String liik, int vanus) {
        super(nimi, liik, vanus);
    }

    @Override
    void söö() {
        System.out.println("Mida soovid süüa anda?");
        System.out.println("[0] - Porgand");
        System.out.println("[1] - Šokolaad");
        System.out.println("[2] - Kapsas");
        Scanner toiduSisend = new Scanner(System.in);
        int toiduValik = toiduSisend.nextInt();
        switch (toiduValik){
            case 0:
                System.out.println("Jänku sai porgandi. Nälg +20p");
                this.setNälg(this.getNälg() + 20);
                if (this.getNälg() > 100) this.setNälg(100);
                if (this.getNälg() < 0) this.setNälg(0);
                break;
            case 1:
                System.out.println("Mida sa teed?? Šokolaad on jänestele mürgine! Tervis -30p");
                this.setTervis(this.getTervis() - 30);
                if (this.getNälg() > 100) this.setNälg(100);
                if (this.getNälg() < 0) this.setNälg(0);
                break;
            case 2:
                System.out.println("Jänku sai porgandi. Nälg +10p");
                this.setNälg(this.getNälg() + 10);
                if (this.getNälg() > 100) this.setNälg(100);
                if (this.getNälg() < 0) this.setNälg(0);
                break;
            default:
                System.out.println("Sisend oli vale. Proovi uuesti.");
        }
    }

    @Override
    void mängi() {
        System.out.println("Mida soovid mängida?");
        System.out.println("[0] - Hüppamine");
        System.out.println("[1] - Jooks");
        Scanner toiduSisend = new Scanner(System.in);
        int toiduValik = toiduSisend.nextInt();
        switch (toiduValik) {
            case 0:
                System.out.println("Käisite hüppamas. Meeleolu +20p");
                this.setMeeleolu(this.getMeeleolu() + 20);
                if (this.getMeeleolu() > 100) this.setMeeleolu(100);
                if (this.getMeeleolu() < 0) this.setMeeleolu(0);
                break;
            case 1:
                System.out.println("Käisite jooksmas. Meeleolu +10p");
                this.setMeeleolu(this.getMeeleolu() + 20);
                if (this.getMeeleolu() > 100) this.setMeeleolu(100);
                if (this.getMeeleolu() < 0) this.setMeeleolu(0);
                break;
            default:
                System.out.println("Sisend oli vale. Proovi uuesti.");
        }
    }
}
