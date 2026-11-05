/*
 * Tam sayi tasmasi: deger sessizce obur uca sarar (Degiskenler: "Tasma: Integer.MAX_VALUE + 1";
 * Calisma Sorulari 6, 7, 8). Beklenen: "-2147483648 -128", -127, "127 -32767",
 * ve m + 1 / long a / long b / Math.abs(MIN_VALUE): -2147483648, -2147483648, 2147483648, -2147483648.
 */
public class Tasma {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        x++;
        byte b = 127;
        b++;
        System.out.println(x + " " + b);

        // Soru 6: byte 127 iki kez artirilir
        byte y = 127;
        y++;
        y++;
        System.out.println(y);

        // Soru 7: byte ve short sarmasi
        byte b2 = -128;
        b2--;
        short s = 32767;
        s += 2;
        System.out.println(b2 + " " + s);

        // Soru 8: int sinirinda toplama
        int m = Integer.MAX_VALUE;
        System.out.println(m + 1);
        long a = m + 1;        // toplama once int ile yapilir (tasar), sonra long'a genisler
        System.out.println(a);
        long c = m + 1L;       // islenenlerden biri long: toplama long ile yapilir
        System.out.println(c);
        System.out.println(Math.abs(Integer.MIN_VALUE));
    }
}
