package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {
	// 격자판 최대합
	// N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

	// 5
	// 10 13 10 12 15
	// 12 39 30 23 11
	// 11 25 50 53 15
	// 19 27 29 37 27
	// 19 13 30 13 19
	// 155

	public int solution(int dimention, int[][] arr) {
		int sum = solutionRC(dimention, arr);
		sum = solutionDia(sum, dimention, arr);
		return sum;
	}

	public int solutionRC(int dimention, int[][] arr) {
		int sum = 0;
		for (int i = 0; i < dimention; i++) {
			int rS = 0;
			int cS = 0;
			for (int j = 0; j < dimention; j++) {
				rS += arr[i][j];
				cS += arr[j][i];
			}
			sum = Math.max(sum, rS);
			sum = Math.max(sum, cS);
		}
		return sum;
	}

	public int solutionDia(int sum, int dimention, int[][] arr) {
		int s = 0;
		int rS = 0;
		for (int i = 0; i < dimention; i++) {
			s += arr[i][i];
			rS += arr[i][dimention - i - 1];
		}
		sum = Math.max(sum, s);
		sum = Math.max(sum, rS);
		return sum;
	}

	public static void main(String[] args) throws IOException {
		Main09 t9 = new Main09();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int di = Integer.parseInt(br.readLine());
		int[][] arr = new int[di][di];
		for (int i = 0; i < di; i++) {
			String[] e = br.readLine().split(" ");
			for (int j = 0; j < e.length; j++)
				arr[i][j] = Integer.parseInt(e[j]);
		}

		System.out.println(t9.solution(di, arr));
		br.close();
	}

	public int sol(int dimention, int[][] arr) {
		int sum = 0;
		int diagonalL = 0;
		int diagonalR = 0;

		for (int i = 0; i < dimention; i++) {
			int rS = 0;
			int cS = 0;
			for (int j = 0; j < dimention; j++) {
				rS += arr[i][j];
				cS += arr[j][i];
				if (i == j)
					diagonalL += arr[i][j];
			}
			diagonalR += arr[i][dimention - i - 1];
			sum = Math.max(sum, rS);
			sum = Math.max(sum, cS);
		}
		sum = Math.max(sum, Math.max(diagonalL, diagonalR));
		return sum;
	}
}
