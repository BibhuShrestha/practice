/*Create a class Employee with Following properties and methods:
salary(property)(int)
getsalary(method retureninh int)
name(property)(String)
getname(method returing String)
setName(method changing name)*/


import java.util.Scanner;

class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
        
    }
    public void setName(String n){
        name = n;
    }
}
public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter the name of Employee: ");
        String inputName = sc.nextLine();
        emp.setName(inputName);
        System.out.print("Enter the salary of the employee: ");
        emp.salary = sc.nextInt();
        
        System.out.println("Employee Name: " +emp.getName());
        System.out.println("Employee salary:" + emp.getsalary());
        

    }
}