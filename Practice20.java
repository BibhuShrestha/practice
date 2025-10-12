//Create a class Rectangle and repeat 3.
import java.util.Scanner;

class rectangle {
    int length;
    int breath;
    public int area(){
        return length * breath;
    }
    public int parimeter(){
        return 2*(length * breath);
    }
    public void setDimensions(int l , int b){
        length = l;
        breath =b;
    }

}

public class Practice20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        rectangle rect = new rectangle();
        System.out.println("Enter the length: ");
        int length=sc.nextInt();

        System.out.println("Enter the breathe: ");;
        int breath = sc.nextInt();

        rect.setDimensions(length, breath);
        System.out.println("\nchooose what you want to calculate: ");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Area of rectangle: " + rect.area());
                           
                break;
            case 2:
                System.out.println("Perimeter of rectangle: " + rect.parimeter());
                break;
            default:
                System.out.println("Invalid choice!");
            
        }


        
    }
}