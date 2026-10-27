import java.util.*;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter your digits:-");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("your digits:- ");
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}
