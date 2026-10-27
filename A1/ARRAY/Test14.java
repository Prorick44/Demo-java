import java.util.Scanner;

public class Test14 {
  public static boolean palindrome(int n, int m, int rev) {
    if (n == 0)
      return (rev == m);
    int r = n % 10;
    return palindrome(n / 10, m, rev * 10 + r);
  }

  public static boolean isPrime(int n, int i) {
    if (i == 2)
      return true;
    if (n <= 1 || n % i == 0)
      return false;
    return isPrime(n, i - 1);
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

    System.out.println("\n\nThe array is :- ");
    for (int d : arr) {
      System.out.print(d + " ");
    }
    System.out.println("\n\nThe Prime Palindrome array:- ");
    for (int d : arr) {
      if (palindrome(d, d, 0) && isPrime(d, d / 2))
        System.out.print(d + " ");
    }
    sc.close();
  }

}

// prime palindrome numbers from the given array