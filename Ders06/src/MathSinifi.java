/*
 * Math sinifi (Degiskenler: "Math Sinifi"; Calisma Sorulari 37). java.lang paketinde, import gerekmez.
 * sqrt ve pow double dondurur; round long dondurur ve yarim degeri yukari yuvarlar.
 * Beklenen son satir: "3 -2 4.0 8.0".
 */
public class MathSinifi {
    public static void main(String[] args) {
        System.out.println(Math.PI);           // 3.141592653589793
        System.out.println(Math.sqrt(16));     // 4.0
        System.out.println(Math.pow(2, 10));   // 1024.0
        System.out.println(Math.abs(-7));      // 7
        System.out.println(Math.max(3, 8));    // 8
        System.out.println(Math.min(3, 8));    // 3
        System.out.println(Math.round(2.5));   // 3
        System.out.println(Math.round(-2.5));  // -2

        // Soru 37
        System.out.println(Math.round(2.5) + " "
            + Math.round(-2.5) + " " + Math.sqrt(16)
            + " " + Math.pow(2, 3));
    }
}
