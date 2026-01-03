import java.util.*;

// Check if a string is palindrome or not

public class Quest2 {
    public static boolean checkPalindrome(int i, String str) {
        int n = str.length();
        if(i >= n/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
        return checkPalindrome(i+1, str);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        if(checkPalindrome(0, str) == true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
