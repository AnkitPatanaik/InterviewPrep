import java.util.*;

public class GraphTraversal {

	/* Algorithm runs in O(n) time, where n is the number of nodes in the tree */
	public static void bfs (Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root); //enqueue

		while (!q.isEmpty()) {

			int levelSize = q.size();
			while (levelSize > 0) { // this loop is only needed to help print level by level

				Node a = q.poll(); //pop
				System.out.print(a.data + " ");

				if (a.left != null) {
					q.add(a.left);
				}
				if (a.right != null) {
					q.add(a.right);
				}
				levelSize--;
			}
			System.out.println();
		}
	}

	public static void main (String[] args) {
		Integer[] a = {3,0,2,15,7,6,11,25,9,14};
      	Node bst = new Node(10);
      	for(Integer n : a) bst.insert(bst, n);
      	//bst.inOrderTraversal(bst);

      	bfs(bst);
	}
}
