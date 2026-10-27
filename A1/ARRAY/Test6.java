import java.util.*;

public class Test6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter your array elements:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.err.println("The Marks which they failed:- ");
    for (int i = 0; i < n; i++) {
      if (arr[i] <= 35)
        System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}

// get those munbers below criteria