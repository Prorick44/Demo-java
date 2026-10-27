public class test12 {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];
    int n = 25;
    int row = 0;
    int col = -1;
    char direc = 'r';
    for (int i = 1; i <= n; i++) {
      switch (direc) {
        case 'r':
          col++;
          arr[row][col] = i;
          if (col == arr.length - 1 || arr[row][col + 1] != 0)
            direc = 'd';
          break;
        case 'd':
          row++;
          arr[row][col] = i;
          if (row == arr.length - 1 || arr[row + 1][col] != 0)
            direc = 'l';
          break;
        case 'l':
          col--;
          arr[row][col] = i;
          if (col == 0 || arr[row][col - 1] != 0)
            direc = 'u';
          break;
        case 'u':
          row--;
          arr[row][col] = i;
          if (row == 1 || arr[row - 1][col] != 0)
            direc = 'r';
          break;
      }
    }
    System.out.println("Your output:- ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
