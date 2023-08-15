package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main8 {
	// 8. �̺а˻�
	// ������ N���� ���ڰ� �Է����� �־����ϴ�.
	// N���� ���� ������������ ������ ���� N���� �� �� �� ���� ���� M�� �־�����
	// �̺а˻����� M�� ���ĵ� ���¿��� �� ��°�� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
	// ��, �ߺ����� �������� �ʽ��ϴ�.
	// ù �ٿ� �� �ٿ� �ڿ��� N(3<=N<=1,000,000)�� M�� �־����ϴ�.
	// �� ��° �ٿ� N���� ���� ������ ���̿� �ΰ� �־����ϴ�.
	// ù �ٿ� ���� �� M�� ���� ��ġ ��ȣ�� ����Ѵ�.

	// 8 32
	// 23 87 65 12 57 32 99 81

	// Arrays.sort(arr, Collections.reverseOrder()); �������� ���� ������
	// �� �̶��� arr�� �����ڷ��� int�� �ƴ� ���� Ŭ������ Integer ����ؾ���
	// Integer >> Comparable �������̽� �����ؼ� ���

	public static int sol(int n, int m, int[] arr) {
		Arrays.sort(arr);
		int answer = -1;
		int lt = 0;
		int rt = n - 1;

		while (lt <= rt) {
			int search = (lt + rt) / 2;

			if (arr[search] == m) {
				answer = search + 1;
				break;
			} else if (arr[search] > m)
				rt = search - 1;
			else
				lt = search + 1;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		int[] arr = new int[n];
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);

		System.out.println(sol(n, m, arr));
		br.close();
	}
}
