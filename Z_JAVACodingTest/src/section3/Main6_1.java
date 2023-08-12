package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main6_1 {
	// ★★★★ 
	// 최대 길이 연속부분수열
	// 0과 1로 구성된 길이가 N인 수열이 주어집니다.
	// 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
	// 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의
	// 연속부분수열을 찾는 프로그램을 작성하세요.
	// 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
	// 1 1 0 0 1 1 0 1 1 0 1 1 0 1
	// 여러분이 만들 수 있는 1이 연속된 연속부분수열은
	// 1 1 0 0 [1 1 1 1 1 1 1 1] 0 1
	// 이며 길이는 8이다.
	
	// 내가 푼 방법 [0의 인덱스 배열 생성]
	public static int sol(int n, int k, List<Integer> list) {
		// System.out.println(list);
		int ans = 0, lp = 0, rp = 0;
		int len = 0;

		for (int i = 0; i < list.size() - k - 1; i++) {
			lp = list.get(i);
			rp = list.get(i + k + 1);
			len = rp - lp - 1;
			// System.out.println("lp : " + lp + " / rp : " + list.get(i + k));
			// System.out.println(len);
			ans = Math.max(ans, len);
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		String[] a = br.readLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (a[i].equals("0"))
				list.add(i);
		}
		list.add(0, -1);
		list.add(n);
		System.out.println(sol(n, k, list));
	}
}
