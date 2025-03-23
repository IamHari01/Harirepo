import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the place number");
        int n = scan.nextInt();
        int count =2;
        while(count<= n){
            int temp = second;
            second = first+second;
            first = temp;
            count++;
        }

        System.out.println(second);



    }
}