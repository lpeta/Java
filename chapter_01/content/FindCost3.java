import java.util.*;  // in order to access the Scanner class

/* a program to unput the initial price of a product and then calculate and
display its cost tax has been added.*/


public class FindCost3 {

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); // create Scanner objects
    double price, tax;
    System.out.println("*** Product Price Check ***");
    System.out.print("Enter inicial price:    "); // prompt for imput
    price = sc.nextDouble(); //input method called
    System.out.print("Enter TAX rate:  ");// prompt for imput
    tax = sc.nextDouble(); // input method called
    price = price * (1 + tax/100); // perform the calculation
    System.out.println("Cost after tax = " + price);

  }

}