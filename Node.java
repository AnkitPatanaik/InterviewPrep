public class Node {
	int data;
	Node left;
	Node right;

	public Node (int data) {
		this.data = data;
	}

	public Node insert(Node p, int toInsert) {
		//p == root
      	if (p == null)
        	return new Node(toInsert);

	    if (compare(toInsert, p.data) == 0)
      		return p;

        if (compare(toInsert, p.data) < 0)
            p.left = insert(p.left, toInsert);
        else
            p.right = insert(p.right, toInsert);

        return p;
    }

    public int compare(int x, int y) {
    	if (x == y) return 0;
    	else if (x > y) return 1;
    	else return -1;
    }



	//for debugging below

    public void inOrderTraversal(Node r) {
      if (r != null) {
	    inOrderTraversal(r.left);
	    System.out.print(r.data + " ");
	    inOrderTraversal(r.right);
        }
    }

    public static void main (String[] args) {
		Integer[] a = {1,5,2,7,4};
      	Node bst = new Node(0);
      	for(Integer n : a) bst.insert(bst, n);
      	bst.inOrderTraversal(bst);

      	//bfs(bst);
	}

}