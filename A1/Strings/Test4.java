import java.util.Scanner;

public class Test4 {
  public static void isPalindromeString(String s, String rev) {
    for (int i = 0; i < s.length(); i++) {
      rev += s.charAt(i);
    }
    if (rev.equals(s))
      System.out.println("The given string is palindrome.");
    else
      System.out.println("The given string is not a palindrome.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string:- ");
    String s1 = sc.nextLine();
    isPalindromeString(s1, "");
    sc.close();
  }
}

// Check the string is palindrome or not