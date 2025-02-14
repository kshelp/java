package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		// �⺻ Ÿ�԰� �˻�
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
		
		int index2 = BSearch(scores, 99);
		System.out.println("ã�� �ε���: " + index2);

		// ���ڿ� �˻�
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " + index);

		// ��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);
	}

	static int BSearch(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
