//input n number in an array and find the sum and average.
import  java.util.Scanner;

public class Practice5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        int avg = 0;
        
        System.out.print("Enter "  + num + " number:");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<num; i++){
            sum += arr[i];
        }
        for(int i=0; i<num; i++){
            avg = (sum)/(arr.length);
        }
        System.out.println("Enter number are:");
        for(int i=0; i<num; i++) {
            System.out.println(arr[i]+ " ");
        }

        
        System.out.println("Sum of array are" + sum );
        System.out.println("Average of array are: " + avg);    

    }
}
