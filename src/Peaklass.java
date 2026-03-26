import java.util.Scanner;

public class Peaklass {
    static void main(String[] args) {
        System.out.println("-".repeat(20) + "TERE TULEMAST!" + "-".repeat(20));
        Scanner sisestus = new Scanner(System.in);
        System.out.println("Sisesta looma nimi: ");
        String nimi = sisestus.nextLine();
        System.out.println("Sisesta looma liik (valikus: Koer, Jänes, Draakon): ");
        String liik = sisestus.nextLine();
        System.out.println("Sisesta looma vanus (täisarv aastates): ");
        int vanus = sisestus.nextInt();
        Lemmikloom lemmik = null;

        if (liik.equals("Draakon")){
            lemmik = new Draakon(nimi, liik, vanus);
        } else if (liik.equals("Koer")) {
            lemmik = new Koer(nimi, liik, vanus);
        } else if (liik.equals("Jänes")) {
            lemmik = new Jänes(nimi, liik, vanus);
        }
        Mänguhaldur uusMäng = new Mänguhaldur(true, lemmik);

        System.out.println("Super! Sinu lemmikloom on valmis!");
        System.out.println("-".repeat(33));
        System.out.println("Nimi: " + nimi);
        System.out.println("Liik: " + liik);
        System.out.println("Vanus: " + vanus +  ".a");


        uusMäng.alustaMängu();
    }
}
