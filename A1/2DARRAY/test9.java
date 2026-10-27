public class test9 {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 2, 3, 0, 0, 4 };
    int[] b = new int[arr.length];
    int a = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        b[a] = arr[i];
        a++;
      }
    }
    System.out.print("Your required array is:- ");
    for (int d : b) {
      System.out.print(d + " ");
    }
  }
}
