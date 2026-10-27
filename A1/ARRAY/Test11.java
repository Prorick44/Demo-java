public class Test11 {
  public static void main(String[] args) {
    int[] arr = { 1, 50, 1, 100, 50, 1 };
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      if (arr[i] == '\u0000') // unicode
        continue;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          arr[j] = '\u0000';
        }
      }
      System.out.println(arr[i] + " : " + count);
    }
  }
}

// Occurrence of each element in the given array