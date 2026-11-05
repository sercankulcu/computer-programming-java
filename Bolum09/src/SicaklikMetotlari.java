/*
 * Sicaklik donusumu: birbirinin tersi iki metot (Slayt 39).
 * Beklenen cikti: 77.0 ve 25.0
 */
public class SicaklikMetotlari {

    static double fahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double f = fahrenheit(25);
        System.out.println(f);            // 77.0
        System.out.println(celsius(f));   // 25.0
    }
}
