import java.util.*;

public class GraphTraversal {

	//pop root of tree
	//while q is not empty
		//for each child, add to queue
		//print children
	
	public static void bfs (Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node a = q.poll();
			System.out.print(a.data + " ");
			if (a.left != null) {
				q.add(a.left);
				
			}
			if (a.right != null) {
				q.add(a.right);
				
			}

			System.out.println();
		}

	}

	public static void main (String[] args) {
		Integer[] a = {1,0,2,10,7,6,11,25,9,14};
      	Node bst = new Node(15);
      	for(Integer n : a) bst.insert(bst, n);
      	//bst.inOrderTraversal(bst);

      	bfs(bst);
	}
}
