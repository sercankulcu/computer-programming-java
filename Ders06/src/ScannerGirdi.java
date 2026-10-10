/*
 * Scanner ile girdi ve satir sonu tuzagi (Degiskenler: "Scanner ile Girdi", "Satir Sonu Tuketilmezse";
 * Calisma Sorulari 33). Klavye yerine sabit dizgi ("20\nAda Yilmaz\n") okunur.
 * Beklenen: nextLine ile satir sonu tuketilirse ad = [Ada Yilmaz]; tuketilmezse ad = [] (bos dizgi).
 */
import java.util.Scanner;

public class ScannerGirdi {
    public static void main(String[] args) {
        // Gercek programda: Scanner klavye = new Scanner(System.in);
        Scanner klavye = new Scanner("20\nAda Yilmaz\n");
        System.out.print("Yas: ");
        int yas = klavye.nextInt();
        klavye.nextLine(); // satir sonunu tuket
        System.out.print("Ad: ");
        String ad = klavye.nextLine();
        System.out.println();
        System.out.println("yas = " + yas + ", ad = [" + ad + "]");

        // Satir sonu tuketilmezse
        klavye = new Scanner("20\nAda Yilmaz\n");
        System.out.print("Yas: ");
        yas = klavye.nextInt();
        System.out.print("Ad: ");
        ad = klavye.nextLine();      // tampondaki satir sonuna kadar okur: ""
        System.out.println();
        System.out.println("[" + ad + "]");
    }
}
