package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main6 {
	// 6. �峭�ٷ���
	// ö���� �ݿ��� N���� �л����� �ֽ��ϴ�.
	// �� ��ȣ�� ���� �ֱ� ���� �� �л����� Ű�� ���� ���� �л����� �Ϸķ� Ű������ �������ϴ�.
	// ���� �տ� ���� ���� �л����� �� ��ȣ�� 1������ N������ �ο��մϴ�. ö���� ¦�Ẹ�� Ű�� Ů�ϴ�.
	// �׷��� ö���� �� ��ȣ�� �ް� �;� ¦��� �ڸ��� �ٲ���ϴ�.
	// �������� �� ����� �𸣰� �л��鿡�� ���ִ� ������� ��ȣ�� �ο��߽��ϴ�.
	// ö���� ¦���� �ڸ��� �ٲ� �� �л����� �Ϸķ� ���ִ� Ű ������ �־��� ��
	// ö���� ���� ��ȣ�� ö�� ¦���� ���� ��ȣ�� ���ʷ� ����ϴ� ���α׷��� �ۼ��ϼ���.

	// ù ��° �ٿ� �ڿ��� N(5<=N<=100)�� �־�����.
	// �� ��° �ٿ� ���� �տ����� �Ϸķ� ���ִ� �л����� Ű�� �־�����.
	// Ű(����) �� H�� (120<=H<=180)�� �ڿ��� �Դϴ�.
	// ù ��° �ٿ� ö���� �� ��ȣ�� ¦���� �� ��ȣ�� ���ʷ� ����մϴ�.

	// 9
	// 120 125 152 130 135 135 143 127 160
	// 3 8
	
	// ���� ���� : '���� ��'�� ���ο� �޸� ������ ���� �ϴ� ��
	// ���� ���� : '�ּ� ��'�� ����

	public static String sol(int n, int[] arr) {
		StringBuffer str = new StringBuffer("");
		int[] temp = arr.clone();
		Arrays.sort(temp);		

		for (int i = 0; i < n; i++) {
			if (arr[i] != temp[i])
				str.append(i + 1 + " ");
		}
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] h = br.readLine().split(" ");

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(h[i]);
		System.out.println(sol(n, arr));
	}
}
