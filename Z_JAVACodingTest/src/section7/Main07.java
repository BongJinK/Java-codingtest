package section7;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	int data;
	Node1 lt, rt;

	public Node1(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Main07 {
	// BFS : Breadth-First-Search
	// 이진트리 순회 [ 넓이우선탐색 - 레벨탐색]
	// 아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.
	// lv1 --------- 1
	// lv2 --- 2 -------- 3
	// lv3 - 4 -- 5 --- 6 -- 7

	// 레벨 탐색 : 1 2 3 4 5 6 7

	// 레벨 탐색은 Queue이용

	Node root;

	private static void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);

		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if (cur.lt != null)
					Q.offer(cur.lt);
				if (cur.rt != null)
					Q.offer(cur.rt);
			}
		}
	}

	public static void main(String[] args) {
		Main07 tree = new Main07();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);

		BFS(tree.root);
	}
}
