import java.util.*;

public class Practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float numbers: ");
        float n = sc.nextFloat();
        float sum = 0;
        for(int i = 0; i<=n; i++){
            float num = sc.nextFloat();
            sum += n;
            
        }
        System.out.print("Sum of " + n + "number of float is :" + sum );
        
    }
}