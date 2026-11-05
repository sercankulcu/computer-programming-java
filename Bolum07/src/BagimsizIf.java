/*
 * Bagimsiz if'ler ile else-if karsilastirmasi (Slayt 11-12, Calisma Sorusu 10).
 * Bagimsiz if'lerde her kosul ayri denetlenir; else-if ilk eslesmede durur.
 * Beklenen cikti: "A B C", sonra "A", sonra not = 85 icin "B C D"
 */
public class BagimsizIf {

    public static void main(String[] args) {
        int not = 95;
        System.out.println("Bagimsiz if (not = 95):");
        if (not >= 90) System.out.println("A");
        if (not >= 80) System.out.println("B");
        if (not >= 70) System.out.println("C");

        System.out.println("else-if (not = 95):");
        if (not >= 90) System.out.println("A");
        else if (not >= 80) System.out.println("B");
        else if (not >= 70) System.out.println("C");

        // Soru 10
        not = 85;
        System.out.println("Bagimsiz if (not = 85):");
        if (not >= 90) System.out.println("A");
        if (not >= 80) System.out.println("B");
        if (not >= 70) System.out.println("C");
        if (not >= 60) System.out.println("D");
    }
}
