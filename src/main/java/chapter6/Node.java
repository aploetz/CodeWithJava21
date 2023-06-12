package chapter6;

public class Node {

	private int number;
	private Node leftNode;
	private Node rightNode;
	
	public Node (int number) {
		this.number = number;
	}
	
	public void insert(int newNumber) {
		
		if (newNumber < this.number) {
			if (leftNode == null) {
				leftNode = new Node(newNumber);
			} else {
				leftNode.insert(newNumber);
			}
		} else if (newNumber > this.number) {
			if (rightNode == null) {
				rightNode = new Node(newNumber);
			} else {
				rightNode.insert(newNumber);
			}
		}
	}
	
	public Node getLeftNode() {
		return this.leftNode;
	}
	
	public Node getRightNode() {
		return this.rightNode;
	}
	
	public int getNumber() {
		return this.number;
	}
}
