package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
	// 1. ���� ���� [ ���� ���� : Min������ ]
	// �ּڰ� ã�� index 0 ���� n���� ���ʴ�� ����

	// N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// �����ϴ� ����� "��������"�Դϴ�.
	// ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
	// �� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�.
	// �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.
	// ������������ ���ĵ� ������ ����մϴ�.

	// 6
	// 13 5 11 7 23 15

	public static String sol(int n, int[] arr) {
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[idx] > arr[j])
					idx = j;
			}
			if (idx != -1) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}

		for (int x : arr)
			str.append(x + " ");
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] t = br.readLine().split(" ");

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(t[i]);

		System.out.println(sol(n, arr));
		br.close();
	}
}
