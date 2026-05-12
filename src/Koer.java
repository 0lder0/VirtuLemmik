import java.util.Scanner;

public class Koer extends Lemmikloom{
    public Koer(String nimi, String liik, int vanus) {
        super(nimi, liik, vanus);
    }

    @Override
    void söö() {
        System.out.println("Mida soovid süüa anda?");
        System.out.println("[0] - Krõbinad");
        System.out.println("[1] - Liha");
        System.out.println("[2] - Jäätis");
        Scanner toiduSisend = new Scanner(System.in);
        int toiduValik = toiduSisend.nextInt();
        switch (toiduValik){
            case 0:
                System.out.println("Koerale meeldivad krõbinad. Söömine +20p");
                this.setNälg(this.getNälg() + 20);
                if (this.getNälg() > 100) this.setNälg(100);
                if (this.getNälg() < 0) this.setNälg(0);
                break;
            case 1:
                System.out.println("Liha oli hea valik. Söömine +10p");
                this.setNälg(this.getNälg() + 5);
                if (this.getNälg() > 100) this.setNälg(100);
                if (this.getNälg() < 0) this.setNälg(0);
                break;
            case 2:
                System.out.println("Jäätis? Tõsiselt ka või? Tervis -30p");
                this.setNälg(this.getNälg() - 30);
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
        System.out.println("[0] - Pallimäng");
        System.out.println("[1] - Jooksmine");
        System.out.println("[2] - Ujumine");
        Scanner toiduSisend = new Scanner(System.in);
        int toiduValik = toiduSisend.nextInt();
        switch (toiduValik) {
            case 0:
                System.out.println("Käisite palli mängimas. Meeleolu +20p");
                this.setMeeleolu(this.getMeeleolu() + 20);
                if (this.getMeeleolu() > 100) this.setMeeleolu(100);
                if (this.getMeeleolu() < 0) this.setMeeleolu(0);
                break;
            case 1:
                System.out.println("Käisite jooksmas. Meeleolu +10p");
                this.setMeeleolu(this.getMeeleolu() + 10);
                if (this.getMeeleolu() > 100) this.setMeeleolu(100);
                if (this.getMeeleolu() < 0) this.setMeeleolu(0);
                break;
            case 2:
                System.out.println("Käisite ujumas. Meeleolu +5p");
                this.setMeeleolu(this.getMeeleolu() + 5);
                if (this.getMeeleolu() > 100) this.setMeeleolu(100);
                if (this.getMeeleolu() < 0) this.setMeeleolu(0);
                break;
            default:
                System.out.println("Sisend oli vale. Proovi uuesti.");
        }
    }
}
