//fibonacci Series using recursive
import java.net.SocketPermission;
import java.util.Scanner;

public class Practice16 {
    static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    sop 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int  n = sc.nextInt();
        
        System.out.print("The fibonacci series of " + n +" number =" );
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
            
        }
    }
    
}