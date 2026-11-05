/*
 * Uc sayinin en buyugu ve en kucugu (Akis Diyagramlari: "Uc Sayinin En Buyugu Adim Adim";
 * Calisma Sorulari 12). Ilk aday a, her karar bir kez sorulur.
 * (4, 9, 7) -> 9; (3, 2, 8) -> 8; en kucuk (8, 3, 5) -> 3.
 */
public class UcSayininEnBuyugu {

    static int enBuyuk(int a, int b, int c) {
        int enb = a;
        if (b > enb) enb = b;
        if (c > enb) enb = c;
        return enb;
    }

    static int enKucuk(int a, int b, int c) {
        int enk = a;
        if (b < enk) enk = b;
        if (c < enk) enk = c;
        return enk;
    }

    public static void main(String[] args) {
        System.out.println(enBuyuk(4, 9, 7));   // 9
        System.out.println(enBuyuk(3, 2, 8));   // 8
        System.out.println(enKucuk(8, 3, 5));   // 3
    }
}
