package bst;

import java.util.Scanner;

import utils.BinaryTreeNode;

public class BstMain {

	public static void main(String[] args) {
		Integer userInput = null;
		Scanner in = new Scanner(System.in);
		BST b = new BST();
		BinaryTreeNode Tree = null;
		while(true){
			System.out.println("***************** Binary Search Tree ****************");
			System.out.println("Enter operation you want to perform:");
			System.out.println("1:Insert Element");
			System.out.println("2:Delete Element");
			System.out.println("3:Display Tree");
			System.out.println("4:Display Smallest Element");
			System.out.println("4:Display Largest Element");
			System.out.println("0:Exit");
			userInput = Integer.getInteger(null, in.nextInt());
			if (userInput == 0) {
				break;
			}
			
			switch (userInput) {
				case 1:
					System.out.println("Enter the key to Insert.");
					BinaryTreeNode nodeToInsert = new BinaryTreeNode(Integer.getInteger(null, in.nextInt()));
					Tree = b.Insert(Tree, nodeToInsert);
					break;
					
				case 2:
					System.out.println("Enter the key to Delete.");
					break;
					
				case 3:
					System.out.println("Current Tree: ");
					b.DisplayTree(Tree);
					break;
		
				default:
					break;
			}
		}
	}

}
