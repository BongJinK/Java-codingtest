package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
	// �ִ� ����
	// N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.
	// ���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�.
	// �̶� K=3�̸�
	// 12 15 [11 20 25] 10 20 19 13 15
	// ���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
	// ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
	// �� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.

	public static int sol(int n, int day, List<Integer> list) {
		int max = 0;
		for (int i = 0; i < day; i++)
			max += list.get(i);

		int answer = max;
		for (int i = day; i < n; i++) {
			max += list.get(i) - list.get(i - day);
			answer = Math.max(answer, max);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nk = br.readLine();
		String sales = br.readLine();

		int n = Integer.parseInt(nk.split(" ")[0]);
		int day = Integer.parseInt(nk.split(" ")[1]);

		List<Integer> list = new ArrayList<>();
		for (String x : sales.split(" "))
			list.add(Integer.parseInt(x));

		System.out.println(sol(n, day, list));
	}
}
