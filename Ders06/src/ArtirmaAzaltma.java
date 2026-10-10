/*
 * Artirma ve azaltma: i++ ile ++i (Degiskenler: "Artirma ve Azaltma"; Calisma Sorulari 18).
 * Sonek once kullanir sonra artirir, onek once artirir. Beklenen: "6 5 7" ve "4 5 10".
 */
public class ArtirmaAzaltma {
    public static void main(String[] args) {
        int i = 5;
        int a = i++;   // once kullan, sonra artir
        int b = ++i;   // once artir, sonra kullan
        i--;
        System.out.println(i + " " + a + " " + b);

        // Soru 18
        i = 3;
        a = i++ + 2;
        b = ++i * 2;
        i--;
        System.out.println(i + " " + a + " " + b);
    }
}
