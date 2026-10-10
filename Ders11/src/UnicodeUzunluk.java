// String UTF-16 kod birimlerinden (char) olusur: Turkce harf tek char, emoji iki char
// (Slayt: Unicode ve Metin).
// Kaynak ASCII kalsin diye karakterler \\u kacislariyla yazildi. Beklenen cikti: "3", "2 1".
public class UnicodeUzunluk {

	public static void main(String[] args) {
		String cay = "\u00E7ay";                    // "cay" (c cedilla ile)
		System.out.println(cay.length());           // 3

		String emoji = "\uD83D\uDE00";              // gulen yuz: iki char (UTF-16 cifti D83D DE00)
		System.out.println(emoji.length() + " " + emoji.codePointCount(0, emoji.length()));   // 2 1
		System.out.printf("%04X %04X%n", (int) emoji.charAt(0), (int) emoji.charAt(1));       // D83D DE00
	}
}
