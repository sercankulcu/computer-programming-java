/*
 * 5 / 2 ile 5.0 / 2: tam sayi ve ondalikli bolme (Degiskenler: "5 / 2 ile 5.0 / 2";
 * Calisma Sorulari 10, 11). Beklenen: 2, 2.5, 2.5, 2.5, 2.0, 1; ve 6 / 6, 1, 6.5, 6.5, 6.0.
 */
public class BolmeOrnekleri {
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println((double) 5 / 2);
        System.out.println((double) (5 / 2));   // islemden sonra donusum kesri kurtarmaz
        System.out.println(5 % 2);

        // Soru 10
        int a = 13;
        int b = 2;
        int sonuc = a / b;
        System.out.println(sonuc);

        // Soru 11
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a / 2.0);
        System.out.println((double) a / b);
        System.out.println((double) (a / b));
    }
}
