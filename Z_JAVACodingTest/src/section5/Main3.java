package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main3 {
	// 0 0 0 0 0 | 0
	// 0 0 1 0 3 | 0
	// 0 2 5 0 1 | 0
	// 4 2 4 4 2 | 0
	// 3 5 1 3 1 | 0
	// --------------
	// ���� ȭ���� 1 x 1 ũ���� ĭ��� �̷���� N x N ũ���� ���簢 �����̸�
	// ���ʿ��� ũ������ �ְ� �����ʿ��� �ٱ��ϰ� �ֽ��ϴ�.
	// (�� �׸��� 5 x 5 ũ���� �����Դϴ�.)
	// �� ���� ĭ���� �پ��� ������ ��� ������ ������ ���� ĭ�� ��ĭ�Դϴ�.
	// ��� ������ 1 x 1 ũ���� ���� �� ĭ�� �����ϸ� ������ ���� �Ʒ� ĭ���� �������� �׿� �ֽ��ϴ�.
	// ���� ����ڴ� ũ������ �¿�� �������� ���� ��ġ���� ���� ���� �ִ� ������ ���� �ø� �� �ֽ��ϴ�.
	// ���� �ø� ������ �ٱ��Ͽ� ���̰� �Ǵ� ��, �̶� �ٱ����� ���� �Ʒ� ĭ���� ������ ������� ���̰� �˴ϴ�.
	// ���� �׸��� [1��, 5��, 3��] ��ġ���� ������� ������ ���� �÷� �ٱ��Ͽ� ���� ����Դϴ�.

	// 0 0 0 0 0 | 0
	// 0 0 0 0 0 | 0
	// 0 2 5 0 1 | 1
	// 0 2 4 4 2 | 3
	// 3 5 1 3 1 | 4
	// --------------

	// ���� ���� ����� ���� �� ���� �ٱ��Ͽ� �����ؼ� ���̰� �Ǹ�
	// �� ������ �Ͷ߷����鼭 �ٱ��Ͽ��� ������� �˴ϴ�.
	// �� ���¿��� �̾ [5��] ��ġ���� ������ ���� �ٱ��Ͽ� ������ ���� ��� ���� �� ���� �������ϴ�.

	// 0 0 0 0 0 | 0 | 0
	// 0 0 0 0 0 | 1 | 0
	// 0 2 5 0 0 | 1 | 0
	// 0 2 4 4 2 | 3 | 3
	// 3 5 1 3 1 | 4 | 4
	// ------------->>>--

	// ũ���� �۵� �� ������ �������� �ʴ� ���� ������
	// ����, ������ ���� ������ ũ������ �۵���Ű�� ��쿡�� �ƹ��� �ϵ� �Ͼ�� �ʽ��ϴ�.
	// ���� �ٱ��ϴ� ��� ������ �� �� ���� ��ŭ ����� ũ�ٰ� �����մϴ�.
	// (�׸������� ȭ��ǥ�� �������� 5ĭ������ ǥ���Ͽ���)
	// ���� ȭ���� ������ ���°� ��� 2���� �迭 board�� ������ ���� ����
	// ũ������ �۵���Ų ��ġ�� ��� �迭 moves�� �Ű������� �־��� ��,
	// ũ������ ��� �۵���Ų �� ��Ʈ���� ����� ������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���.

	// ù �ٿ� �ڿ��� N(5<=N<=30)�� �־����ϴ�.
	// �� ��° �ٺ��� N*N board �迭�� �־����ϴ�.
	// board�� �� ĭ���� 0 �̻� 100 ������ ������ ����ֽ��ϴ�.
	// 0�� �� ĭ�� ��Ÿ���ϴ�.
	// 1 ~ 100�� �� ���ڴ� ���� �ٸ� ������ ����� �ǹ��ϸ� ���� ���ڴ� ���� ����� ������ ��Ÿ���ϴ�.
	// board�迭�� ���� �����ٿ� moves �迭�� ���� M�� �־����ϴ�.
	// ������ �ٿ��� moves �迭�� �־����ϴ�.
	// moves �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
	// moves �迭 �� ���ҵ��� ���� 1 �̻��̸� board �迭�� ���� ũ�� ������ �ڿ����Դϴ�.

	// ù �ٿ� ��Ʈ���� ����� ������ ������ ����մϴ�.

	// ��� ���
	// 1 5 3 5 1 2 1 4
	// 4[3[1 1]3]2 0 4
	// 4��

	public static int sol(int n, int[][] board, int m, int[] moves) {
		int ans = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {
			int choice = moves[i] - 1;
			for (int j = 0; j < n; j++) {
				if (board[j][choice] != 0) {
					stack.push(board[j][choice]);
					board[j][choice] = 0;
					break;
				}
			}

			if (stack.size() >= 2 && stack.elementAt(stack.size() - 2) == stack.peek()) {
				stack.pop();
				stack.pop();
				ans += 2;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] tmp = br.readLine().split(" ");
			for (int j = 0; j < n; j++)
				board[i][j] = Integer.parseInt(tmp[j]);
		}

		int m = Integer.parseInt(br.readLine());
		int[] moves = new int[m];
		String[] tmp = br.readLine().split(" ");
		for (int i = 0; i < m; i++)
			moves[i] = Integer.parseInt(tmp[i]);

		System.out.println(sol(n, board, m, moves));
	}

	public static int improvedSolution(int n, int[][] board, int m, int[] moves) {
		int ans = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {
			int choice = moves[i] - 1;
			for (int j = 0; j < n; j++) {
				if (board[j][choice] != 0) {
					if (!stack.isEmpty() && stack.peek() == board[j][choice]) {
						stack.pop();
						ans += 2;
					} else {
						stack.push(board[j][choice]);
					}
					board[j][choice] = 0;
					break;
				}
			}
		}
		return ans;
	}
}
