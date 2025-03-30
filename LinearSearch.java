public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,66,7,4,2,8,5,45};
        int target = 5;
        int ans = checkLinear(arr,target);
        System.out.println(ans);
    }


    static int checkLinear(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}