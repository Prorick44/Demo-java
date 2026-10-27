import java.util.Scanner;

public class Test3 {
  public static int findChar(String s, char key) {
    char[] ch = s.toCharArray();
    for (int i=0; i<ch.length; i++) {
      if (ch[i] == key)
        return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your string:- ");
    String s = sc.nextLine();
    System.out.print("\nEnter Your key:- ");
    char key = sc.next().charAt(0);
    if (findChar(s, key) != -1)
      System.out.println("Your character position in the string is :-"+findChar(s, key));
    else
      System.out.println("Your character is not present in the string.");
    sc.close();
  }

}

// Get the  index of Given Character