import java.util.*;

//Print all the unique subsequences of a string. (str = "aaa")

public class Recursion8 {
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        uniqueSubsequences(str, idx+1, newString+currChar, set);
        //not to be
        uniqueSubsequences(str, idx+1, newString, set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str, 0, "", set);
    }
}
