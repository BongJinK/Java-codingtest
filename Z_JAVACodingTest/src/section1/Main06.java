package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	// �ߺ���������
	// �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.

	public String solution(String text) {
		String answer = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.indexOf(text.charAt(i)) == i)
				answer += text.charAt(i);
		}
		return answer;
	}

//	public String solution(String text) {
//		String answer = "";
//		for(char x : text.toCharArray()) {
//			if( !answer.contains(String.valueOf(x)) )
//				answer += x;
//		}
//		return answer;
//	}

	public static void main(String[] args) throws IOException {
		Main06 t6 = new Main06();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		System.out.println(t6.solution(t));
		br.close();
	}
}
