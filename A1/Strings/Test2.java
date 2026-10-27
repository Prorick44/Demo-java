import java.util.*;

public class Test2 {
  public static String reverseString(String s) {
    String rev = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      rev += s.charAt(i);
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string:- ");
    String s1 = sc.nextLine();
    System.out.print("\nYour Reversed String:- ");
    System.out.println(reverseString(s1));
    sc.close();
  }
}

// Reverse a string