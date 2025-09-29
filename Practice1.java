import java.util.Scanner;

public class Practice1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        boolean isInArray = false;
        

        System.out.println("Enter" + num + "number: ");
        for( int i = 1; i < num; i++){
            arr[i]= sc.nextInt();

        }
        System.out.print("Enter" + num + "number: ");
        int numToFind = sc.nextInt();

        for(int element:arr){
            if(element == numToFind){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.print("Number is present in an array");
        }else{
            System.out.print("Number is not present in an array");  

        }
    }
}