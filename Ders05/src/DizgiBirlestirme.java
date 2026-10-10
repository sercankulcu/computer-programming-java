/*
 * Sayi mi, dizgi mi? + operatorunun iki anlami (Java'ya Giris Calisma Sorulari 15, 16, 17).
 * Bir islenen String ise + birlestirme yapar; islem soldan saga ilerler.
 * Beklenen: 8, 5 + 3, 53, 85, 553 / 2314 / 1234, 46, 1212, 4612, 121234.
 */
public class DizgiBirlestirme {
    public static void main(String[] args) {
        // Soru 15
        System.out.println(5 + 3);
        System.out.println("5 + 3");
        System.out.println("5" + 3);
        System.out.println(5 + 3 + "5");
        System.out.println("5" + 5 + 3);

        // Soru 16: iki String birlesir, toplanmaz
        String sayi1 = "23";
        String sayi2 = "14";
        String toplam = sayi1 + sayi2;
        System.out.println(toplam);   // 2314

        // Soru 17
        String s1 = "12";
        String s2 = "34";
        int a = 12, b = 34;
        System.out.println(s1 + s2);
        System.out.println(a + b);
        System.out.println(s1 + a);
        System.out.println(a + b + s1);
        System.out.println(s1 + a + b);
    }
}
