package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
	// ���츮
	// ���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
	// �� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�.
	// ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	// ������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
	// ���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.

	//	5
	//	5 3 7 2 3
	//	3 7 1 6 1
	//	7 2 5 3 4
	//	4 3 6 4 1
	//	8 7 3 5 2

	public int solution(int n, int[][] arr) {
		int count = 0;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				int tar = arr[i][j];
				if (tar > arr[i - 1][j] && tar > arr[i][j - 1] && tar > arr[i + 1][j] && tar > arr[i][j + 1])
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		Main10 t10 = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 2][n + 2];

		for (int i = 1; i < n + 1; i++) {
			String[] t = br.readLine().split(" ");
			for (int j = 1; j < n + 1; j++)
				arr[i][j] = Integer.parseInt(t[j - 1]);
		}

		System.out.println(t10.solution(n, arr));
		br.close();
	}
}