// Kelime sayma: bosluktan harfe gecisleri sayma ve split(" +") ile sayma
// (Slayt: Kelime Sayma (bosluk gecisleri); Calisma Sorusu 30).
// Beklenen cikti: 3, 3
public class KelimeSayma {

	public static void main(String[] args) {
		String metin = "Ali  ata bak";
		int kelime = 0;
		boolean icinde = false;           // su an bir kelimenin icinde miyiz?
		for (int i = 0; i < metin.length(); i++) {
			char c = metin.charAt(i);
			if (c != ' ' && !icinde) {    // yeni kelime basladi
				kelime++;
				icinde = true;
			} else if (c == ' ') icinde = false;
		}
		System.out.println(kelime);       // 3

		// Soru 30: trim + split(" +")
		String s = "  Ali ata  bak ";
		System.out.println(s.trim().split(" +").length);   // 3
	}
}
