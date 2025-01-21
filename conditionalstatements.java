import java.util.*;

public class condition{
    public static void main(String args[]){
        System.out.println("enter a , b, c :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(c<a && a>b){
            System.out.println("a is greater");
        }else if(a<b && b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
    }
}