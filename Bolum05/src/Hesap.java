/*
 * Ifade, deyim ve blok izleme (Java'ya Giris Calisma Sorulari 21).
 * c = 40 - 7 * 5 = 5 > 0 -> "Pozitif", sonra 5. b = 9 olsaydi c = -5, blok atlanirdi.
 */
public class Hesap {
    public static void main(String[] args) {
        int a = 40;
        int b = 7;
        int c = a - b * 5;
        if (c > 0) {
            System.out.println("Pozitif");
        }
        System.out.println(c);
    }
}
