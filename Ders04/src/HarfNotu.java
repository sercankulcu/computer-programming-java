/*
 * Harf notu, ic ice kararlar (Akis Diyagramlari Calisma Sorulari 10 ve 11).
 * Istenen tablo: 90-100 A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, 0-49 F.
 * Onerilen (hatali) kod E dalini unutur: 85 -> B, 60 -> D, 55 -> F; duzeltilmis kod 55 -> E verir.
 * Ayrica "not >= 60" yerine "not > 60" hatasini 60 sinir degeri yakalar.
 */
public class HarfNotu {

    // Diyagramdaki kod: kararlar buyukten kucuge sorulur, 50-59 E dali eksik
    static String hataliHarf(int not) {
        if (not >= 90) return "A";
        else if (not >= 80) return "B";
        else if (not >= 70) return "C";
        else if (not >= 60) return "D";
        else return "F";
    }

    // Duzeltme: "not >= 60 ?" kararinin Hayir dalina "not >= 50 ?" eklenir
    static String harf(int not) {
        if (not >= 90) return "A";
        else if (not >= 80) return "B";
        else if (not >= 70) return "C";
        else if (not >= 60) return "D";
        else if (not >= 50) return "E";
        else return "F";
    }

    public static void main(String[] args) {
        int[] notlar = {85, 60, 55, 42};
        for (int not : notlar)
            System.out.println(not + " -> hatali: " + hataliHarf(not) + ", duzeltilmis: " + harf(not));

        // Soru 11: sinir degeri testi
        int[] testler = {72, 45, 100, 60};
        for (int not : testler) {
            String dogru = (not >= 60) ? "Gecti" : "Kaldi";
            String hatali = (not > 60) ? "Gecti" : "Kaldi";
            System.out.println("not = " + not + ": >= 60 -> " + dogru + ", > 60 -> " + hatali);
        }
    }
}
