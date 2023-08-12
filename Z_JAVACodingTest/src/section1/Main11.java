package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
	// ���ڿ� ����
	// ���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ���,
	// �ݺ��Ǵ� ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// �� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
	// ���ڿ��� ���̴� 100�� ���� �ʴ´�.

	public String solution(String text) {
		StringBuilder str = new StringBuilder();
		char c = text.charAt(0);
		int count = 0;

		for (char x : text.toCharArray()) {
			if (x == c)
				count++;
			else {
				str.append(c);
				if (count != 1)
					str.append(count);
				c = x;
				count = 1;
			}
		}
		str.append(c);
		if (count != 1)
			str.append(count);
		return str.toString();
	}
	
	public String solution2(String text) {
		StringBuilder str = new StringBuilder("");
		text = text + " "; // �Ϳ�~~
		int cnt = 1;
		for(int i = 0; i < text.length()-1; i++) {
			if( text.charAt(i) == text.charAt(i+1)) 
				cnt++;
			else {
				str.append(text.charAt(i));
				if( cnt != 1)
					str.append(cnt + "");
				cnt = 1;
			}
		}
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main11 t11 = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		System.out.println(t11.solution(text));
		br.close();
	}
}
