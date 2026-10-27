import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max1 = 0;
    int max2 = 0;
    System.out.println("Enter number of elements is the array:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter your elements in the array:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int min1 = arr[0];
    int min2 = arr[0];
    System.out.println("Your array is:- ");
    for (int d : arr) {
      System.out.print(d + " ");
    }
    for (int i = 0; i < n; i++) {
      if (max1 < arr[i]) {
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] > max2 && arr[i] != max1) {
        max2 = arr[i];
      }

      if (min1 > arr[i]) {
        min2 = min1;
        min1 = arr[i];
      }
      else if (min2 > arr[i] && arr[i] != min1) {
        min2 = arr[i];
      }
    }
    System.out.println("\n2nd Maximum element in the array is:- " + max2);
    System.out.println("\n2nd Minimum element in the array is:- " + min2);
    sc.close();
  }
}

// Second Largest Element in the given array
// second smallest element in the given array