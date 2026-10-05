public class CheckPrime {
  static boolean isPrime(int n, int i) {
    if (n % i == 0) return false;
    if (i <= 2) return true;
    return isPrime(n, i - 1);
  }  
  public static void main(String[] args) {
    int n = 17;
    if (isPrime(n, n - 1)) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number.");
    }
  }
}
