/***
 * The MultiplicationTable class display "6 times" multiplication table
 *
 *
 */
import java.util.*;

public class MultiplicationTable {

  public static void main(String[] args) {
    int total;
    for (int i = 1; i <= 6; i++) {
      total = i * 6;
      System.out.println(i +  " x 6 = " + total);
    }
  }
}