package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
	// �ڡڡڡڡ�
	// Ư�� ���� ������
	// ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
	// Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

	public String solution(String text) {
		int lt = 0;
		int rt = text.length() - 1;
		char[] arr = text.toCharArray();

		while (lt < rt) {
			if (!Character.isAlphabetic(arr[lt]))
				lt++;
			else if (!Character.isAlphabetic(arr[rt]))
				rt--;
			else {
				char temp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = temp;
				lt++;
				rt--;
			} 
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) throws IOException {
		Main05 t5 = new Main05();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test = br.readLine();

		System.out.println(t5.solution(test));
		br.close();
	}	
}
