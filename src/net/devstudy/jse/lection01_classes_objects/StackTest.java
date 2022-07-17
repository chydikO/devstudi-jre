package net.devstudy.jse.lection01_classes_objects;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		for (int i = 0; i < 5; i++) {
			s.add(i);
		}
		while (s.size() > 0) {
			System.out.print(s.get() + " ");
		}
		System.out.println();
	}

}
