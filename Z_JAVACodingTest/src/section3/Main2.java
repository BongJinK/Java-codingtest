package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
	// �ڡڡڡڡڡ� x 100
	// �ڡڡڡڡڡ� x 100
	// ������� ���ϱ�
	// A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ�
	// ù ��° �ٿ� ���� A�� ũ�� N(1<=N<="30,000")�� �־����ϴ�.
	// �� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
	// �� ��° �ٿ� ���� B�� ũ�� M(1<=M<="30,000")�� �־����ϴ�.
	// �� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
	// �� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
	// �� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.

	// 5
	// 1 3 9 5 2
	// 5
	// 3 2 5 7 8

	// i�� j��� ������ ����ϱ�

	public String sol(int n, int m, String ar1, String ar2) {
		Set<Integer> set = new TreeSet<>();

		for (String x : ar1.split(" "))
			set.add(Integer.parseInt(x));

		List<Integer> list = new ArrayList<Integer>();
		for (String x : ar2.split(" ")) {
			int tmp = Integer.parseInt(x);
			if (set.contains(tmp))
				list.add(tmp);
		}

		list.sort(Comparator.naturalOrder());
		StringBuilder str = new StringBuilder("");
		for (Integer x : list)
			str.append(x + " ");

		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main2 t = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String t1 = br.readLine();
		int m = Integer.parseInt(br.readLine());
		String t2 = br.readLine();

		System.out.println(t.sol(n, m, t1, t2));
		br.close();
	}

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int input1 = in.nextInt();
//		Set<Integer> arr1 = new HashSet<>();
//		for (int i = 0; i < input1; i++) {
//			arr1.add(in.nextInt());
//		}
//
//		int input2 = in.nextInt();
//		List<Integer> answer = new ArrayList();
//		for (int i = 0; i < input2; i++) {
//			int tmp = in.nextInt();
//			if (arr1.contains(tmp)) {
//				answer.add(tmp);
//			}
//		}
//
//		Collections.sort(answer);
//		for (int ans : answer) {
//			System.out.print(ans + " ");
//		}
//	}
}
