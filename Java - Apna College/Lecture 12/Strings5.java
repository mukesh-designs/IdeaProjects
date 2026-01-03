import java.util.*;

public class Strings5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //SubString
        String sentence1 = "My name is Mukesh";
        String name1 = sentence1.substring(11,sentence1.length());
        System.out.println(name1);

        String sentence2 = "MukeshChoudhary";
        String name2 = sentence2.substring(0,6);
        String name3 = sentence2.substring( 6);
        System.out.println(name2);
        System.out.println(name3);

        sc.close();
    }
}
