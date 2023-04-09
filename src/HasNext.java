import java.util.*;

public class HasNext {

  public static void main(String[] args) {
    int lineNumber = 1;
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String statement = sc.nextLine();
      System.out.println(lineNumber + " " + statement);
      lineNumber++;
    }
    sc.close();
  }
}