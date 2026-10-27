import java.util.*;

public class Practice1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements you want in array:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("\nEnter elements into array:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int min = arr[0];
    int max = 0;
    for (int d : arr) {
      if (d > max)
        max = d;
      if (d < min)
        min = d;
    }
    int j = 0;
    System.out.print("Your required numbers:- ");
    for (int i = min; i <= max; i++) {
      if (i == arr[j]) {
        j++;
        continue;
      } else {
        System.out.print(i + " ");
      }
    }
    sc.close();
  }
}

// elements not present in the array in the max to min range
