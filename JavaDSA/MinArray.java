import java.util.Scanner;


public class MinArray {

	public int minArray(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}

		}
		return min;

	}

	public static void main(String[] args) {
		MinArray Min = new MinArray();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = scan.nextInt();

		System.out.println("Enter the elements of the array;");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		int Output = Min.minArray(array);
		System.out.println("the smallest array element is "+Output);
		scan.close();

	}

}
