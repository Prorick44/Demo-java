public class Test12 {
  public static void main(String[] args) {
    int[] arr = { 1, 50, 1, 100, 50, 1 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '\u0000') // unicode
        continue;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr[j] = '\u0000';
        }
      }
      System.out.print(arr[i] + " ");
    }
  }
}

// remove duplicate elements in an array