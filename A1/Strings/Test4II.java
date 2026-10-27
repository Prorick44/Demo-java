import java.util.Scanner;

public class Test4II {
  public static boolean isPalindromeString(String s) {
    int i = 0, j = s.length() - 1;
    while (i <= j) {
      if (s.charAt(i) != s.charAt(j))
        return false;
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string:- ");
    String s1 = sc.nextLine();

    if (isPalindromeString(s1))
      System.out.println("The given string is palindrome.");
    else
      System.out.println("The given string is not palindrome.");
    sc.close();
  }
}

// Checking Palindrome String or not (second and faster method.)