package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main05 {
	// 5. �ߺ� Ȯ��
	// ������ �ݿ��� N���� �л����� �ֽ��ϴ�.
	// �������� �� �л��鿡�� 1���� 10,000,000������ �ڿ��� �߿���
	// ���ڰ� �����ϴ� ���� �ϳ� ���� ����� �߽��ϴ�.
	// ���� N���� �л����� ��� ���� �� �ߺ��� ���ڰ� �����ϸ� D(duplication)�� ����ϰ�,
	// N���� ��� ���� �ٸ� ���ڸ� ����´ٸ� U(unique)�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù ��° �ٿ� �ڿ��� N(5<=N<=100,000)�� �־�����.
	// �� ��° �ٿ� �л����� ���� �� N���� �ڿ����� �Էµȴ�.
	// ù ��° �ٿ� D �Ǵ� U�� ����Ѵ�.

	// 8
	// 20 25 52 30 39 33 43 33

	public static String sol(int n, int[] arr) {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < n; i++)
			s.add(arr[i]);

		if (s.size() == n)
			return "U";
		return "D";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] tmp = br.readLine().split(" ");

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(tmp[i]);

		System.out.println(sol(n, arr));
		br.close();
	}
}
