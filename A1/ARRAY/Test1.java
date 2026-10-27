import java.util.*;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    System.out.println("Enter your digits:-");
    for (int i = 0; i < arr.length; i++) {
      int n = sc.nextInt();
      arr[i] = n;
    }
    System.out.println("your digits:- ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    sc.close();
  }
} 
