import java.util.*;

public class functions{
    public static void main(String args[]){
        System.out.println("enter the number :\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial=calculateFactorial(n);
    
    }
    public static int calculateFactorial(int n){
        int fact=1;
        if(n<=0){
            System.out.println("Invalid");
            return 0;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial is :" + fact);
        return 0;
    }
}
