import java.util.*;

public class Strings3 {
    public static void main(String args[]){
        //Concatenation
        String firstName = "Mukesh";
        String lastName = "Choudhary";

        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
