package net.devstudi.jre.lection02_inheritance_polymorph;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class LinkedList extends DataSet {
	private Item first;

	@Override
	public void add(int element) {
		if (size == 0) {
			first = new Item(element);
		} else {
			Item item = new Item(element);
			Item last = findItem(size - 1);
			last.setNext(item);
		}
		size++;
	}

	private Item findItem(int index) {
		int i = 0;
		Item current = first;
		while (i < size) {
			if (i == index) {
				return current;
			} else {
				i++;
				current = current.getNext();
			}
		}
		return null;
	}

	@Override
	public int get(int index) {
		Item current = findItem(index);
		return current != null ? current.getValue() : 0;
	}

	@Override
	public int remove(int index) {
		if (index == 0) {
			Item current = first;
			first = first.getNext();
			decrementSize();
			return current.getValue();
		} else {
			Item prevToRemove = findItem(index - 1);
			Item current = prevToRemove.getNext();
			prevToRemove.setNext(current.getNext());
			decrementSize();
			return current.getValue();
		}
	}

	private void decrementSize() {
		size--;
		if (size == 0) {
			first = null;
		}
	}

	@Override
	public void clear() {
		super.clear();
		first = null;
	}

	@Override
	public int[] toArray() {
		int[] array = new int[size];
		int i = 0;
		Item current = first;
		while (i < size) {
			array[i++] = current.getValue();
			current = current.getNext();
		}
		return array;
	}
}
