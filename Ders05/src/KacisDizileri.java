/*
 * Kacis dizileri sorulari (Java'ya Giris Calisma Sorulari 10, 11, 12, 13).
 * \\ tek ters egik cizgi, "A\\nB" tek satirda A\nB yazar, "\\t" metin olarak \t gorunur.
 * "C:\yeni" derlenmez (illegal escape character); dogrusu "C:\\yeni".
 */
public class KacisDizileri {
    public static void main(String[] args) {
        // Soru 10
        System.out.println("Ad\tNot");
        System.out.println("C:\\ders\\java");
        System.out.println("\"Merhaba\"");
        System.out.print("1\n2\n");

        // Soru 11: \\ bir ters egik cizgi, n siradan harf
        System.out.println("A\\nB");       // A\nB

        // Soru 12
        System.out.print("x\ty\n1\t2");
        System.out.println("\\t");         // 1       2\t

        // Soru 13: asagidaki satir derlenmez -> error: illegal escape character
        // System.out.println("Dosya: C:\yeni");
        System.out.println("Dosya: C:\\yeni");   // Dosya: C:\yeni
    }
}
