package section7;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	int data;
	Node2 lt, rt;

	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Main09 {
	// Tree 말단 노드까지의 가장 짧은 경로
	// 아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중
	// 가장 짧은 길이를 구하는 프로그램을 작성하세요.
	// 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수
	// 즉 간선(에지)의 개수를 길이로 하겠습니다.

	// lv1 --------- 1
	// lv2 --- 2 -------- 3
	// lv3 - 4 -- 5
	// 가장 짧은 길이는 3번 노느까지의 길이인 1이다

	Node2 root;

	// BFS : Breadth-First-Search
	public static void SPS(Node2 root) {
		int answer = Integer.MAX_VALUE;
		int level = 0;
		Queue<Node2> Q = new LinkedList<>();
		Q.offer(root);

		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				Node2 temp = Q.poll();
				if (temp.lt != null)
					Q.offer(temp.lt);
				else
					answer = Math.min(answer, level + 1);
				if (temp.rt != null)
					Q.offer(temp.rt);
				else
					answer = Math.min(answer, level);
			}
			level++;
		}
		System.out.println(answer);
	}
	
	// DFS : Depth-First-Search
	// 재귀방법 복습하자요
	public static int DFS(int level, Node2 root) {
		if (root.lt == null && root.rt == null)
			return level;
		else
			return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
	}

	public static void main(String[] args) {
		Main09 tree = new Main09();

		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);

		SPS(tree.root);
		System.out.println(DFS(0, tree.root));
	}
}
