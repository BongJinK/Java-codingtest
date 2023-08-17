package section7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	int data; // Node number;
	Node lt, rt; // ����, ������ �ڽ��� Node����

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Main05 {
	// DFS : Depth-First-Search
	// ����Ʈ�� ��ȸ(���̿켱Ž��)
	// �Ʒ� �׸��� ���� ����Ʈ���� ������ȸ�� ������ȸ�� �����غ�����.
	// lv1 --------- 1
	// lv2 --- 2 -------- 3
	// lv3 - 4 -- 5 --- 6 -- 7

	// ������ȸ ��� : 1 2 4 5 3 6 7 : Root - Left - Right
	// ������ȸ ��� : 4 2 5 1 6 3 7 : Left - Root - Right
	// ������ȸ ��� : 4 5 2 6 7 3 1 : Left - Right - Root

	Node root;

	public void DFS(Node root) {
		if (root == null)
			return;
		else {
			// ������ȸ
			// System.out.print(root.data + " ");
			DFS(root.lt);
			// ������ȸ
			System.out.print(root.data + " ");
			DFS(root.rt);
			// ������ȸ
			// System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		// tree��� �̸��� Main class ��ü
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
