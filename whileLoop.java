import java.util.*;

public class loops{
    public static void main(String[] args){
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i=1;
        int t=1;
        while(i<=10){
            t=i*num;
            System.out.println(t);
            i++;
        }
    }
}