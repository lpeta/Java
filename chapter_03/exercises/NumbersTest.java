/***
 * The NumbersTest class allow user to imput a number and the program will test
 * if is odd or even all numbers till the final number input by the user
 *
 */
import java.util.*;

public class NumbersTest {

  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number ");
    num = sc.nextInt();
    int n = 1;
    while (n < num + 1) {
      if ( n % 2 == 0 ) {
         System.out.println( n + " is even");
      } else {
          System.out.println( n + " is odd");
        }
      n ++;
    }
  }
}
