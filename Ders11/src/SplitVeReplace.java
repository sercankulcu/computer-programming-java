// split, replace, replaceAll, replaceFirst, join, valueOf ve format
// (Slayt: split ve replace Adim Adim; replace, replaceAll, join, valueOf, format; Calisma Sorulari 13, 16, 30).
// Beklenen cikti: "[a, b, , c] 4", "aLi veLi", "ali veli"; tablo degerleri (bonono, bANANa, a#b#c#, ...);
// Soru 13: 4; Soru 16: "a-b-c3.5"; Soru 30: 3.
import java.util.Arrays;
import java.util.Locale;

public class SplitVeReplace {

	public static void main(String[] args) {
		String[] p = "a,b,,c".split(",");
		System.out.println(Arrays.toString(p) + " " + p.length); // [a, b, , c] 4
		String s = "ali veli";
		String t = s.replace('l', 'L');
		System.out.println(t); // aLi veLi
		System.out.println(s); // ali veli (s degismedi)

		System.out.println("banana".replace('a', 'o'));                    // bonono
		System.out.println("banana".replace("an", "AN"));                  // bANANa
		System.out.println("a1b22c333".replaceAll("[0-9]+", "#"));         // a#b#c#
		System.out.println("a1b22c333".replaceFirst("[0-9]+", "#"));       // a#b22c333
		System.out.println("Ada   Can  Ece".replaceAll(" +", " "));        // Ada Can Ece
		System.out.println(String.join(", ", "Ada", "Can", "Ece"));        // Ada, Can, Ece
		System.out.println(String.valueOf(3.5) + " / " + String.valueOf(new char[]{'h', 'i'}));  // 3.5 / hi
		System.out.println(String.format(Locale.US, "%.2f", 3.14159));     // 3.14
		System.out.println(String.format(Locale.US, "%5d|%-5d|%05d", 42, 42, 42));  //    42|42   |00042
		System.out.println(String.format(Locale.US, "%,d", 1234567));      // 1,234,567

		// Soru 13: ardisik iki virgulun arasi bos dizgi olarak diziye girer
		System.out.println("elma,armut,,kiraz".split(",").length);         // 4
		// Yalnizca sondaki bos parcalar atilir
		System.out.println("a,b,,".split(",").length);                     // 2

		// Soru 16
		System.out.println(String.join("-", "a", "b", "c") + String.valueOf(3.5));   // a-b-c3.5

		// Soru 30: " +" bir veya daha fazla bosluk
		String k = "  Ali ata  bak ";
		System.out.println(k.trim().split(" +").length);   // 3
		System.out.println(k.trim().split(" ").length);    // 4 (cift bosluk arasi bos parca)
	}
}
