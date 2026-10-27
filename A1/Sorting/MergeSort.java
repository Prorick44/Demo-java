import java.util.Arrays;

public class MergeSort {
  public static void Sort(int[] arr) {
    if (arr.length == 1)
      return;
    int[] left = new int[arr.length / 2];
    int[] right = new int[arr.length - left.length];
    for (int i = 0; i < left.length; i++) {
      left[i] = arr[i];
    }
    // System.arraycopy(arr, 0, left, 0, left.length);
    for (int j = 0; j < right.length; j++) {
      right[j] = arr[j + left.length];
    }
    // System.arraycopy(arr, left.length, right, 0, right.length);
    Sort(left);
    Sort(right);
    merge(left, right, arr);
  }

  public static void merge(int[] a, int[] b, int[] c) {
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j])
        c[k++] = a[i++];
      else
        c[k++] = b[j++];
    }
    while (i < a.length) {
      c[k++] = a[i++];
    }
    while (j < b.length) {
      c[k++] = b[j++];
    }
  }

  public static void main(String[] args) {
    int[] arr = { 9, 8, 6, 1, 3 };
    System.out.println("The original array:- " + Arrays.toString(arr));
    Sort(arr);
    System.out.println("The sorted array:- " + Arrays.toString(arr));
  }
}
