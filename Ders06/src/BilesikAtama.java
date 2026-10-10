/*
 * Bilesik atama ve gizli donusum (Degiskenler: "Atama ve Guncelleme", "Bilesik Atama Gizli
 * Donusum Yapar"; Calisma Sorulari 14-17). Beklenen: 70, "15 8", 50, "12 8 2 2", "-126 9".
 * b = b + 5; derlenmez (int -> byte), b += 5 ise b = (byte)(b + 5) demektir.
 */
public class BilesikAtama {
    public static void main(String[] args) {
        int toplam = 50, fiyat = 20;
        toplam += fiyat;            // toplam = toplam + fiyat
        System.out.println(toplam); // 70

        byte b = 10;
        b += 5;
        int i = 5;
        i += 3.7;                   // i = (int)(5 + 3.7) = 8
        // b = b + 5;   // derlenmez: int -> byte
        System.out.println(b + " " + i);

        // Soru 14: sag taraf once tumuyle hesaplanir
        int j = 5;
        j *= 3 + 7;
        System.out.println(j);      // 50

        // Soru 15
        int a = 4;
        a += a * 2;
        System.out.print(a + " ");
        a -= 3 + 1;
        System.out.print(a + " ");
        a /= 2 + 1;
        System.out.print(a + " ");
        a %= 3;
        System.out.println(a);      // 12 8 2 2

        // Soru 17
        byte b2 = 120;
        b2 += 10;
        int k = 7;
        k += 2.9;
        System.out.println(b2 + " " + k);   // -126 9
    }
}
