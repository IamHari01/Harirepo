public class isPalindrome {

    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(end>start){
            if(charArray[start]!=charArray[end]){
                return false;

            }
            start++;
            end--;
        }
        return true;


    }
    public static void main(String[] args) {
        isPalindrome Pali = new isPalindrome();
        String word = "MADAM";
        if(Pali.isPalindrome(word)){
            System.out.println("this word is a Palindrome");
        }else{
            System.out.println("this is not a Palindrome");
        }
    }
    
}
