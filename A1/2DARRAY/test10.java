import java.util.*;

public class test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array you want:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter your array elements:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("\nYour array is:- ");
    for (int d : arr) {
      System.out.print(d + " ");
    }
    int max = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    for (int d : arr) {
      if (d > max) {
        max2 = max;
        max = d;
      }
      if (d > max2 && d < max) {
        max2 = d;
      }
    }
    System.out.println("Your second hightest element in the array is:- " + max2);
    sc.close();
  }
}
