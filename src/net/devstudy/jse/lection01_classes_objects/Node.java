package net.devstudy.jse.lection01_classes_objects;

public class Node {
	private Node next;
	private int value;

	public Node(int value) {
		this.value = value;
		next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}
}
