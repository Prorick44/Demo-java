import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 9, 6, 2, 1, 3 };
    System.out.println("The original array:- " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j])
          min = j;
      }
      if (min != i) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }
    }
    System.out.println("The sorted array:- " + Arrays.toString(arr));
  }
}
