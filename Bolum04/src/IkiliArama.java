/*
 * Ikili arama, her turda sol / sag / orta yazdirilarak (Algoritmalar: "Ikili Arama",
 * Calisma Sorulari 22, 23, 24). 34 -> 7 (3 tur), 19 -> -1 (3 tur), 27 -> 5 (2 tur),
 * 4 -> -1 (3 tur). Sirali olmayan {7, 3, 9, 5, 1} dizisinde 5 bulunamaz (-1).
 */
public class IkiliArama {

    static int ikiliAra(int[] dizi, int hedef) {
        int sol = 0, sag = dizi.length - 1;
        int tur = 0;
        while (sol <= sag) {
            int orta = sol + (sag - sol) / 2;   // (sol + sag) / 2 ile ayni, tasmaz
            tur++;
            System.out.println("  tur " + tur + ": sol = " + sol + ", sag = " + sag
                    + ", orta = " + orta + ", dizi[orta] = " + dizi[orta]);
            if (dizi[orta] == hedef) return orta;
            if (dizi[orta] < hedef) sol = orta + 1;
            else sag = orta - 1;
        }
        System.out.println("  sol = " + sol + ", sag = " + sag + ": aralik bos");
        return -1;
    }

    static void dene(int[] dizi, int hedef) {
        System.out.println("hedef = " + hedef);
        System.out.println("sonuc: " + ikiliAra(dizi, hedef));
    }

    public static void main(String[] args) {
        int[] dizi = {3, 8, 12, 17, 21, 25, 30, 34, 40};
        dene(dizi, 34);    // 7

        int[] dizi2 = {3, 8, 12, 17, 21, 25, 30, 40};
        dene(dizi2, 19);   // -1

        int[] dizi3 = {2, 5, 9, 14, 20, 27, 33};
        dene(dizi3, 27);   // 5
        dene(dizi3, 4);    // -1

        // Soru 24: ikili arama yalnizca sirali veride guvenlidir
        int[] sirasiz = {7, 3, 9, 5, 1};
        dene(sirasiz, 5);  // -1 (5 dizide oldugu halde)
    }
}

/* Beklenen cikti:
hedef = 34
  tur 1: sol = 0, sag = 8, orta = 4, dizi[orta] = 21
  tur 2: sol = 5, sag = 8, orta = 6, dizi[orta] = 30
  tur 3: sol = 7, sag = 8, orta = 7, dizi[orta] = 34
sonuc: 7
hedef = 19
  tur 1: sol = 0, sag = 7, orta = 3, dizi[orta] = 17
  tur 2: sol = 4, sag = 7, orta = 5, dizi[orta] = 25
  tur 3: sol = 4, sag = 4, orta = 4, dizi[orta] = 21
  sol = 4, sag = 3: aralik bos
sonuc: -1
hedef = 27
  tur 1: sol = 0, sag = 6, orta = 3, dizi[orta] = 14
  tur 2: sol = 4, sag = 6, orta = 5, dizi[orta] = 27
sonuc: 5
hedef = 4
  tur 1: sol = 0, sag = 6, orta = 3, dizi[orta] = 14
  tur 2: sol = 0, sag = 2, orta = 1, dizi[orta] = 5
  tur 3: sol = 0, sag = 0, orta = 0, dizi[orta] = 2
  sol = 1, sag = 0: aralik bos
sonuc: -1
hedef = 5
  tur 1: sol = 0, sag = 4, orta = 2, dizi[orta] = 9
  tur 2: sol = 0, sag = 1, orta = 0, dizi[orta] = 7
  sol = 0, sag = -1: aralik bos
sonuc: -1
*/
