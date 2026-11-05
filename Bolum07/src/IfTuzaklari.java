/*
 * if ile ilgili sik tuzaklar (Calisma Sorulari 1-6): suslu parantez, sinir degeri (> ve >=),
 * if'ten sonra noktali virgul ve suslu parantezsiz if'te yalniz ilk deyimin kosula bagli olmasi.
 * Beklenen cikti: B | A | buyuk degil, en az 5 | Pozitif, Bitti | B, C
 */
public class IfTuzaklari {

    public static void main(String[] args) {
        // Soru 1
        int x = 3;
        if (x > 5)
            System.out.println("A");
        else
            System.out.println("B");            // B

        // Soru 2: dallarin yazdirdigi harfler yer degistirmis
        if (x > 5) {
            System.out.println("B");
        } else {
            System.out.println("A");            // A
        }

        // Soru 3: sinir degeri
        x = 5;
        if (x > 5)
            System.out.println("buyuk");
        else
            System.out.println("buyuk degil");  // buyuk degil
        if (x >= 5)
            System.out.println("en az 5");      // en az 5

        // Soru 5: if (x > 0); -> bos deyim, println her zaman calisir
        x = -3;
        if (x > 0);
            System.out.println("Pozitif");      // yine de yazilir!
        System.out.println("Bitti");

        // Soru 6: suslu parantez yok -> yalniz ilk deyim kosula bagli
        x = 2;
        if (x > 5)
            System.out.println("A");
            System.out.println("B");            // girinti yaniltici: her zaman calisir
        System.out.println("C");
    }
}
