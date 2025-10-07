//write a java program to reverse an array.

import java.util.Scanner;

public class Practice3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        
        System.out.println("Enter" + num + "elements:");
        for(int i = 0; i< num; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<num/2; i++){
            int temp = arr[i];
            arr[i] = arr[num-i-1];
            arr[num-i-1]=temp;

        }
        System.out.println("Reverse array");
        for(int i = 0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}