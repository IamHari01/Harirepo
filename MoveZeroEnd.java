
public class MoveZeroEnd {

	MoveZeroEnd(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
			if (arr[j] != 0) {
				j++;
			}

		}

	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 8, 1, 0, 4, 0, 5, 2 };
		MoveZeroEnd Zero = new MoveZeroEnd(arr);
		printArray(arr);
	}
}
