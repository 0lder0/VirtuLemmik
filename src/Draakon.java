import java.util.Scanner;

public class Draakon extends Lemmikloom {

    public Draakon(String nimi, String liik, int vanus) {
        super(nimi, liik, vanus);
    }

    @Override
    void söö() {
        System.out.println("Mida soovid süüa anda?");
        System.out.println("[0] - Liha");
        System.out.println("[1] - Sütt");
        System.out.println("[2] - Taimed");
        Scanner toiduSisend = new Scanner(System.in);
        int toiduValik = toiduSisend.nextInt();
        switch (toiduValik){
            case 0:
                System.out.println("Su draakon sai liha. Nälg +20p");
                this.setNälg(this.getNälg() + 20);
                if (this.getNälg() > 100){
                    this.setNälg(100);
                }
                break;
            case 1:
                System.out.println("Su draakon sai sütt. Nälg +5p");
                this.setNälg(this.getNälg() + 5);
                if (this.getNälg() > 100){
                    this.setNälg(100);
                }
                break;
            case 2:
                System.out.println("Su draakon sõi taimi. Nälg +10p");
                this.setNälg(this.getNälg() + 10);
                if (this.getNälg() > 100){
                    this.setNälg(100);
                }
                break;
            default:
                System.out.println("Sisend oli vale. Proovi uuesti.");
        }
    }

    @Override
    void mängi() {
        System.out.println("Mida soovid mängida?");
        System.out.println("[0] - Lendama");
        System.out.println("[1] - Ujuma ");
        System.out.println("[2] - Mängite palli");
        Scanner toiduSisend = new Scanner(System.in);
        int toiduValik = toiduSisend.nextInt();
        switch (toiduValik){
            case 0:
                System.out.println("Käisite lendamas. Meeleolu +20p");
                this.setMeeleolu(this.getMeeleolu() + 20);
                if (this.getMeeleolu() > 100){
                    this.setMeeleolu(100);
                }
                break;
            case 1:
                System.out.println("Käisite ujumas. Meeleolu +10p");
                this.setMeeleolu(this.getMeeleolu() + 10);
                if (this.getMeeleolu() > 100){
                    this.setMeeleolu(100);
                }
                break;
            case 2:
                System.out.println("Käisite palli mängimas. Meeleolu +5p");
                this.setMeeleolu(this.getMeeleolu() + 5);
                if (this.getMeeleolu() > 100){
                    this.setMeeleolu(100);
                }
                break;
            default:
                System.out.println("Sisend oli vale. Proovi uuesti.");
        }
    }
}
