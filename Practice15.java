//calculate sum of First n natural number using recursive

import java.util.Scanner;

public class Practice15 {
    static int recursive(int n){
        if(n==1){
            return 1;
        }
        return n + recursive(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        recursive(n);
        System.out.println("sum of first " + n + " natural number = " + recursive(n));
    }
}