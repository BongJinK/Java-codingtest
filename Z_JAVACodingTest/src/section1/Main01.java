package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
	// ���� ã��
	// �� ���� ���ڿ��� �Է¹ް� Ư�� ���ڸ� �Է¹޾�,
	// �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	// ��ҹ��ڸ� �������� �ʽ��ϴ�.
	// ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

	public int solution(String text, char c) {
		int answer = 0;
		text = text.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (char x : text.toCharArray()) {
			if (x == c)
				answer++;
		}
		return answer;
	}
	
	public int sol(String text, char c) {
		int answer = 0;
		text = text.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (char x : text.toCharArray()) {
			if (x == c)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main01 t = new Main01();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		char c = br.readLine().charAt(0);

		System.out.println(t.solution(text, c));
		br.close();
	}
}
