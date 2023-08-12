package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12 {
	// ������ ���񿡰� ���ĺ� �빮�ڷ� ������ ��������� ���� ��ǻ�͸� �̿��� �����ϴ�.
	// ��������� ������ ���� ���� ����� ��ȣ�� �����Ǿ� �ֽ��ϴ�.
	// ��������� ���ĺ� �� ���ڸ��� # �Ǵ� *�� �ϰ� ���� �����Ǿ� �ֽ��ϴ�.
	// ���� ������ ��#*****#������ ������ ���ڸ� ���´ٸ� ����� ������ ����� ��Ģ��� ������ ���� �ؼ��մϴ�.
	// 1. ��#*****#���� �ϰ��ڸ��� �������� �ٲߴϴ�. #�� �������� 1��, *�������� 0���� ��ȯ�մϴ�.
	// ����� ��1000001���� ��ȯ�˴ϴ�.
	// 2. �ٲ� 2������ 10����ȭ �մϴ�. ��1000001���� 10����ȭ �ϸ� 65�� �˴ϴ�.
	// 3. �ƽ�Ű ��ȣ�� 65���ڷ� ��ȯ�մϴ�. �� �ƽ�ũ��ȣ 65�� �빮�� 'A'�Դϴ�.
	// ����� �빮�ڵ��� �ƽ�Ű ��ȣ�� 'A'�� 65��, ��B'�� 66��, ��C'�� 67�� �� ���ʴ�� 1�� �����Ͽ� ��Z'�� 90���Դϴ�.
	// ������ 4���� ���ڸ� ������ ���� ��ȣ�� ���´ٸ�
	// #****###**#####**#####**##**
	// �� ��ȣ�� 4���� ���ڽ�ȣ�� �����ϸ�
	// #****## --> 'C'
	// #**#### --> 'O'
	// #**#### --> 'O'
	// #**##** --> 'L'
	// ���������� ��COOL"�� �ؼ��˴ϴ�.
	// ������ ���� ��ȣ�� �ؼ����ִ� ���α׷��� �ۼ��ؼ� ���� �����ּ���.
	// ù �ٿ��� ���� ������ ����(10�� ���� �Ƚ��ϴ�)�� �Էµȴ�.
	// ���� �ٿ��� ������ ������ �ϰ� �� ��ŭ�� #�Ǵ� * ��ȣ�� �Էµ˴ϴ�.
	// ������ �׻� �빮�ڷ� �ؼ��� �� �ִ� ��ȣ�� �����ٰ� �����մϴ�.

	public String solution(int length, String text) {
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < length; i++) {
			String t = text.substring(0, 7).replace('#', '1').replace('*', '0');
			str.append((char) Integer.parseInt(t, 2));
			text = text.substring(7);
		}
		return str.toString();
	}


	public static void main(String[] args) throws IOException {
		Main12 t12 = new Main12();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		String text = br.readLine();
		System.out.println(t12.solution(length, text));
		br.close();
	}
}
