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
	// 게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며
	// 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다.
	// (위 그림은 5 x 5 크기의 예시입니다.)
	// 각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다.
	// 모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.
	// 게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다.
	// 집어 올린 인형은 바구니에 쌓이게 되는 데, 이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.
	// 다음 그림은 [1번, 5번, 3번] 위치에서 순서대로 인형을 집어 올려 바구니에 담은 모습입니다.

	// 0 0 0 0 0 | 0
	// 0 0 0 0 0 | 0
	// 0 2 5 0 1 | 1
	// 0 2 4 4 2 | 3
	// 3 5 1 3 1 | 4
	// --------------

	// 만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면
	// 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.
	// 위 상태에서 이어서 [5번] 위치에서 인형을 집어 바구니에 쌓으면 같은 모양 인형 두 개가 없어집니다.

	// 0 0 0 0 0 | 0 | 0
	// 0 0 0 0 0 | 1 | 0
	// 0 2 5 0 0 | 1 | 0
	// 0 2 4 4 2 | 3 | 3
	// 3 5 1 3 1 | 4 | 4
	// ------------->>>--

	// 크레인 작동 시 인형이 집어지지 않는 경우는 없으나
	// 만약, 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다.
	// 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다.
	// (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)
	// 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해
	// 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
	// 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.

	// 첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
	// 두 번째 줄부터 N*N board 배열이 주어집니다.
	// board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
	// 0은 빈 칸을 나타냅니다.
	// 1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
	// board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
	// 마지막 줄에는 moves 배열이 주어집니다.
	// moves 배열의 크기는 1 이상 1,000 이하입니다.
	// moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.

	// 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.

	// 결과 계산
	// 1 5 3 5 1 2 1 4
	// 4[3[1 1]3]2 0 4
	// 4개

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
