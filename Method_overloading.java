package JavaPrograms;

public class Method_overloading
 {
static void hi()
{
System.out.println("Method overloading");
}
static void hi(int a)
{
System.out.println("Method overloading integer value ");
}

public static void main(String[] args)
{
hi();
hi(6);

}
}