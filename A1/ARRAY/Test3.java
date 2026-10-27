import java.util.*;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter your array elements:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Your array is:- ");
    for (int d : arr) {
      System.out.print(d + " ");
    }
    int i = 0, j = arr.length - 1;
    while (j > i) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    System.err.println("\n Your reversed array:- ");
    for (int d : arr) {
      System.out.print(d + " ");
    }
    sc.close();
  }
}

// Reversing the array