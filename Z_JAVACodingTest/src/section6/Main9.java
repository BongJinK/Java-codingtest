package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main9 {
	// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	// 9. ��������(�����˰���)
	// DVD���� �� N���� ���� ���µ�, DVD�� ��ȭ�� ������ ���̺꿡���� ������ �״�� �����Ǿ�� �Ѵ�.
	// ������ �ٲ�� ���� �츮�� ���� �����ʾ��� �ſ� �Ⱦ��Ѵ�.
	// ��, 1�� �뷡�� 5�� �뷡�� ���� DVD�� ��ȭ�ϱ� ���ؼ���
	// 1���� 5�� ������ ��� �뷡�� ���� DVD�� ��ȭ�ؾ� �Ѵ�.
	// ���� �� �뷡�� �ɰ��� �� ���� DVD�� ��ȭ�ϸ� �ȵȴ�.
	// ���Ϸ��ڵ� ���忡���� �� DVD�� �ȸ� ������ Ȯ���� �� ���� ������
	// �� ����� ����Ǵ� DVD�� ������ ���̷��� �Ѵ�.
	// ��� ���� ���Ϸ��ڵ�� M���� DVD�� ��� �������� ��ȭ�ϱ�� �Ͽ���.
	// �� �� DVD�� ũ��(��ȭ ������ ����)�� �ּҷ� �Ϸ��� �Ѵ�.
	// �׸��� M���� DVD�� ��� ���� ũ�⿩�� ���������� ���� ��� ������ �� ���� ũ��� �ؾ� �Ѵ�.
	// ù° �ٿ� �ڿ��� N(1��N��1,000), M(1��M��N)�� �־�����.
	// ���� �ٿ��� �������� ���̺꿡�� �θ� ������� �θ� ���� ���̰� �� ������(�ڿ���) �־�����.
	// �θ� ���� ���̴� 10,000���� ���� �ʴ´ٰ� ��������.

	// ù ��° �ٺ��� DVD�� �ּ� �뷮 ũ�⸦ ����ϼ���.
	// 9 3
	// 1 2 3 4 5 6 7 8 9

	// ���� �˰���
	// ������ ���� ���� ���ư�~
	// ���� �˰����� �Ҷ� ���̴� �˻� ��� : �̺а˻����
	// �ּڰ� : data�� �ִ� [lt]
	// �ִ� : data�� ���� [rt]

	// Stream ���
	// Calculating ���� .count(), .sum(), .min(), .max() �̾Ƴ��� �ִ�.
	// �⺻ �ڷ����� �������� �����Ƿ� .getAsInt()�� ��ȯ ������Ѵ�.
	// .sum()�� �⺻ �ڷ����� return���� [int, long ��]
	// .filter(x -> x%2 == 0) �� �ϸ� ¦���� ���͸�
	public static int sol(int n, int m, int[] arr) {
		int answer = 0;
		// Stream ��� : line.36
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (count(arr, mid) > m)
				lt = mid + 1;
			else {
				answer = mid;
				rt = mid - 1;
			}
		}
		return answer;
	}

	public static int count(int[] arr, int capacity) {
		int cnt = 1;
		int sum = 0;

		for (int x : arr) {
			if (sum + x <= capacity)
				sum += x;
			else {
				cnt++;
				sum = x;
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");
		String[] tmp = br.readLine().split(" ");

		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(tmp[i]);

		System.out.println(sol(n, m, arr));
		br.close();
	}
}
