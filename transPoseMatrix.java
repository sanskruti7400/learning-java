import java.util.*;

public class twoD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows :");
        int m = sc.nextInt();
        System.out.println("enter the columns :");
        int n = sc.nextInt();
        System.out.println("enter array elements :");
        int transpose[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                transpose[i][j]=sc.nextInt();
            }
        }
        System.out.println("the given matrix is :");
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the transpose of given matrix is :");
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
    }
}