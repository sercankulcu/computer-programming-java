/*
 * Kacis dizileri \t, \", \n (Java'ya Giris: "Kod Izleme: Kacis Dizileri").
 * \t sonraki sekme duragina (8. sutun) atlar; \" metni bitirmeden tirnak yazar.
 * Beklenen: "Ad      Not", "Ali     85", "\"Java\" dili", "Satir 1", "Satir 2".
 */
public class Kacis {
    public static void main(String[] args) {
        System.out.println("Ad\tNot");
        System.out.println("Ali\t85");
        System.out.println("\"Java\" dili");
        System.out.print("Satir 1\nSatir 2\n");
    }
}
