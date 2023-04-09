import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length()!= b.length()) {
            return false;
        }
        else{
            for (int i = 0; i < a.length(); i++) {
                int countA = 0;
                int countB = 0;
                for (int j = 0; j < a.length(); j++) {
                    if (a.substring(i,i+1).equalsIgnoreCase(a.substring(j,j+1))) { //takes the first character only
                        countA++;
                    }
                    if (a.substring(i, i + 1).equalsIgnoreCase(b.substring(j, j + 1))) {
                        countB++;
                    }
                }
                if (countA != countB) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}