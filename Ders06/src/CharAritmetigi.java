/*
 * char aritmetigi: harfler sayidir (Degiskenler: "char Aritmetigi"; Calisma Sorulari 5).
 * 'A' = 65; c++ -> 'B'; c + 1 int olur. Beklenen: "B 67 C" ve "D 70 F".
 */
public class CharAritmetigi {
    public static void main(String[] args) {
        char c = 'A';
        c++;
        int k = c + 1;
        char d = (char) (c + 1);
        // char d2 = c + 1;   // derlenmez: int -> char ortuk yapilmaz
        System.out.println(c + " " + k + " " + d);

        // Soru 5
        char c2 = 'C';
        c2++;
        int k2 = c2 + 2;
        char d2 = (char) k2;
        System.out.println(c2 + " " + k2 + " " + d2);

        System.out.println((int) 'A');   // 65
    }
}
