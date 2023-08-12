package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08 {

	// À¯È¿ÇÑ ÆÓ¸°µå·Ò
	// ¾Õ¿¡¼­ ÀĞÀ» ¶§³ª µÚ¿¡¼­ ÀĞÀ» ¶§³ª °°Àº ¹®ÀÚ¿­À» ÆÓ¸°µå·ÒÀÌ¶ó°í ÇÕ´Ï´Ù.
	// ¹®ÀÚ¿­ÀÌ ÀÔ·ÂµÇ¸é ÇØ´ç ¹®ÀÚ¿­ÀÌ ÆÓ¸°µå·ÒÀÌ¸é "YES", ¾Æ´Ï¸é ¡°NO"¸¦ Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇÏ¼¼¿ä.
	// ´Ü È¸¹®À» °Ë»çÇÒ ¶§ ¾ËÆÄºª¸¸ °¡Áö°í È¸¹®À» °Ë»çÇÏ¸ç, ´ë¼Ò¹®ÀÚ¸¦ ±¸ºĞÇÏÁö ¾Ê½À´Ï´Ù.
	// ¾ËÆÄºª ÀÌ¿ÜÀÇ ¹®ÀÚµéÀÇ ¹«½ÃÇÕ´Ï´Ù.
	// ^ : not
	// [a-z] : ¾ËÆÄºª ¼Ò¹®ÀÚ
	// [A-Z] : ¾ËÆÄºª ´ë¹®ÀÚ
	// [0-9] : ¼ıÀÚ
	// [¤¡-¤¾ ¤¿-¤Ó °¡-ÆR] : ÇÑ±Û
	// 0 ~ 9 : 48~57 [ASCII CODE]

	public String solution(String text) {
		text = text.replaceAll("[^a-zA-Z]", "");
		String test = new StringBuilder(text).reverse().toString();
		if (text.equalsIgnoreCase(test))
			return "YES";
		return "NO";
	}

	public static void main(String[] args) throws IOException {
		Main08 t8 = new Main08();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		text = "found7, time: study; Yduts; emit, 7Dnuof";
		System.out.println(t8.solution(text));
		br.close();
	}
}
