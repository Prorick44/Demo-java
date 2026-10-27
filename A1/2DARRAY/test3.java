import java.util.*;

public class test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the array:- ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] arr = new int[row][col];
    int sum = 0;
    System.out.println("Enter elements into your array:- ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
        sum += arr[i][j];
      }
      System.out.println();
    }
    System.out.println("The sum of all elements is:- " + sum);
    sc.close();
  }
}
