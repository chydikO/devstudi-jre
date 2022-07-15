package net.devstudi.jre.lexion01_classies_objects;

import java.util.Arrays;

public class DynaArray {
	private int[] array;
	private int size;

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
	public int remove(int index) {
		
		int result = array[index];
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		array[size - 1] = 0;
		size--;
		return result;
	}

	public int get(int index) {
		return array[index];
	}

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
		array = new int[10];
	}

	public int[] toArray() {
		return Arrays.copyOf(array, size);
	}
	
	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("arr " + i + " = " + array[i]);
		}
	}
}
