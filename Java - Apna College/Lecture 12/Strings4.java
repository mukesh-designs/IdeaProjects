import java.util.*;

public class Strings4 {
    public static void main(String args[]){
        //Compare
        String name1 = "Mukesh";
        String name2 = "Mukesh";

        //1 s1>s2: +ve value
        //2 s1 == s2: 0
        //3 s1<s2: -ve value 

        //hello < wello
        //hello > cello
        //aahello > aabello
        
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
