public class MissingNumArray {
	public int MissNum(int[] arr) {
		int n = arr.length + 1;
		int sum  = (n * (n+1))/2;
		for(int i = 0;i<n-1;i++) {
			
			
			sum = sum-arr[i];
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		
		MissingNumArray Miss = new MissingNumArray();
		int[] array = {1,3,4,5,6};
		int Output = Miss.MissNum(array);
		System.out.println("the Missing Num is"+Output);

	}

}
