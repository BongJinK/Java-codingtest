package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {
	// �� �迭 ��ġ��
	// ������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷�
	// ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.
	// �� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�.
	// �� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.
	// �� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�.
	// �� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.
	// ������������ ���ĵ� �迭�� ����մϴ�.

	public String sol(int l1, int l2, String ar1, String ar2) {
		List<Integer> ans = new ArrayList<>();
		for (String x : ar1.split(" "))
			ans.add(Integer.parseInt(x));
		for (String x : ar2.split(" "))
			ans.add(Integer.parseInt(x));
	
		ans.sort(Comparator.naturalOrder());
		StringBuilder str = new StringBuilder("");
		for (Integer x : ans)
			str.append(x + " ");
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main1 t = new Main1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l1 = Integer.parseInt(br.readLine());
		String r1 = br.readLine();
		int l2 = Integer.parseInt(br.readLine());
		String r2 = br.readLine();

		System.out.println(t.sol(l1, l2, r1, r2));
		br.close();
	}
}
