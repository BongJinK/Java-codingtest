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
	// Tree ���� �������� ���� ª�� ���
	// �Ʒ� �׸��� ���� ����Ʈ������ ��Ʈ ��� 1���� ���ܳ������� ���� ��
	// ���� ª�� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���.
	// �� ����� ���̴� ��Ʈ��忡�� ���ܳ����� ���µ� �̵��ϴ� Ƚ��
	// �� ����(����)�� ������ ���̷� �ϰڽ��ϴ�.

	// lv1 --------- 1
	// lv2 --- 2 -------- 3
	// lv3 - 4 -- 5
	// ���� ª�� ���̴� 3�� ��������� ������ 1�̴�

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
	// ��͹�� �������ڿ�
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
