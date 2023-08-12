package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	// ���̴� �л�
	// �������� N���� �л��� �Ϸķ� �������ϴ�.
	// �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��,
	// �� �տ� �� �ִ� �������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
	// (� �л��� �ڱ� �տ� �� �ִ� �л��麸�� ũ�� �� �л��� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)
	// ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�.
	// �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
	// �������� �� �� �ִ� �ִ��л����� ����Ѵ�.
	// 8
	// 130 135 148 140 145 150 150 153
	// 5

	public String solution(int length, int[] arr) {
		int count = 1, standard = arr[0];
		for (int i = 1; i < length; i++) {
			if (standard < arr[i]) {
				count++;
				standard = arr[i];
			}
		}
		return String.valueOf(count);
	}

	public static void main(String[] args) throws IOException {
		Main02 t2 = new Main02();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String t = br.readLine();
		int[] arr = new int[length];
		String[] temp = t.split(" ");
		for (int i = 0; i < arr.length; i++) 
			arr[i] = Integer.parseInt(temp[i]);
		
		System.out.println(t2.solution(length, arr));
		br.close();
	}
}
