import java.util.*;

public class StringTest
{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String name; // declaration of String
    int age;
    System.out.print("what is your name?   ");
    name = sc.next(); // the next method is a string input
    System.out.print(" what is your age?   ");
    age = sc.nextInt();
    System.out.println();
    System.out.println("Hello " + name );
    System.out.println("When I was your age I was "  + (age +1));

  }
}
