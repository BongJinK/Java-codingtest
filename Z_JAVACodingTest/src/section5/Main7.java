package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main7 {
	// 7. �������� ����
	// �����߿��� �ʼ������� �ֽ��ϴ�.
	// �� �ʼ������� �ݵ�� �̼��ؾ� �ϸ�, �� ������ ������ �ֽ��ϴ�.
	// ���� �� ������ A, B, C, D, E, F, G�� �ְ�,
	// ���⼭ �ʼ������� CBA�� �־����� �ʼ������� C, B, A�����̸�
	// �� ������� �� ������ȹ�� ¥�� �մϴ�.
	// ���⼭ ������ B������ C������ �̼��� �Ŀ� ���� �ϰ�,
	// A������ C�� B�� �̼��� �Ŀ� ���� �Ѵٴ� ���Դϴ�.
	// ������ C, B, D, A, G, E�� ������ȹ�� ¥�� ����� �� ����������
	// C, G, E, A, D, B ������ ®�ٸ� �� �� ����� ������ȹ�� �˴ϴ�.
	// ������ȹ�� �� ������� �տ� ������ �̼��Ǹ� ���� ������ �����ϴٴ� ������ �ؼ��մϴ�.
	// ������ȹ������ �� ������ ������ �̼��ȴٰ� �����մϴ�.
	// �ʼ���������� �־����� ������ § N���� �������谡 �ߵ� ���̸� ��YES",
	// �߸��� ���̸� ��NO���� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù �ٿ� �� �ٿ� �ʼ������� ������ �־����ϴ�. ��� ������ ���� �빮���Դϴ�.
	// �� �� ° �ٺ��� ������ § �������谡 �־����ϴ�.(���������� ���̴� 30�����̴�)
	// ù �ٿ� �������谡 �ߵ� ���̸� ��YES", �߸��� ���̸� ��NO���� ����մϴ�.

	public static String sol(String n, String lm) {
		Queue<Character> lms = new LinkedList<>();
		Queue<Character> check = new LinkedList<>();

		for (Character x : lm.toCharArray())
			lms.offer(x);
		for (Character x : n.toCharArray())
			check.offer(x);

		for (int i = 0; i < lm.length(); i++) {
			if (check.isEmpty())
				return "YES";
			if (lms.poll() == check.peek())
				check.poll();
			if (lms.isEmpty() && !check.isEmpty())
				return "NO";
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();
		String lm = br.readLine();

		System.out.println(sol(n, lm));
		br.close();
	}
}
