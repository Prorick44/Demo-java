import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int sum = 0;
    System.out.println("Enter your digits:-");
    for (int i = 0; i < arr.length; i++) {
      int n = sc.nextInt();
      arr[i] = n;
    }
    for (int d : arr) {
      sum += d;
    }
    System.out.println("Sum your digits:- " + sum);
    sc.close();
  }
}

// sum of numbers present in the array