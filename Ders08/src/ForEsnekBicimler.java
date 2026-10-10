/*
 * for dongusunun esnek bicimleri (Slayt 6-7, Calisma Sorulari 7-8):
 * uc bolumu bos for(;;) + break, i++ ile ++i'nin guncelleme bolumunde fark yaratmamasi,
 * dongu degiskeni disarida tanimlaninca dongu sonrasi degerinin okunmasi.
 * Beklenen cikti: 3, "0 1 2" iki kez, 6
 */
public class ForEsnekBicimler {

    public static void main(String[] args) {
        int k = 0;
        for (;;) {              // uc bolum de bos: kosul true sayilir
            k++;
            if (k == 3) break;  // cikis kosulu sart
        }
        System.out.println(k);  // 3

        // Slayt 7 / Soru 8: guncelleme bolumunde i++ ile ++i ayni
        for (int i = 0; i < 3; i++) System.out.print(i + " ");   // 0 1 2
        System.out.println();
        for (int i = 0; i < 3; ++i) System.out.print(i + " ");   // 0 1 2
        System.out.println();

        // Soru 7: continue donguyu bitirmez; i kosul false olana kadar artar
        int i = 0;
        for (i = 1; i < 6; i++) {
            if (i > 3)
                continue;
        }
        System.out.println(i);  // 6
    }
}
