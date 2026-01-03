import java.util.*;

//Print a string in reverse using recursion

public class Recursion2 {
    public static void reverseString(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int idx = str.length()-1;
        reverseString(str, idx);
        sc.close();
    }
}
