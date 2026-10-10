/*
 * switch ifadesinde blok ve yield: blok icinden deger dondurmek icin yield kullanilir
 * (Slayt 26, Calisma Sorusu 29).
 * Beklenen cikti: 2024 icin "Subat" ve 29, 2023 icin "Subat" ve 28
 */
public class SwitchYield {

    public static void main(String[] args) {
        int[] yillar = {2024, 2023};
        for (int yil : yillar) {
            int ay = 2;
            int gun = switch (ay) {
                case 4, 6, 9, 11 -> 30;
                case 2 -> {
                    System.out.println("Subat");
                    yield yil % 4 == 0 ? 29 : 28;
                }
                default -> 31;
            };
            System.out.println(gun);
        }
    }
}
