package net.devstudy.jse.lection03_classes_static.home;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class DataUtils {
	public static <T> DynaArray<T> newDynaArray() {
		return new DynaArray<T>();
	}

	public static <T> DataSet<T> newImmutableDataSet(final DataSet<T> dataSet) {
		return null; // ������������ ��������� ���������� �����
	}

	public static <T> DataSet<T> newImmutableDataSet(final T[] array) {
		return null; // ������������ ��������� ���������� �����
	}

	public static <T> DataSet<T> newImmutableDataSet(final T element, final T... elements) {
		return null; // ������������ ��������� ���������� �����
	}

	public static <T> LinkedList<T> newLinkedListWithDuplicates(final DataSet<T>... dataSets) {
		return null; // ������������ ����������� �������� ��� �����������
	}

	public static <T> DataSet<T> newDataSetWithoutDuplicates(final DataSet<T>... dataSets) {
		return null; // ������������ ���������� ����� ��� ���������� ������ ��
						// �������� ����������
	}

	/*public static <T> Queue<T> newQueue(final DataSet<T> dataSet) {
		return null; // ��������� ������������� ������� � �������� ������ ���
						// �������� �������
	}

	public static <T> Stack<T> newStack(final DataSet<T> dataSet) {
		return null; // ��������� ������������� ������� � �������� ������ ���
						// �������� �����
	}

	public static <T> Queue<T> newQueue(final T[] array) {
		return null; // ��������� ������������� ������� � �������� ������ ���
						// �������� �������
	}

	public static <T> Stack<T> newStack(final T[] array) {
		return null; // ��������� ������������� ������� � �������� ������ ���
						// �������� �����
	}*/

	private DataUtils() {
	}
}
