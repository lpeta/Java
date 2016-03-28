/**
 * The SelectionQ4 class is a silly example of how a IF statmeten works
 */
import java.util. *;
public class SelectionQ4 {
  public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.print ("Enter a number: ");
    x = sc.nextInt();
    if (x > 10) {
      System.out.println("Green");
      System.out.println("Blue");
    }
    System.out.println("RED");
  }
}