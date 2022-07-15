package net.devstudi.jre.lection02_inheritance_polymorph;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class Item {
	private Item next;
	private int value;

	Item(int value) {
		this.value = value;
	}

	Item getNext() {
		return next;
	}

	void setNext(Item next) {
		this.next = next;
	}

	int getValue() {
		return value;
	}
}
