import java.util.Scanner;

public class Practice3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
       
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] result = new int[m][n];


        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("Enter the " + i + "*" + j + " array:");
                arr1[i][j]=sc.nextInt();
               
            }

        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("Enter the " + i + "*" + j + " array:");
                arr2[i][j]=sc.nextInt();
            }   
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("Enter the " + i + "*" + j + " array:");
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}