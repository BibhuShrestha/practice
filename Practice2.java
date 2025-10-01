import java.util.Scanner;

public class Practice2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        int sum = 0;
        
        for(int i = 1; i<num; i++){
            System.out.print("Enter the " + i + " array:");
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The average value of array is " + sum/arr.length);

    
    }
}