/*
 * static olmayan metot (Slayt 9, Calisma Sorusu 4): static main, nesne olmadan
 * static olmayan selamla()'yi dogrudan cagiramaz -> derleme hatasi:
 * "non-static method selamla() cannot be referenced from a static context".
 * Iki cozum gosterilir. Beklenen cikti: "Merhaba" iki kez
 */
public class Ornek {

    void selamla() {
        System.out.println("Merhaba");
    }

    static void selamlaStatic() {
        System.out.println("Merhaba");
    }

    public static void main(String[] args) {
        // selamla();            // HATA: static baglamdan static olmayan metot

        new Ornek().selamla();   // cozum 1: nesne olustur
        selamlaStatic();         // cozum 2: metodu static yap
    }
}
