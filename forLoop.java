import java.util.*;

public class loops{
    public static void main(String[] args){
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = 1;
        for(int i=1;i<=10;i++){
            t=num*i;
            System.out.println(t);
        }
    }
}
