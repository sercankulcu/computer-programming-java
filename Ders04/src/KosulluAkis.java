/*
 * Kosullu akis: karar simgesinden iki yol cikar, her calistirmada yalnizca biri izlenir
 * (Akis Diyagramlari: "Kosullu Akis"; Calisma Sorulari 8, 9, 13). not 72 -> Gecti, 45 -> Kaldi,
 * 60 -> Gecti; x = 3 -> B, x = 8 -> A; 0 -> Cift; ic ice karar: 6 Cift, 0 Degil, -3 Degil, 7 Tek.
 */
public class KosulluAkis {

    static void notDegerlendir(int not) {
        if (not >= 60)
            System.out.println("not = " + not + ": Gecti");
        else
            System.out.println("not = " + not + ": Kaldi");
    }

    // Soru 8: if-else
    static void aMiBMi(int x) {
        if (x > 5)
            System.out.println("x = " + x + ": A");
        else
            System.out.println("x = " + x + ": B");
    }

    // Soru 9 ve Alistirma: tek mi cift mi?
    static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0)
            System.out.println(sayi + ": Cift");
        else
            System.out.println(sayi + ": Tek");
    }

    // Soru 13: ikinci karar yalnizca birinci kararin Evet dalinda
    static void icIceKarar(int a) {
        if (a > 0) {
            if (a % 2 == 0)
                System.out.println("a = " + a + ": Cift");
            else
                System.out.println("a = " + a + ": Tek");
        } else {
            System.out.println("a = " + a + ": Degil");
        }
    }

    public static void main(String[] args) {
        notDegerlendir(72);
        notDegerlendir(45);
        notDegerlendir(60);   // sinir degeri

        aMiBMi(3);
        aMiBMi(8);

        int[] sayilar = {7, 15, 0, 21};
        for (int s : sayilar) tekMiCiftMi(s);

        int[] girdiler = {6, 0, -3, 7};
        for (int a : girdiler) icIceKarar(a);
    }
}
