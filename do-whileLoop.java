import java.util.*;

public class loops{
    public static void main(String args[]){
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i=1;
        do{
            int t=i*num;
            i++;
            System.out.println(t);
        }while(i<=10);
    }
}
