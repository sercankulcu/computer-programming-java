/*
 * Yerel kapsam ve golgeleme (Slayt 22-24, Calisma Sorulari 20-22).
 * Blokta tanimli degisken blok disinda gorunmez; yerel degisken ayni adli static alani golgeler;
 * farkli metotlardaki ayni adli degiskenler ayri kutulardir.
 * Beklenen cikti: 6; 4, 10, 4, 11; "3 16"
 */
public class Kapsam {

    static int x = 10;           // static alan (sinif duzeyi)

    static int hesapla(int n) {
        int sonuc = 0;
        if (n > 0) {
            int katki = n * 2;   // yalniz if blogunda gorunur
            sonuc += katki;
        }
        // return sonuc + katki;   // HATA (Soru 20): cannot find symbol katki
        return sonuc;
    }

    // Soru 21: yerel x static x'i golgeler
    static void g() {
        int x = 3;
        x++;
        System.out.println(x);
    }

    // Soru 22
    static int kare(int a) {
        int b = a * a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(hesapla(3));   // 6

        // Slayt 24: ayni yerel kapsamda ayni ad iki kez tanimlanamaz
        // int y = 1;
        // if (y > 0) {
        //     int y = 5;   // HATA: variable y is already defined
        // }

        g();                    // 4
        System.out.println(x);  // 10
        x = x + 1;
        g();                    // 4 (her cagrida yeni yerel x = 3)
        System.out.println(x);  // 11

        int a = 3, b = 4;
        b = kare(b);
        System.out.println(a + " " + b);   // 3 16
    }
}
