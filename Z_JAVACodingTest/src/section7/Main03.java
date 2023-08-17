package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// ���丮��
	// �ڿ��� N�� �ԷµǸ� N!�� ���ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� ��� 5! = 5*4*3*2*1=120�Դϴ�.
	// ù ��° �ٿ� �ڿ��� N(1<=N<=10)�� �־����ϴ�.
	// ù ��° �ٿ� N���丮�� ���� ����մϴ�.

	// 5
	// 120

	// ����Լ� - ���丮�� : Stack Frame, DFS : ���� ��
	public static int DFS(int n) {
		if (n == 1)
			return 1;
		return n * DFS(n - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(DFS(n));
		br.close();
	}
}
