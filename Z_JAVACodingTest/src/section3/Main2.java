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
	// ★★★★★★ x 100
	// ★★★★★★ x 100
	// 공통원소 구하기
	// A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성
	// 첫 번째 줄에 집합 A의 크기 N(1<=N<="30,000")이 주어집니다.
	// 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
	// 세 번째 줄에 집합 B의 크기 M(1<=M<="30,000")이 주어집니다.
	// 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
	// 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
	// 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

	// 5
	// 1 3 9 5 2
	// 5
	// 3 2 5 7 8

	// i와 j라는 포인터 사용하기

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
