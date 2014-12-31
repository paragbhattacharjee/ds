package bst;
import utils.*;

public class BST {
	
	public BinaryTreeNode Insert (BinaryTreeNode tree, BinaryTreeNode node) {
		if (tree == null) {
			return node;
		}
		
		if (node.Item > tree.Item) {
			tree.RightChild = this.Insert(tree.RightChild, node);
		}
		else {
			tree.LeftChild = this.Insert(tree.LeftChild, node);
		}
		return tree;
	}
	
	public void Delete () {
		
	}
	
	public void DisplayTree (BinaryTreeNode tree) {
		this.Traverse(tree);
	}
	
	private void Traverse (BinaryTreeNode tree) {
		if(tree == null)
			return;
		
		this.Traverse(tree.LeftChild);
		System.out.println(" " + tree.Item +" ");
		this.Traverse(tree.RightChild);
	}
	
	public void DisplaySmallest () {
		
	}
	
	public void DisplayLargest () {
		
	}
}
