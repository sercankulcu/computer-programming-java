/*
 * String karsilastirma: == referanslari, equals icerigi karsilastirir
 * (Slayt 22, Calisma Sorusu 24). equals buyuk/kucuk harfe duyarlidir.
 * Beklenen cikti: true false true, sonra true false true false
 */
public class StringKarsilastirma {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s1 == s2);         // true  (ayni sabit dizgi)
        System.out.println(s1 == s3);         // false (new ile yeni nesne)
        System.out.println(s1.equals(s3));    // true  (icerik ayni)

        // Soru 24
        String a = "ders";
        String b = "ders";
        String c = new String("ders");
        System.out.println(a == b);           // true
        System.out.println(a == c);           // false
        System.out.println(a.equals(c));      // true
        System.out.println(c.equals("Ders")); // false
    }
}
