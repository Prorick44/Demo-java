import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int sum = 0;
    System.out.println("Enter your digits:-");
    for (int i = 0; i < arr.length; i++) {
      int n = sc.nextInt();
      arr[i] = n;
    }
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0)
        sum += arr[i];
    }
    System.out.println("Sum your digits:- " + sum);
    sc.close();
  }
}

// sum of even numbers present in the array