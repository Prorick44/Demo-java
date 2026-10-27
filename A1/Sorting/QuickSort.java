import java.util.Arrays;

public class QuickSort {
  public static void Sort(int start, int end, int[] arr) {
    if (start >= end)
      return;
    int i = start;
    int j = end;
    int pivot = (start + end) / 2;
    while (arr[i] < arr[pivot])
      i++;
    while (arr[j] > arr[pivot])
      j--;
    if (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

    Sort(start, j, arr);
    Sort(i, end, arr);
  }

  public static void main(String[] args) {
    int[] arr = { 9, 8, 6, 1, 3 };
    System.out.println("The original array:- " + Arrays.toString(arr));
    Sort(0, arr.length - 1, arr);
    System.out.println("The sorted array:- " + Arrays.toString(arr));
  }
}
