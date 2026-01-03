import java.util.*;

public class Greater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == b){
            System.out.println("Equal");
        }else if(a > b){
            System.out.println("a is Greater");
        }else{
            System.out.println("a is Lesser");
        }
        sc.close();
    }
}
