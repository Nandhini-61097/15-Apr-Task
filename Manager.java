class Employee {
   public static int count;
    {
        count += 1;
    } 
}

class Admin extends Employee {

}

public class Manager extends Admin {
     public static void main(String args[]){
        Employee e = new Admin();
        e = new Admin();
        e = new Admin();
        e = new Admin();
        e = new Admin();
        e = new Manager();
        e = new Manager();
        e = new Manager();
        System.out.println(Employee.count);
        
    }
  
}