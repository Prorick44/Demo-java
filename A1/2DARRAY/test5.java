import java.util.*;

public class test5 {
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
    int total = 0;
    String res = "";
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      int sum1 = 0;
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t");
        sum += arr[i][j];
        sum1 += arr[i][j];
      }
      total += sum;
      res += sum1 + "\t";
      System.out.println(" : " + sum);
    }
    System.out.println("--------------------------");
    System.out.println(res + " : " + total);
    sc.close();
  }
}
