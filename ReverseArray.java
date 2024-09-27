
import java.util.Scanner;

public class ReverseArray {
	public ReverseArray(int[] numbers,int start,int end){
		while(start<end) {
			
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++; 
			end--;
			
		}
		
	}
	
	

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = scan.nextInt();
		
		System.out.println("Enter the elements of the array;");
		int[] array = new int[n];
		
		for(int i = 0;i<n;i++) {
			array[i] = scan.nextInt();
			ReverseArray reverse = new ReverseArray(array,0,n-1);
			
			
			
		}
		System.out.println("Reversed Array");
		for(int output:array) {
			System.out.print(output+" ");
			
		}
	   
		// TODO Auto-generated method stub

	}

}
