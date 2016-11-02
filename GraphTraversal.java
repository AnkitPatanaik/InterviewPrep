import java.util.*;

public class GraphTraversal {

	//pop root of tree
	//while q is not empty
		//for each child, add to queue
		//print children
	
	public static void bfs (BST<Integer> tree) {


	}

	public static void main (String[] args) {
		Integer[] a = {1,5,2,7,4};
      	Node bst = new Node(0);
      	for(Integer n : a) bst.insert(bst, n);
      	bst.inOrderTraversal(bst);

      	//bfs(bst);
	}
}
