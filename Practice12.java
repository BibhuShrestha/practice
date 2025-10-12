
//Write  a java method to print multiplication table of a number n using method.

import java.util.Scanner;

public class Practice12 {
    
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            int multi= n * i;
            System.out.println(n+" x " + i + " = " + multi);
            multiplication(n);
        }

    }
    
        
     public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //multiplication(n);
         

    }
    

}