public class test7 {
  public static void main(String[] args) {
    int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] b = { { 1, 4, 6 }, { 2, 8, 1 }, { 3, 2, 1 } };

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        int sum = 0;
        for (int k = 0; k < a[i].length; k++) {
          sum += (a[i][j] * b[k][j]);
        }
        System.out.print(sum + "\t");
      }
      System.out.println();
    }
  }
}

// Matrix multiplication
