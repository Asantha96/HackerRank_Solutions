import java.io.*;
import java.util.*;

public class JavaExceptionHandling{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      System.out.print(num1/num2);
    } catch (InputMismatchException ex) {
      System.out.println(ex.getClass().getName());
    } catch(ArithmeticException ex){
      System.out.println(ex.getClass().getName()+": / by zero");//if ex.get class sout=> class java.util.InputMismatchException
      //if ex.getClass().getName() sout => java.util.InputMismatchException have to concat /by zero
    }

    input.close();

  }
}