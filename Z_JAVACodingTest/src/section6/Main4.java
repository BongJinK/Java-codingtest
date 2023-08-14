package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
	// ★★★★★
	// 4. Least Recently Used
	// 캐시메모리는 CPU와 주기억장치(DRAM) 사이의 고속의 임시 메모리로서
	// CPU가 처리할 작업을 저장해 놓았다가 필요할 바로 사용해서 처리속도를 높이는 장치이다.
	// 워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.
	// 철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.
	// LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면
	// 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
	// 캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.

	// 캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을
	// CPU가 차례로 처리한다면 N개의 작업을 처리한 후
	// 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.
	// 첫 번째 줄에 캐시의 크기인 S(3<=S<=10)와 작업의 개수 N(5<=N<=1,000)이 입력된다.
	// 두 번째 줄에 N개의 작업번호가 처리순으로 주어진다. 작업번호는 1 ~100 이다.
	// 마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력합니다.

	// 5 9
	// 1 2 3 2 6 2 3 5 7
	// 7 5 3 2 6

	public static String sol(int size, int n, int[] wn) {
		int[] cashe = new int[size];

		// 작업번호 전체 돌면서 캐시 입력
		// 입력 작업이 캐시 내에 존재 한다면, 해당 작업을 제일 앞으로 재배치
		// 입력 작업이 캐시 내에 존재 하지 않는다면 제일 앞에 값 입력
		for (int x : wn) {
			int i;
			for (i = 0; i < size; i++) {
				if (x == cashe[i]) {
					while (i != 0) {
						cashe[i] = cashe[i - 1];
						i--;
					}
					cashe[0] = x;
					break;
				}
			}

			if (i == size) {
				while (i > 1) {
					i--;
					cashe[i] = cashe[i - 1];
				}
				cashe[0] = x;
			}
		}

		StringBuilder str = new StringBuilder("");
		for (int x : cashe)
			str.append(x + " ");
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] sn = br.readLine().split(" ");
		int s = Integer.parseInt(sn[0]);
		int n = Integer.parseInt(sn[1]);

		int[] arr = new int[n];
		String[] wn = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(wn[i]);

		System.out.println(lectureSol(s, n, arr));
		br.close();
	}

	public static String lectureSol(int size, int n, int[] wn) {
		int[] cashe = new int[size];

		// 작업번호 전체 돌면서 캐시 입력
		// 입력 작업이 캐시 내에 존재 한다면, 해당 작업을 제일 앞으로 재배치
		// 입력 작업이 캐시 내에 존재 하지 않는다면 제일 앞에 값 입력
		for (int x : wn) {
			int idx = -1;
			for (int i = 0; i < size; i++) {
				if (x == cashe[i]) {
					idx = i;
					break;
				}
			}

			if (idx == -1) {
				for (int i = size - 1; i > 0; i--)
					cashe[i] = cashe[i - 1];
				cashe[0] = x;
			} else {
				for (int i = idx; i > 0; i--)
					cashe[i] = cashe[i - 1];
				cashe[0] = x;
			}
		}

		StringBuilder str = new StringBuilder("");
		for (int x : cashe)
			str.append(x + " ");
		return str.toString();
	}
}
