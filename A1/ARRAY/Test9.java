import java.util.*;

public class Test9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    System.out.println("Enter number of elements is the array:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter your elements in the array:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int min = arr[0];
    System.out.println("Your array is:- ");
    for (int d : arr) {
      System.out.print(d + " ");
    }
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("\n Maximum element in the array is:- " + max);
    System.out.println("Mimimum element in the array is:- " + min);
    sc.close();
  }
}

// Maximum array in a given array
// Minimum in the given array 