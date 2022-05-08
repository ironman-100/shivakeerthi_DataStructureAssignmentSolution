package src.bstToRightSkewedTree;

class Node
	{
	    int val;
	    Node left, right;
	    
	    Node(int item)
	    {
	        val = item;
	        left = right = null;
	    }
	}
	
public class BstToRightSkewedTree {
	
	    public static Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	   
	    static Node bstToSkewed(Node root)
	    {
	       
	        if(root == null)
	        {
	            return null;
	        }
	       
	        
	        bstToSkewed(root.left);
	        
	        Node rightNode = root.right;
	       
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	       
	       
	        bstToSkewed(rightNode);
	        return headNode;
	    }
	   
	    static void traverseRightSkewed(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.val + " ");
	        traverseRightSkewed(root.right);       
	    }

	}
	

