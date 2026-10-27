import java.util.*;

public class Test13 {
  static int DigitSum(int num) {
    if (num < 10)
      return num;
    return num % 10 + DigitSum(num / 10);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements to enter:- ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter number of elements to the array:- ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      arr[i] = DigitSum(arr[i]);
    }
    System.out.println("The Digit Sum array:- " + Arrays.toString(arr));
    sc.close();
  }
}

// convert the array of digital sum