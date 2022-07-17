package net.devstudy.jse.lection01_classes_objects;

public class Stack {
	Node head;
	Node tail;
	int size;
	
	public Stack() {
		tail = null;
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
		}
		currentNode.setNext(newNode);
		tail.setNext(newNode);
		size++;
		
	}

	public int get() {
		return 0;
	}

	public int size() {
		return size;
	}
}
