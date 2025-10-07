//input n number in an array and sort them is acending  and descending

import java.util.Scanner;

public class Practice6{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter array number: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the enter array are ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i] + " :");
        }     
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        
        System.out.print("the acending sorted array are ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+ " :");
        }

        System.out.print("the deceding sorted array are ");
        for(int i=num-1; i>=0; i--){
            System.out.print(arr[i]+ " :");
        }
    }
}