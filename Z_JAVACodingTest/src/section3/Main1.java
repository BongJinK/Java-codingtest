package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {
	// 두 배열 합치기
	// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
	// 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
	// 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
	// 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
	// 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
	// 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
	// 오름차순으로 정렬된 배열을 출력합니다.

	public String sol(int l1, int l2, String ar1, String ar2) {
		List<Integer> ans = new ArrayList<>();
		for (String x : ar1.split(" "))
			ans.add(Integer.parseInt(x));
		for (String x : ar2.split(" "))
			ans.add(Integer.parseInt(x));
	
		ans.sort(Comparator.naturalOrder());
		StringBuilder str = new StringBuilder("");
		for (Integer x : ans)
			str.append(x + " ");
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main1 t = new Main1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l1 = Integer.parseInt(br.readLine());
		String r1 = br.readLine();
		int l2 = Integer.parseInt(br.readLine());
		String r2 = br.readLine();

		System.out.println(t.sol(l1, l2, r1, r2));
		br.close();
	}
}
