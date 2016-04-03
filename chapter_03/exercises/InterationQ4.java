/**
 * The InterationQ4 ckass allow user to keep guessing a secret number
 *
 *
 */
import java.util.*;

public class InterationQ4 {

  public static void main(String[] args) {
    final int SECRET = 321;
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number ");
    num = sc.nextInt();
    while (num != SECRET) {
      System.out.println("**** Wrong number. Try again!!!");
      num = sc.nextInt();
    }
    System.out.println("Well done, Right number!");
  }
}
