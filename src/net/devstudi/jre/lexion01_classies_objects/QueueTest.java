package net.devstudi.jre.lexion01_classies_objects;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		for (int i = 0; i < 5; i++) {
			q.add(i);
		}
		while (q.size() > 0) {
			System.out.print(q.get() + " ");
		}
		System.out.println();
	}
}