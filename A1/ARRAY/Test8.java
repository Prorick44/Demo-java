public class Test8 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    int[] brr = { 9, 8, 7 };
    int[] crr = new int[arr.length + brr.length];
    for (int i = 0; i < arr.length; i++) {
      crr[i] = arr[i];
    }
    for (int j = 0; j < brr.length; j++) {
      crr[j + arr.length] = brr[j];
    }
    System.out.println("Your merged array:- ");
    for (int d : crr) {
      System.err.print(d + " ");
    }
  }
}
