/*
 * x, y, z bilesik atama zinciri (Degiskenler Calisma Sorulari 19-24).
 * Ayni kod farkli baslangic degerleriyle calistirilir; x /= 4 tam sayi bolmesidir.
 * Son satirlar: (7,8,-4) x: 16 y: 4; (5,10,-3) x: 28 y: 7; (5,5) x: 5 y: 2; (6,6) x: 9 y: 3; (7,7) x: 15 y: 4; (8,8) x: 21 y: 5.
 */
public class BilesikAtamaZinciri {

    static void calistir(int x, int y, int azalt) {
        System.out.println("--- x = " + x + ", y = " + y + ", y -= " + azalt + " ---");
        x = x + y;
        System.out.println("x: " + x + " y: " + y);
        int z = x++;
        System.out.println("x: " + x + " z: " + z);
        y -= azalt;
        System.out.println("x: " + x + " y: " + y);
        x *= y;
        System.out.println("x: " + x + " y: " + y);
        x /= 4;
        System.out.println("x: " + x + " y: " + y);
    }

    public static void main(String[] args) {
        calistir(7, 8, 4);    // Soru 19
        calistir(5, 10, 3);   // Soru 20
        calistir(5, 5, 3);    // Soru 21
        calistir(6, 6, 3);    // Soru 22
        calistir(7, 7, 3);    // Soru 23
        calistir(8, 8, 3);    // Soru 24
    }
}

/* Beklenen cikti:
--- x = 7, y = 8, y -= 4 ---
x: 15 y: 8
x: 16 z: 15
x: 16 y: 4
x: 64 y: 4
x: 16 y: 4
--- x = 5, y = 10, y -= 3 ---
x: 15 y: 10
x: 16 z: 15
x: 16 y: 7
x: 112 y: 7
x: 28 y: 7
--- x = 5, y = 5, y -= 3 ---
x: 10 y: 5
x: 11 z: 10
x: 11 y: 2
x: 22 y: 2
x: 5 y: 2
--- x = 6, y = 6, y -= 3 ---
x: 12 y: 6
x: 13 z: 12
x: 13 y: 3
x: 39 y: 3
x: 9 y: 3
--- x = 7, y = 7, y -= 3 ---
x: 14 y: 7
x: 15 z: 14
x: 15 y: 4
x: 60 y: 4
x: 15 y: 4
--- x = 8, y = 8, y -= 3 ---
x: 16 y: 8
x: 17 z: 16
x: 17 y: 5
x: 85 y: 5
x: 21 y: 5
*/
