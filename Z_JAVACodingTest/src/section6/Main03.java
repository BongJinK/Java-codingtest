package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// 3. ���� ���� [ ���� ���� : Max������ ]
	// �վ��� ī�带 �����ϴ� ����� �����ϴ�.
	// ���ο� ī�带 ������ ���ĵ� ī�� ������ �ùٸ� �ڸ��� ã�� �����Ѵ�.
	// ���� ���Ե� ī���� ����ŭ �ݺ��ϰ� �Ǹ� ��ü ī�尡 ���ĵȴ�.

	// N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// �����ϴ� ����� "���� ����"�Դϴ�.
	// ù ��° �ٿ� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
	// �� ��° �ٿ� N���� �ڿ����� ������ ���̿� �ΰ� �Էµ˴ϴ�.
	// �� �ڿ����� ������ ���� �ȿ� �ֽ��ϴ�.
	// ������������ ���ĵ� ������ ����մϴ�.

	// 6
	// 13 5 11 7 23 15

	public static String sol(int n, int[] arr) {
		StringBuilder str = new StringBuilder("");

		for (int i = 1; i < n; i++) {
			// ���Դ�� : target
			int target = arr[i];
			// i-1������ ���� �� ������ �����ϹǷ� i-1���� ���� Ž��
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > target)
					arr[j + 1] = arr[j];
				else
					break;
			}
			arr[j + 1] = target;
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
