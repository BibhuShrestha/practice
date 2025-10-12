//Create a class cellphone with methods to pirint "ringing...". "vibrating..." etc.

import java.util.Scanner;

class cellphone {
    String name;
    public void ringing(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("callFriend....");

    }
    public void setname(String n){
        name = n;
    }
}

public class Practice18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cellphone iphone = new cellphone();
        
        System.out.println("Enter the name: ");
        String inputname = sc.nextLine();

        iphone.setname(inputname);
        iphone.ringing();
        iphone.vibrating();
        iphone.callFriend();



        
        


    }
}