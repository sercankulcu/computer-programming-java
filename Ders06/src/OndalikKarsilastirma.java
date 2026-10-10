/*
 * Ondalik sayi karsilastirma (Degiskenler: "Ondalik Sayi Karsilastirma"; Calisma Sorulari 30).
 * 0.1 + 0.2 ikili tabanda tam gosterilemez: 0.30000000000000004, == 0.3 -> false;
 * kucuk bir esikle (epsilon) karsilastirma -> true.
 */
public class OndalikKarsilastirma {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        System.out.println(a);
        System.out.println(a == 0.3);
        System.out.println(Math.abs(a - 0.3) < 1e-9);
        System.out.println("fark = " + (a - 0.3));   // yaklasik 5.55E-17
    }
}
