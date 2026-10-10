/*
 * Sifira bolme ve ozel degerler (Degiskenler: "Sifira Bolme ve Ozel Degerler"; Calisma Sorulari 26).
 * Tam sayida 1 / 0 ArithmeticException (yakalanir); ondalikta Infinity ve NaN uretilir.
 * Kalanin isareti bolunenin isaretidir: -7 % 3 = -1, 7 % -3 = 1; 5.5 % 2 = 1.5.
 */
public class SifiraBolme {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        System.out.println(1.0 / 0);       // Infinity
        System.out.println(-1.0 / 0);      // -Infinity
        double nan = 0.0 / 0;
        System.out.println(nan);           // NaN
        System.out.println(nan == nan);    // false
        System.out.println(nan != nan);    // true
        System.out.println(Double.isNaN(nan));   // true

        // Soru 26
        System.out.println(-7 % 3);
        System.out.println(7 % -3);
        System.out.println(5.5 % 2);
        System.out.println(1.0 / 0);
        System.out.println(0.0 / 0 == 0.0 / 0);
    }
}
