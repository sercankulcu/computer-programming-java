/*
 * Degisken sayida arguman (varargs): int... s metot icinde bir dizidir (Slayt 19-21).
 * Bos cagri topla() bos dizi alir ve 0 dondurur.
 * Beklenen cikti: 6, 0, 9
 */
public class Varargs {

    static int topla(int... s) {
        int t = 0;
        for (int v : s) t += v;
        return t;
    }

    public static void main(String[] args) {
        System.out.println(topla(1, 2, 3));            // 6
        System.out.println(topla());                   // 0
        System.out.println(topla(new int[]{4, 5}));    // 9
    }
}
