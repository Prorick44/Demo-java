import java.util.*;

public class test8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the array:- ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] arr = new int[row][col];
    System.out.println("Enter elements into your array:- ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Your expected output:- ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Sum of diagonal elements:- ");
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i == j || i + j == arr.length - 1) {
          System.out.print(arr[i][j] + " ");
          sum += arr[i][j];
        }
      }
    }
    System.out.println(" : " + sum);
    sc.close();
  }
}
