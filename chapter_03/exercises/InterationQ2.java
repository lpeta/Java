/**
 * Interation compare the value imput by user and display message
 * after loop interation
 *
 */
import java.util.*;

public class InterationQ2 {
    public static void main(String[] args) {

      int num;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number  ");
      num = sc.nextInt();

      for(int i = 1; i < num; i++) {
        System.out.println("YES");
        System.out.println("NO");
      }
      System.out.println("OK");
    }
}
