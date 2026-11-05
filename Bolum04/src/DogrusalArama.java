/*
 * Dogrusal arama (Algoritmalar: "Dogrusal Arama", Calisma Sorulari 21).
 * {7, 3, 9, 5, 1} dizisinde 5 -> 3 (4 karsilastirma), 4 -> -1 (5 karsilastirma).
 * {4, 8, 15, 16, 23, 42} dizisinde 16 -> 3 (4 karsilastirma), 5 -> -1 (6 karsilastirma).
 */
public class DogrusalArama {

    static int karsilastirma;

    static int ara(int[] dizi, int hedef) {
        for (int i = 0; i < dizi.length; i++) {
            karsilastirma++;
            if (dizi[i] == hedef) return i;   // ilk eslesmede sonlanir
        }
        return -1;
    }

    static void dene(int[] dizi, int hedef) {
        karsilastirma = 0;
        int sonuc = ara(dizi, hedef);
        System.out.println("ara(dizi, " + hedef + ") -> " + sonuc + " (" + karsilastirma + " karsilastirma)");
    }

    public static void main(String[] args) {
        int[] dizi = {7, 3, 9, 5, 1};   // sirali degil
        dene(dizi, 5);   // 3
        dene(dizi, 4);   // -1

        int[] dizi2 = {4, 8, 15, 16, 23, 42};
        dene(dizi2, 16); // 3
        dene(dizi2, 5);  // -1
    }
}
