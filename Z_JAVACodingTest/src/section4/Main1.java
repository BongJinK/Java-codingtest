package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main1 {
	// 1. �б� ȸ��(�ؽ�)
	// �б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
	// ��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������
	// �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
	// �������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// �ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.
	// ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
	// �� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.
	// �б� ȸ������ ���õ� ��ȣ�� ����մϴ�.

	public static char sol(int n, char[] c) {
		Map<Character, Integer> map = new HashMap<>();
		char answer = 0;
		int max = Integer.MIN_VALUE;

		for (char x : c) {
			// �ڡڡڡڡ�
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		for (char key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}

//		for (Map.Entry<Character, Integer> e : map.entrySet()) {
//			if (e.getValue() > max) {
//				max = e.getValue();
//				answer = e.getKey();
//			}
//		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] c = br.readLine().toCharArray();

		System.out.println(sol(n, c));
	}
}
