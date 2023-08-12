package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	// �ܾ� ������
	// N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
	// �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�.
	// �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

	public void solution(String[] arr) {
		for (String str : arr) {
			String answer = new StringBuilder(str).reverse().toString();
			System.out.println(answer);
		}
	}

	public static void main(String[] args) throws IOException {
		Main04 t4 = new Main04();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];

		for (int i = 0; i < n; i++)
			arr[i] = br.readLine();

		t4.solution(arr);

		br.close();
	}
}
