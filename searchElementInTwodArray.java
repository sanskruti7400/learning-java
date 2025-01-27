import java.util.*;

public class twoD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows :");
        int m = sc.nextInt();
        System.out.println("enter the columns :");
        int n = sc.nextInt();
        System.out.println("enter the targeted element :");
        int x = sc.nextInt();
        System.out.println("enter the array elements :");
        int search[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                search[i][j] = sc.nextInt();
            }
        }System.out.println("the given matrix is :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(search[i][j] + " ");
            }System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x==search[i][j]){
                    System.out.println("the targeted element "+x + "is at index " + i + j);
                }
            }
        }
    }
}
