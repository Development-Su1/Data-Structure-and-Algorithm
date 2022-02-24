// mergeSort 

import java.util.Arrays;
import java.util.Random;

public class mergeSort {
	// SIZE �� ��
	static int MAX_LEN = 100_000;

	public static void main(String[] args) {

		Random r = new Random(100);
		int merge_idx, collections_idx;
		int arr_merge[], arr_collections[];

		merge_idx = 0;
		collections_idx = 0;
		arr_merge = new int[MAX_LEN];
		arr_collections = new int[MAX_LEN];

		// �������� �迭�� �����ϴ� �κ�
		for (int i = 0; i < MAX_LEN; i++) {
			int temp = (r.nextInt() % 10000);
			arr_merge[merge_idx++] = temp;
			arr_collections[collections_idx++] = temp;
		}

		Arrays.sort(arr_collections);
		mergeSort(arr_merge, 0, MAX_LEN - 1);

		// ������ ����� �Ǿ����� Ȯ���ϴ� �κ�.
		for (int i = 0; i < MAX_LEN; i++) {
			if (arr_collections[i] != arr_merge[i]) {
				System.out.println("MergeSort ����!");
				return;
			}
		}
		System.out.println("MergeSort ����");
		return;
	}

	private static void mergeSort(int[] arr, int left, int right) {

		// (1) ��� ȣ���� ���� ���̻� �ɰ����� ���� ������ �ɰ��� �ȴ�.
		if (left >= right)
			return;

		int mid = (left + right) / 2;
		int i = left;
		int j = mid+1;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);

		// (2) �迭�� �ε����� ���ؼ� �������� �ɰ���, ������ �� �� ������ �ݺ����� ������.
		int[] buffer = new int[right - left + 1];
		int bidx = 0;
		
		// �����̶� ������ ���� ��
		while (true) {
			if(arr[i] <= arr[j]) { // stable
				buffer[bidx++] = arr[i];
				i++;
			} else {
				buffer[bidx++] = arr[j];
				j++;
			}
			
			if(i > mid || j > right) 
				break;
		}

		// (3) ���� ��(������ or ����)�� ���� buffer�� �־�� �Ѵ�.
		// ���� ���� �������
		while(i <= mid) {
			buffer[bidx++] = arr[i++];
		}
		//������ ���� �������
		while(j <= right) {
			buffer[bidx++] = arr[j++];
		}

		// (4) buffer�� �ִ� ���� ���� �迭�� �ε��� ���� �����ش�.
		for (int k = 0; k < bidx; k++) {
			arr[left+k] = buffer[k];
		}
	}
}