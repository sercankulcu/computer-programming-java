/*
 * Basamak toplami ve basamak sayisi (Algoritmalar Calisma Sorulari 16, 17, 18;
 * Akis Diyagramlari Calisma Sorulari 20). % 10 son basamagi verir, / 10 son basamagi atar.
 * 472 -> toplam 13; 4096 -> 4 basamak; 0 icin while 0, do-while 1 yazar.
 */
public class BasamakIslemleri {

    static int basamakToplami(int sayi) {
        int toplam = 0;
        while (sayi > 0) {
            int rakam = sayi % 10;   // Soru 16: eksik satir
            toplam = toplam + rakam;
            System.out.println("  rakam = " + rakam + ", toplam = " + toplam + ", sayi = " + (sayi / 10));
            sayi = sayi / 10;        // tam sayi bolmesi
        }
        return toplam;
    }

    // I. once kosul (while)
    static int basamakSayisiWhile(int sayi) {
        int basamak = 0;
        while (sayi > 0) {
            basamak = basamak + 1;
            sayi = sayi / 10;
        }
        return basamak;
    }

    // II. sonda kosul (do-while): govde en az bir kez calisir
    static int basamakSayisiDoWhile(int sayi) {
        int basamak = 0;
        do {
            basamak = basamak + 1;
            sayi = sayi / 10;
        } while (sayi > 0);
        return basamak;
    }

    public static void main(String[] args) {
        System.out.println("472 icin basamak toplami:");
        System.out.println("toplam = " + basamakToplami(472));   // 13
        System.out.println("1234 icin basamak toplami:");
        System.out.println("toplam = " + basamakToplami(1234));  // 10

        System.out.println("4096: while " + basamakSayisiWhile(4096) + ", do-while " + basamakSayisiDoWhile(4096)); // 4 4
        System.out.println("0: while " + basamakSayisiWhile(0) + ", do-while " + basamakSayisiDoWhile(0));          // 0 1
    }
}
