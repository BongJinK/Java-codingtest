package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// 가위 바위 보
	// A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여
	// A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
	// 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
	// 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
	// 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
	// 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
	// 5
	// 2 3 3 1 3
	// 1 1 2 2 3

	private String solution(int length, int[] a, int[] b) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if (a[i] == b[i]) 
				str.append("D\n");
			else if (a[i] == 1 && b[i] == 3) 
				str.append("A\n");
			else if ((a[i] == 3 && b[i] == 2) || (a[i] == 2 && b[i] == 1)) 
				str.append("A\n");
			else 
				str.append("B\n");
		}
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main03 t3 = new Main03();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		int[] a = new int[length];
		int[] b = new int[length];
		String[] aa = br.readLine().split(" ");
		String[] bb = br.readLine().split(" ");

		for (int i = 0; i < length; i++) {
			a[i] = Integer.parseInt(aa[i]);
			b[i] = Integer.parseInt(bb[i]);
		}
		
		System.out.println(t3.solution(length, a, b));
		br.close();

	}
}
