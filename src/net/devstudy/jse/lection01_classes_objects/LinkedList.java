package net.devstudy.jse.lection01_classes_objects;

public class LinkedList {
	private Node head;
	private int size;

	public LinkedList() {
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

	public boolean remove(int data) {
		boolean result = false;
		Node currentNode = head;
		Node previuosNode = null;
		
		while (currentNode.getNext() != null) {
			if (currentNode.getValue() == data) {
				if (currentNode == head) {
					head = currentNode.getNext();
				} else {
					previuosNode.setNext(currentNode.getNext());
				}
				result = true;
				size--;
				break;
			}
			previuosNode = currentNode;
			currentNode = currentNode.getNext();
		}
		return result;
	}

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
		head = null;
	}

	public int[] toArray() {
		Node currentNode = head;
		DynaArray array = new DynaArray();
		
		while (currentNode.getNext() != null) {
			array.add(currentNode.getValue());
		 	currentNode = currentNode.getNext();
		}
		
		return array.toArray();
	}

}
