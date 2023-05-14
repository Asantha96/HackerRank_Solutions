import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        List<Integer> elementList = new ArrayList<>();
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
          int tempNum = input.nextInt();
          elementList.add(i,tempNum);
        }
        int Q = input.nextInt();
        for (int i = 0; i < Q; i++) {
          String choice = input.next();
          
          if (choice.equalsIgnoreCase("Insert")) {
            int index = input.nextInt();
            int value = input.nextInt();
            elementList.add(index, value);
          }else if(choice.equalsIgnoreCase("Delete")){
            int index = input.nextInt();
            elementList.remove(index);
          }
        }
        for (int i = 0; i < elementList.size(); i++) {
          System.out.print(elementList.get(i)+" ");
        }

        input.close();
    }
}