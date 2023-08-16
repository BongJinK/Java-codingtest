package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
	// ����Լ�
	// �ڿ��� N�� �ԷµǸ� ����Լ��� �̿��Ͽ� 1���� N������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù ��° ���� ���� N(3<=N<=10)�� �Էµȴ�.
	// ù° �ٿ� ����Ѵ�.

	// 3
	// 1 2 3
	
	// ����Լ��� stack frame�� ����Ѵ�.
	// stack framed�� ȣ�� �޼����� ������ �����Ѵ�.
	// �� �Ű�����, ��������, �����ּ�[ó�� DFS(n)�� ȣ��Ǵ� ��ġ]
	
	// stack => D(n) D(n-1) D(n-2) .... D(1) �� ���δ�.
	// ����� D(1) D(2) .... D(n-1) D(n) ������ ���
	// �׷��Ƿ� DFS(n-1);
	// ���� print�ϸ� 3 2 1 �� ��µǰ� 
	// �Ʒ��� print�ϸ� 1 2 3 ���� ��� �ȴ�.
	
	public static void DFS(int n) {
		if( n == 0)
			return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		DFS(n);
		br.close();
	}

}
