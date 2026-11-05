/*
 * swap tuzagi: metot icinde a ve b yer degistirir ama bunlar kopyadir
 * (Slayt 16, Calisma Sorusu 15). Java'da ilkel tipli iki degiskeni metotla takas edemeyiz.
 * Beklenen cikti: "swap ici: 5 3", sonra "3 5"
 */
public class SwapTuzagi {

    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println("swap ici: " + a + " " + b);   // 5 3
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        swap(x, y);
        System.out.println(x + " " + y);   // 3 5
    }
}
