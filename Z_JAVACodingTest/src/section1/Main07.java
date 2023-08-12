package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07 {

	// ȸ�� ���ڿ�
	// �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
	// ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ���
	// �ϴ� ���α׷��� �ۼ��ϼ���.
	// �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�

	public String solution(String text) {
		String temp = new StringBuilder(text).reverse().toString();
		if (text.equalsIgnoreCase(temp))
			return "YES";
		return "NO";
	}

	public static void main(String[] args) throws IOException {
		Main07 t7 = new Main07();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		System.out.println(t7.solution(text));

		br.close();
	}
	
	public String solution2(String text) {
		String answer = "YES";
		int len = text.length();
		text = text.toUpperCase();
		
		for(int i = 0; i < len/2; i++) {	
			if( text.charAt(i) != text.charAt(len-i-1)) {
				answer = "NO";
				break;
			}
		}
		return answer;
	}
}
