package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	// ��ҹ��� ��ȯ
	// �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾�,
	// �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	// solution�� solution1 ���� 6ms �� ����

	public String solution1(String text) {
		String answer = "";
		for (char x : text.toCharArray()) {
			if (x >= 65 && x <= 90)
				answer += Character.toLowerCase(x);
			else if (x >= 97 && x <= 122) {
				answer += Character.toUpperCase(x);
			}
		}
		return answer;
	}

	public String solution(String text) {
		String ans = "";
		for (char x : text.toCharArray()) {
			if (Character.isUpperCase(x))
				ans += Character.toLowerCase(x);
			else
				ans += Character.toUpperCase(x);
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Main02 t = new Main02();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		System.out.println(t.solution(text));
		// System.out.println(solution(text));

		br.close();
	}
}
