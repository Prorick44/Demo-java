import java.util.Arrays;

public class practice2 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int[] brr = new int[arr.length];
    int k = 3;
    while (k > 0) {
      int key = arr[arr.length - 1];
      brr[0] = key;
      for (int i = 0; i < arr.length - 1; i++) {
        brr[i + 1] = arr[i];
      }
      System.arraycopy(brr, 0, arr, 0, arr.length);
      k--;
    }
    System.out.println(Arrays.toString(arr));
  }
}