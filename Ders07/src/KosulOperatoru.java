/*
 * Kosul operatoru ?: bir deger uretir (Slayt 21, Calisma Sorusu 22-23).
 * Ic ice ?: gecerlidir ama okunmasi zordur.
 * Beklenen cikti: 12, "7 tek", "-", "esit"
 */
public class KosulOperatoru {

    public static void main(String[] args) {
        int a = 7, b = 12;
        int enBuyuk = (a > b) ? a : b;
        System.out.println(enBuyuk);              // 12

        // Soru 22
        int m = a < b ? a : b;
        String s = m % 2 == 0 ? "cift" : "tek";
        System.out.println(m + " " + s);          // 7 tek
        int n = -5;
        String isaret = n > 0 ? "+" : n < 0 ? "-" : "0";
        System.out.println(isaret);               // -

        // Soru 23
        int c = 5, d = 5;
        System.out.println(c > d ? "a" : c < d ? "b" : "esit");   // esit
    }
}
