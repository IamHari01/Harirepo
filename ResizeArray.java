
public class ResizeArray {
		public void  printArray(int arr[]) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	
	

	public int[] Resize_array(int[] arr,int length) {
		int[] temp = new int[length];
		for(int i = 0; i<arr.length;i++) {
		   temp[i] = arr[i];
			
		}
		arr = temp;
		return arr;
	}
	public static void main(String[] args) {
		ResizeArray resize  = new ResizeArray();
		int[] original  = new int[] {3,4,2,5,6};
		System.out.println("the original size of the array is "+original.length);
		original = resize.Resize_array(original,10);
		System.out.println("the resized size of array is "+original.length);
		resize.printArray(original);
		
	}

}
