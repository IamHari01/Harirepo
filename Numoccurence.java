public class Numoccurence {
    public static void main(String[] args) {
        int count = 0;

        int Num = 13772787;
        while(Num > 0){
            int rem = Num %10;
            if(rem == 7){
                count++;

            }

            Num/=10;

        }
        System.out.println(count);
    }
}