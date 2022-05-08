package src.bstToRightSkewedTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BstToRightSkewedTree tree = new BstToRightSkewedTree();
		BstToRightSkewedTree.node = new Node(50);
		BstToRightSkewedTree.node.left = new Node(30);
		BstToRightSkewedTree.node.right = new Node(60);
		BstToRightSkewedTree.node.left.left = new Node(10);
		BstToRightSkewedTree.node.right.left = new Node(55);
        Node headNode = BstToRightSkewedTree.bstToSkewed(BstToRightSkewedTree.node);
        BstToRightSkewedTree.traverseRightSkewed(headNode);
	}

}
