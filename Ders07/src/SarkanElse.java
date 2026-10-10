/*
 * Sarkan else: else, girintiye bakilmaksizin en yakin eslesmemis if'e baglanir
 * (Slayt 15-16, Calisma Sorusu 14-15). Suslu parantez niyeti netlestirir.
 * Beklenen cikti: 0, 2, 2, 9
 */
public class SarkanElse {

    public static void main(String[] args) {
        // Slayt 15: else ic if'e (b > 0) aittir; a <= 0 oldugu icin hicbir sey olmaz
        int a = -1, b = 5, x = 0;
        if (a > 0)
            if (b > 0)
                x = 1;
            else
                x = 2;
        System.out.println(x);   // 0

        // Slayt 16: duzeltme - else dis if'e baglanir
        a = -1; b = 5; x = 0;
        if (a > 0) {
            if (b > 0) x = 1;
        } else {
            x = 2;
        }
        System.out.println(x);   // 2

        // Soru 14: girinti yaniltici, else yine ic if'e ait
        a = 3; b = -2; x = 0;
        if (a > 0)
            if (b > 0)
                x = 1;
        else
            x = 2;
        System.out.println(x);   // 2

        // Soru 15: a negatif, dis if false -> x degismez
        a = -4; b = 6; x = 9;
        if (a > 0)
            if (b > 0)
                x = 1;
        else
            x = 2;
        System.out.println(x);   // 9
    }
}
