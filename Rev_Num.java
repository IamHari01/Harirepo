public class Rev_Num {
    public static void main(String[] args) {
        int ans = 0;
        int Num = 27498;
        while (Num > 0) {
            int rem = Num%10;
            Num/=10;
            ans = ans*10+rem;


        }
        System.out.println(ans);
    }
}