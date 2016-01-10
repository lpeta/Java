import java.util.*;

public class FindCost3
{

  public static void main(String[] args) {
    double price, tax;
    Scanner sc = new Scanner(System.in);
    System.out.println("**** PRODUCT PRICE CHECK *****");
    System.out.print("Enter inicial price:  ");
    price = sc.nextDouble();
    System.out.print("Enter TAX rate:  ");
    tax = sc.nextDouble();
    // the fallowing if statement allows a selection to take place
    // teste the price to see if a discount applies
    if (price > 100)
    {

      System.out.println("*** Special promotion: Your tax will be halved!!");
      tax = tax * 0.5;

    }
    price = price * (1 + tax/100);
    System.out.println("Cost after tax: " + price);

  }
}
