public class SecondMaxArray {
    public static int SecondMaxArray(int[] arr) {
        int Max = Integer.MIN_VALUE;
        int Second_Max = Integer.MIN_VALUE;
        for(int i  = 0;i<arr.length;i++) {
            if(Max<arr[i]) {
               
                Second_Max = Max;
                Max = arr[i];
                }else if( Second_Max<arr[i] && Max != arr[i]) {
                    Second_Max = arr[i];
                    
                }
        }
        return Second_Max;
       
        
       
   }
    

   public static void main (String[] args) {
       
       int[] arr = {23,34,45,12,1,45,67};
       int result = SecondMaxArray(arr);
       System.out.println(result);
   }

}

    
