
import java.util.Scanner;

// creating a class squaring with a method to initialize its sode, calculating area, perimeter etc
class square {
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
    public void setSide(int s){
        side =s;
    }
}

public class Practice19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        square sq =new square();
        System.out.println("Enter the side: ");
        int inputside = sc.nextInt();
        sq.setSide(inputside);
        System.out.println(" area of square: " + sq.area());
        System.out.println("perimeter of square: " + sq.perimeter());

    }
    
    
}