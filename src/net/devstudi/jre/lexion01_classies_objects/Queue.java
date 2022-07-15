package net.devstudi.jre.lexion01_classies_objects;

public class Queue {
	private Node head;
	private int size;
	
	
	public Queue() {
		head = null;
		size = 0;
	}

	public void add(int element) {
		Node newNode = new Node(element);
		Node currentNode = head;
		
		if (head == null) {
			head = newNode;
		} else {
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
		size++;
	}

	public int get() {
		int result = head.getValue();
		head = head.getNext();
		size--;
		return result;
	}

	public int size() {
		return size;
	}
}
