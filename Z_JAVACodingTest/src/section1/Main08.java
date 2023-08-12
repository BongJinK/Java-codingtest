package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08 {

	// ��ȿ�� �Ӹ����
	// �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
	// ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
	// ���ĺ� �̿��� ���ڵ��� �����մϴ�.
	// ^ : not
	// [a-z] : ���ĺ� �ҹ���
	// [A-Z] : ���ĺ� �빮��
	// [0-9] : ����
	// [��-�� ��-�� ��-�R] : �ѱ�
	// 0 ~ 9 : 48~57 [ASCII CODE]

	public String solution(String text) {
		text = text.replaceAll("[^a-zA-Z]", "");
		String test = new StringBuilder(text).reverse().toString();
		if (text.equalsIgnoreCase(test))
			return "YES";
		return "NO";
	}

	public static void main(String[] args) throws IOException {
		Main08 t8 = new Main08();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		text = "found7, time: study; Yduts; emit, 7Dnuof";
		System.out.println(t8.solution(text));
		br.close();
	}
}
