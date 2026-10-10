/*
 * Sinir sabitleri ve Math.addExact (Degiskenler: "Sinir Sabitleri ve Math.addExact").
 * MIN/MAX degerleri yazdirilir; x + 1 sessizce tasar, Math.addExact(x, 1) ise
 * ArithmeticException: integer overflow firlatir (burada yakalanir).
 */
public class SinirSabitleri {
    public static void main(String[] args) {
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        int x = Integer.MAX_VALUE;
        System.out.println(x + 1);   // -2147483648 (sessiz tasma)
        try {
            System.out.println(Math.addExact(x, 1));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());   // integer overflow
        }
        try {
            System.out.println(Math.addExact(Long.MAX_VALUE, 1L));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());   // long overflow
        }
    }
}
