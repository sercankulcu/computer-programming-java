/*
 * Satir sonlari: print, println ve \n (Java'ya Giris Calisma Sorulari 9).
 * Beklenen 4 satir: "AB", "CD", bos satir, "E" (sonunda satir sonu yok).
 */
public class SatirSonlari {
    public static void main(String[] args) {
        System.out.print("A");
        System.out.println("B");
        System.out.print("C");
        System.out.print("D\n");
        System.out.println();
        System.out.print("E");
        System.out.println();   // konsol duzgun bitsin diye eklendi (soruda yok)
    }
}
