import java.util.Scanner;  

public class ArrayUtil {  

    public int[] removeEven(int[] arr) {  
        int count = 0;  
        
        // Count how many odd numbers are in the array  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] % 2 != 0) {  
                count++;  
            }  
        }  
        
        // Create a result array of appropriate size  
        int[] result = new int[count];  
        int j = 0;  
        
        // Fill the result array with odd numbers  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] % 2 != 0) {  
                result[j] = arr[i]; // Fix: Correctly assign to result  
                j++;  
            }  
        }  
        
        return result;  
    }  

    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter the length of the array: ");  
        int n = scan.nextInt();  
        
        System.out.println("Enter the elements of the array:");  
        int[] array = new int[n];  
        for (int i = 0; i < n; i++) {  
            array[i] = scan.nextInt();  
        }  

        // Create an instance of ArrayUtil to call the method  
        ArrayUtil arrayUtil = new ArrayUtil();  
        int[] oddArray = arrayUtil.removeEven(array);  

        // Print the resulting array of odd numbers  
        System.out.println("Array after removing even numbers:");  
        for (int number : oddArray) {  
            System.out.print(number + " ");  
        }  

        scan.close();  
    }  
}  