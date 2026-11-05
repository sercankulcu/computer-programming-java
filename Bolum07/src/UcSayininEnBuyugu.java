/*
 * Uc sayinin en buyugu: ilk sayi aday, sonra iki bagimsiz if ile guncelleme (Slayt 35).
 * Calisma Sorusu 34: ayni yontemle en kucuk; esit degerler sorun cikarmaz.
 * Beklenen cikti: "En buyuk: 9", "En kucuk: 2"
 */
import java.util.Scanner;

public class UcSayininEnBuyugu {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("4 9 7");   // new Scanner(System.in) yerine
        int a = klavye.nextInt();
        int b = klavye.nextInt();
        int c = klavye.nextInt();
        klavye.close();

        int enBuyuk = a;
        if (b > enBuyuk)
            enBuyuk = b;
        if (c > enBuyuk)
            enBuyuk = c;
        System.out.println("En buyuk: " + enBuyuk);

        // Soru 34: en kucuk
        a = 6; b = 2; c = 2;
        int enK = a;
        if (b < enK)
            enK = b;
        if (c < enK)
            enK = c;
        System.out.println("En kucuk: " + enK);
    }
}
