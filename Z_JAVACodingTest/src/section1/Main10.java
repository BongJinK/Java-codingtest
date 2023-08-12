package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
	// �ڡڡ� : �տ��� ��ȸ 1ȸ, �ڿ��� ��ȸ 1ȸ
	// ���� ª�� ���ڰŸ�
	// �� ���� ���ڿ� s�� ���� t�� �־�����
	// ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���ڿ��� ���̴� 100�� ���� �ʴ´�.

	public int[] solution(String text, char c) {
		int[] arr = new int[text.length()];
		int length = 101;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c)
				length = 0;
			else {
				length++;
				arr[i] = length;
			}
		}

		length = 101;
		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) == c)
				length = 0;
			else {
				length++;
				arr[i] = Math.min(arr[i], length);
			}
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Main10 t10 = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String text = temp.split(" ")[0];
		char c = temp.split(" ")[1].charAt(0);
		for (int x : t10.solution(text, c))
			System.out.print(x + " ");
		br.close();
	}
}
