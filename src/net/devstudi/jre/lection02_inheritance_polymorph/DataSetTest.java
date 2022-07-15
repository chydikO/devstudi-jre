package net.devstudi.jre.lection02_inheritance_polymorph;

public class DataSetTest {
	public static void main(String[] args) {
		final DataSet d = new LinkedList(); // new DynaArray();
		fillDataSet(d, 0, 4);
		System.out.println(d);
		System.out.println("size=" + d.size());
		d.remove(0);
		d.remove(0);
		System.out.println(d);
		System.out.println("size=" + d.size());
		d.clear(); // d = new LinkedList();
		fillDataSet(d, 0, 99);
		System.out.println(d.get(99));
		System.out.println(d.get(999));
		System.out.println(d.remove(99));
		System.out.println(d.remove(999));
	}

	private static void fillDataSet(DataSet d, int min, int max) {
		for (int i = min; i < max + 1; i++) {
			d.add(i);
		}
	}
}
