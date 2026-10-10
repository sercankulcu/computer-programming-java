/*
 * Not ortalamasi hatasi (Degiskenler Calisma Sorulari 13; alistirma 3).
 * toplam / 3 tam sayi bolmesidir: o1 = 81.0; o2 = 81.66666666666667 (dogru); o3 = 81.0.
 */
public class NotOrtalamasiHatasi {
    public static void main(String[] args) {
        int n1 = 70, n2 = 85, n3 = 90;
        int toplam = n1 + n2 + n3;
        double o1 = toplam / 3;
        double o2 = toplam / 3.0;
        double o3 = (double) (toplam / 3);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println((double) toplam / 3);   // diger duzeltme
    }
}
