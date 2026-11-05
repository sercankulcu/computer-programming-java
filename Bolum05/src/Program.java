/*
 * Java dosyasinin yapisi: package -> import -> class (Java'ya Giris: "Java Dosyasinin Yapisi";
 * Calisma Sorulari 7). Ornekler varsayilan pakette oldugu icin package satiri yorum olarak duruyor;
 * etkin olsaydi dosya okul/ klasorunde durur ve "java okul.Program" ile calisirdi. Beklenen: Merhaba
 */
// package okul;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner klavye = new Scanner("");   // import edilen sinif kullanilabilir
        System.out.println("Merhaba");
        klavye.close();
    }
}
