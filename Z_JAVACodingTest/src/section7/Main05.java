package section7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	int data; // Node number;
	Node lt, rt; // 왼쪽, 오른쪽 자식의 Node정보

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Main05 {
	// DFS : Depth-First-Search
	// 이진트리 순회(깊이우선탐색)
	// 아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.
	// lv1 --------- 1
	// lv2 --- 2 -------- 3
	// lv3 - 4 -- 5 --- 6 -- 7

	// 전위순회 출력 : 1 2 4 5 3 6 7 : Root - Left - Right
	// 중위순회 출력 : 4 2 5 1 6 3 7 : Left - Root - Right
	// 후위순회 출력 : 4 5 2 6 7 3 1 : Left - Right - Root

	Node root;

	public void DFS(Node root) {
		if (root == null)
			return;
		else {
			// 전위순회
			// System.out.print(root.data + " ");
			DFS(root.lt);
			// 중위순회
			System.out.print(root.data + " ");
			DFS(root.rt);
			// 후위순회
			// System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		// tree라는 이름의 Main class 객체
		Main05 tree = new Main05();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
