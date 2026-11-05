/*
 * void metotlar deger dondurmez; sonucu bir degiskene atanamaz (Slayt 10, Calisma Sorusu 8).
 * Hatali satir yorum olarak gosterilir: "incompatible types: void cannot be converted to int".
 * Beklenen cikti: "-----" ve "---"
 */
public class VoidMetotlar {

    static void cizgiCiz(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public static void main(String[] args) {
        cizgiCiz(5);              // -----
        // int x = cizgiCiz(5);   // HATA: void deger vermez
        cizgiCiz(3);              // ---
    }
}
