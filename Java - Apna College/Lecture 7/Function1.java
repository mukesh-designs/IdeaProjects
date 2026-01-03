import java.util.*;

//Print a given name in a function

public class Function1 {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);
        sc.close();
    }
}
