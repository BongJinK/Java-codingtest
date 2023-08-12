package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	// �Ǻ���ġ ����
	// 1) �Ǻ���ġ ������ ����Ѵ�.
	// �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
	// 2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�.
	// ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.

	public int[] solution(int seq) {
		int[] arr = new int[seq];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < seq; i++)
			arr[i] = arr[i - 2] + arr[i - 1];
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Main04 t4 = new Main04();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int seq = Integer.parseInt(br.readLine());

		for (Integer x : t4.solution(seq))
			System.out.print(x + " ");
		br.close();
	}
}
