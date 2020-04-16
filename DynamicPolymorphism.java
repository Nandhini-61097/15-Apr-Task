class Lady
{
public void activity() {

System.out.println("Base Class");
}
}

class empl extends Lady
{
public void activity() {

System.out.println("Employee Class");
}
}

class HomeMaker extends Lady
{
public void activity() {

System.out.println("HomeMaker Class");
}
}

class Member extends Lady
{
public void activity() {

System.out.println("Member Class");
}
}



public class DynamicPolymorphism{
public static void main(String args[]){
Lady la = new Lady();
la.activity();
la = new empl();
la.activity();
la = new HomeMaker();
la.activity();
la = new Member();
la.activity();
}
}