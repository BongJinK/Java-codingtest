package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// ���� ���� ��
	// A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ�
	// A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.
	// ����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
	// ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
	// �� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.
	// �� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.
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
