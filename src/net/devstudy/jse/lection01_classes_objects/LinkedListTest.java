package net.devstudy.jse.lection01_classes_objects;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		list.remove(2);
		System.out.println(list.toArray());
		for (int i = 0; i < list.toArray().length; i++) {
			System.out.println("arr " + i + " = " + list.toArray()[i]);
		}
		
	}

}
