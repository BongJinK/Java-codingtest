package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10 {
	// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	// 10. ������ ���ϱ�(�����˰���)
	// N���� �������� �������� �ֽ��ϴ�.
	// �� �������� x1, x2, x3, ......, xN�� ��ǥ�� ������,
	// ������ ���� ��ǥ�� �ߺ��Ǵ� ���� �����ϴ�.

	// ������ C������ ���� ������ �ִµ�, �� ������ ���� ������ �ִ� ���� �������� �ʽ��ϴ�.
	// �� ���������� �� ������ ���� ���� �� �ְ�,
	// ���� ����� �� ���� �Ÿ��� �ִ밡 �ǰ� ���� �������� ��ġ�ϰ� �ͽ��ϴ�.

	// C������ ���� N���� �������� ��ġ���� �� ���� ����� �� ���� �Ÿ��� �ִ밡 �Ǵ�
	// �� �ִ밪�� ����ϴ� ���α׷��� �ۼ��ϼ���.

	// ù �ٿ� �ڿ��� N(3<=N<=200,000)�� C(2<=C<=N)�� ������ ���̿� �ΰ� �־����ϴ�.
	// ��° �ٿ� �������� ��ǥ xi(0<=xi<=1,000,000,000)�� ���ʷ� �־����ϴ�.
	// ù �ٿ� ���� ����� �� ���� "�ִ� �Ÿ�"�� ����ϼ���. distinct

	// 5 3
	// 1 2 8 4 9
	// 3

	public static int sol(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n - 1];

		while (lt <= rt) {
			int size = (lt + rt) / 2;

			if (checkSize(arr, size) == c) {
				answer = size;
				lt = size + 1;
			} else if (checkSize(arr, size) > 3)
				lt = size + 1;
			else
				rt = size - 1;
		}
		return answer;
	}

	public static int checkSize(int[] arr, int size) {
		int lastPoint = arr[0];
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (lastPoint + size <= arr[i]) {
				lastPoint = arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nc = br.readLine().split(" ");
		int n = Integer.parseInt(nc[0]);
		int c = Integer.parseInt(nc[1]);

		int[] arr = new int[n];
		String[] tmp = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(tmp[i]);

		System.out.println(sol(n, c, arr));
		br.close();
	}
}
