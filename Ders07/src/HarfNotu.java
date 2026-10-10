/*
 * Cok yollu karar: else-if zinciri ilk true kosulda durur (Slayt 9-10).
 * Calisma Sorusu 8 (not = 65 -> D) ve Soru 9: esikler ters sirali yazilirsa
 * ilk kosul (>= 60) her yuksek notu yakalar, A/B/C hic verilmez.
 * Beklenen cikti: 95 A, 85 B, 72 C, 40 F; 65 -> D; ters zincirde 95 -> D
 */
public class HarfNotu {

    public static void main(String[] args) {
        int[] notlar = {95, 85, 72, 40};
        for (int not : notlar) {
            char harf;
            if (not >= 90)      harf = 'A';
            else if (not >= 80) harf = 'B';
            else if (not >= 70) harf = 'C';
            else                harf = 'F';
            System.out.println(not + " " + harf);
        }

        // Soru 8: D kademesi eklenmis zincir
        int not = 65;
        if (not >= 90) {
            System.out.println("A");
        } else if (not >= 80) {
            System.out.println("B");
        } else if (not >= 70) {
            System.out.println("C");
        } else if (not >= 60) {
            System.out.println("D");                 // 65 -> D
        } else {
            System.out.println("F");
        }

        // Soru 9: ters sirali esikler (mantik hatasi)
        not = 95;
        if (not >= 60) System.out.println("D");     // 95 de buraya duser!
        else if (not >= 70) System.out.println("C");
        else if (not >= 80) System.out.println("B");
        else if (not >= 90) System.out.println("A");
        else System.out.println("F");
    }
}
