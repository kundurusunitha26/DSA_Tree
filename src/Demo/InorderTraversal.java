package Demo;


public class InorderTraversal {
	static class Node{
		int data; 
		Node left;
		Node right;
		Node(int data) {
			this.data=data;
		}
	}
	static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
    public static void main(String[] args) {
    	Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(70);
		root.left.left=new Node(20);
		root.left.right=new Node(40);
		root.left.right.left=new Node(35);
		root.right.left=new Node(60);
		root.right.right=new Node(80);
		System.out.println("Inorder Traversal: ");
		inorder(root);
    }
}