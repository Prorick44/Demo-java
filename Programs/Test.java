import java.util.*;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: - ");
    int num = sc.nextInt();
    int E_sum = 0;
    int O_sum = 0;
    while (num != 0) {
      int d = num % 10;
      if (d % 2 == 0)
        E_sum += d;
      else
        O_sum += d;
      num /= 10;
    }
    if (E_sum == O_sum)
      System.out.println("Balaya Number.");
    else
      System.out.println("Not a Balaya Number.");

    sc.close();
  }
}
