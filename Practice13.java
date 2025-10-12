
//Write  a java method to print multiplication table of a number n using method.

import java.util.Scanner;

public class Practice13 {
    
    static void multiplication(int n, int i){
        if(i>10){
            return;
        }
        int multi = n*i;
        System.out.println(n+" x " + i + " = " + multi);
        multiplication(n, i+1);

    }
    
        
     public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        multiplication(n, 1);
         

    }
    

}