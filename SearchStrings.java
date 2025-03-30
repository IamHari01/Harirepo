import java.util.Arrays;

public class SearchStrings{
    static boolean Search(String Name,char target){
        if(Name.length() == 0 ){//length in string is method so we put function braackets here
            return false;
        }
//        for (int i = 0; i<Name.length();i++){
//            if(target == Name.charAt(i)){
//                return true;
//
//            }
        //for each loop to enchance the process
        for(char ch: Name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String Name = "Selva";
        char target = 'v';
        System.out.println(Search(Name,target));
        System.out.println(Arrays.toString(Name.toCharArray()));

    }
}