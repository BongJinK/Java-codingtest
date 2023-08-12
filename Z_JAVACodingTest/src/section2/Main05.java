package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
	// �Ҽ�(�����佺�׳׽� ü)
	// �ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
	// ���ѽð��� 1���Դϴ�.
	// ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.

	public int solution(int len) {
		int[] arr = new int[len + 1];
		int count = 0;

		for (int i = 2; i <= len; i++) {
			if (arr[i] == 0) {
				count++;
				for (int j = i; j <= len; j += i) {
					if (arr[j] == 0)
						arr[j] = 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Main05 t5 = new Main05();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		
		System.out.println(t5.solution(len));
		br.close();
	}
}
