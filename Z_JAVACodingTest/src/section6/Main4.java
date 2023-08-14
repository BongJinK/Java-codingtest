package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
	// �ڡڡڡڡ�
	// 4. Least Recently Used
	// ĳ�ø޸𸮴� CPU�� �ֱ����ġ(DRAM) ������ ����� �ӽ� �޸𸮷μ�
	// CPU�� ó���� �۾��� ������ ���Ҵٰ� �ʿ��� �ٷ� ����ؼ� ó���ӵ��� ���̴� ��ġ�̴�.
	// ���� ��ΰ� �뷮�� �۾� ȿ�������� ����ؾ� �Ѵ�.
	// ö���� ��ǻ�ʹ� ĳ�ø޸� ��� ��Ģ�� LRU �˰����� ������.
	// LRU �˰����� Least Recently Used �� ���ڷ� �������ڸ�
	// ���� �ֱٿ� ������ ���� �� ������ �ǹ̸� ������ �ֽ��ϴ�.
	// ĳ�ÿ��� �۾��� ������ �� ���� �������� ������� ���� ���� �����ϰڴٴ� �˰����Դϴ�.

	// ĳ���� ũ�Ⱑ �־�����, ĳ�ð� ����ִ� ���¿��� N���� �۾���
	// CPU�� ���ʷ� ó���Ѵٸ� N���� �۾��� ó���� ��
	// ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʴ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù ��° �ٿ� ĳ���� ũ���� S(3<=S<=10)�� �۾��� ���� N(5<=N<=1,000)�� �Էµȴ�.
	// �� ��° �ٿ� N���� �۾���ȣ�� ó�������� �־�����. �۾���ȣ�� 1 ~100 �̴�.
	// ������ �۾� �� ĳ�ø޸��� ���¸� ���� �ֱ� ���� �۾����� ���ʷ� ����մϴ�.

	// 5 9
	// 1 2 3 2 6 2 3 5 7
	// 7 5 3 2 6

	public static String sol(int size, int n, int[] wn) {
		int[] cashe = new int[size];

		// �۾���ȣ ��ü ���鼭 ĳ�� �Է�
		// �Է� �۾��� ĳ�� ���� ���� �Ѵٸ�, �ش� �۾��� ���� ������ ���ġ
		// �Է� �۾��� ĳ�� ���� ���� ���� �ʴ´ٸ� ���� �տ� �� �Է�
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

		// �۾���ȣ ��ü ���鼭 ĳ�� �Է�
		// �Է� �۾��� ĳ�� ���� ���� �Ѵٸ�, �ش� �۾��� ���� ������ ���ġ
		// �Է� �۾��� ĳ�� ���� ���� ���� �ʴ´ٸ� ���� �տ� �� �Է�
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
