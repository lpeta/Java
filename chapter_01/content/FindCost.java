/**
 * The FindCost class calculate the product cost after deduct 17.5% of
 * tax.
 */
public class FindCost
{
  public static void main(String[] args) {
    double price, tax;
    price = 500;
    tax = 17.5;
    price = price * (1 + tax/100); // calculate cost

    //display results
    System.out.println(" *** Product Price Check *** ");
    System.out.println(" Cost after tax =  " + price);
  }
}