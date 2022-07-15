package net.devstudi.jre.lection02_inheritance_polymorph;

import java.util.Arrays;

public class DynaArray extends DataSet {
	private int[] array;

	public DynaArray() {
		array = new int[10];
		size = 0;
	}

	public void add(int element) {
		if (size == array.length) {
			int[] temp = array;
			array = new int[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i];
			}
		}
		array[size++] = element;
	}

	/**
	 * Добавить метод int remove(int index), который удалит элемент из динамического
	 * массива по индексу и вернет удаленный элемент;
	 * 
	 * @param index
	 * @return
	 */
	@Override
	public int remove(int index) {
		
		int result = array[index];
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		array[size - 1] = 0;
		size--;
		return result;
	}

	@Override
	public int get(int index) {
		if (index < size) {
			return array[index];
		} else {
			return 0;
		}
	}

	@Override
	public void clear() {
		super.clear();
		array = new int[10];
	}

	@Override
	public int[] toArray() {
		return Arrays.copyOf(array, size);
	}
	
	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("arr " + i + " = " + array[i]);
		}
	}
}
