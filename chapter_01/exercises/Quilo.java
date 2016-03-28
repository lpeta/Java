/**
 * The Quilo CLASS will transform from kilo to pound
 */
import java.util.*;
public class Quilo
{
  public static void main(String[] args) {
    System.out.println("This program will transform from pounds to kilo");
    double p = 0;
    double k = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value in pounds:    ");
    p = sc.nextDouble();
    k = p/2.2;
    System.out.println("The value in Kilos is " + k);
    }
}