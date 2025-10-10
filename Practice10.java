//transpose 3*3 matrix

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m =sc.nextInt();
        System.out.print("Entner the number of colume");
        int n =sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] transpose = new int[n][m];

        System.out.print("Enter the element: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter element are: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + ":");
            }
            System.out.println();
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.print("transpose element are: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(transpose[i][j] + " :");
            }
            System.out.println();
        }
        


    }
}