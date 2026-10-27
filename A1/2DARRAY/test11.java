public class test11 {
  static void pascal(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new int[i + 1];
      for (int j = 0; j < arr[i].length; j++) {
        if (j == 0 || i == j)
          arr[i][j] = 1;
        else
          arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
      }
    }
  }

  public static void main(String[] args) {
    int[][] arr = new int[5][];
    pascal(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
