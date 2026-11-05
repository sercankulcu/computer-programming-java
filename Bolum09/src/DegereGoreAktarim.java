/*
 * Degere gore aktarim: metot argumanin kopyasini alir, cagirandaki degisken degismez
 * (Slayt 15, Calisma Sorulari 13-14). Donus degeri kullanilmazsa kaybolur.
 * Beklenen cikti: 5; "ic: 8", "dis: 4"; 5 ve 15
 */
public class DegereGoreAktarim {

    static void artir(int x) {
        x++;                       // yalniz kopya artar
    }

    // Soru 14
    static void ikiKati(int n) {
        n = n * 2;
        System.out.println("ic: " + n);
    }

    // Soru 13: deger donduren surum
    static int artirDondur(int x) {
        x += 10;
        return x;
    }

    public static void main(String[] args) {
        int sayi = 5;
        artir(sayi);
        System.out.println(sayi);      // 5

        int n = 4;
        ikiKati(n);                    // ic: 8
        System.out.println("dis: " + n);   // dis: 4

        // Soru 13 (slayttaki adi artir; burada ayri ad: artirDondur)
        int a = 5;
        artirDondur(a);                // donus degeri kullanilmadi
        System.out.println(a);         // 5
        a = artirDondur(a);
        System.out.println(a);         // 15
    }
}
