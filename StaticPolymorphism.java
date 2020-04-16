class StaticPolymorphism{
public void addition(int a, int b)
{
int c = a + b;
System.out.println("Sum" +c);
}
public void addition(int a, int b, int c)
{
int d = a + b + c;
System.out.println("Sum" +d);
}
public static void main(String args[]){
StaticPolymorphism a = new StaticPolymorphism();
a.addition(10,5);
a.addition(10,5,7);
}
}