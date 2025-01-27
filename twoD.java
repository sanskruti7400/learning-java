import java.util.*;

public class twoD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of rows :");
        int m = sc.nextInt();
        System.out.println("enter the size of column :");
        int n = sc.nextInt();
        int matrix[][]=new int[m][n];
        System.out.println("enter array elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

