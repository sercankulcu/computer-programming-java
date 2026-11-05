// Karakter frekansi: int[26] dizisinde c - 'a' indisi ile sayma
// (Slayt: Karakter Frekansi (int[26]); Calisma Sorusu 28).
// Beklenen cikti: "a: 2", "k: 2", "v: 1"; Soru 28: "a3 n2 s1".
public class KarakterFrekansi {

	public static void main(String[] args) {
		String s = "kavak";
		int[] frekans = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			frekans[c - 'a']++;          // 'a' -> 0, 'b' -> 1, ...
		}
		for (int k = 0; k < 26; k++)
			if (frekans[k] > 0)
				System.out.println((char) ('a' + k)
						+ ": " + frekans[k]);

		// Soru 28
		String t = "ananas";
		int[] frekans2 = new int[26];
		for (int i = 0; i < t.length(); i++)
			frekans2[t.charAt(i) - 'a']++;
		for (int k = 0; k < 26; k++)
			if (frekans2[k] > 0)
				System.out.print((char) ('a' + k) + "" + frekans2[k] + " ");
		System.out.println();
	}
}
