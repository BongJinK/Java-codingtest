package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {
	// ���ڸ� ����
	// ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
	// ���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
	// �����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
	// 0 ~ 9 : 48~57 [ASCII CODE]
	// Character.isDigit(x)
	
	public String solution(String text) {
		String newText = text.replaceAll("[^0-9]", "");
		int answer = Integer.parseInt(newText);
		if( answer >= 100000000)
			return "";
		return String.valueOf(answer);
	}
	
	public int solution2(String text) {
		return Integer.parseInt(text.replaceAll("[^0-9]", ""));
	}
	
	public static void main(String[] args) throws IOException {
		Main09 t9 = new Main09();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		// text = "g0en2T0s8eSoft";
		System.out.println(t9.solution(text));
		br.close();
	}
}
