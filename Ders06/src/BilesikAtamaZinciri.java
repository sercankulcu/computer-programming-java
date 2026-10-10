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
