import java.util.*;

public class GraphTraversal {

	//pop root of tree
	//while q is not empty
		//for each child, add to queue
		//print children
	
	public static void bfs (BST<Integer> tree) {
		LinkedList q = new Queue();  //queue is abstract
		Node<T> root = tree;
		q.add(root);

		while (!q.isEmpty()) {
			Node<T> node = q.pop();
	        System.out.print(node.element + " ");
	        if(node.left != null) q.add(node.left);
	        if(node.right != null) q.add(node.right);
		}

	}

	public static void main (String[] args) {
		Integer[] a = {1,5,2,7,4};
      	BST<Integer> bst = new BST<Integer>();
      	for(Integer n : a) bst.insert(n);
      	bst.inOrderTraversal();

      	bfs(bst);
	}
}
