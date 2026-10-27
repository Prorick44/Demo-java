public class Test1{
  public static String rev(String s, String rev, int i) {
    if (i<0) return rev;
    return rev(s, rev+=s.charAt(i), i-1);
  }
  public static void main(String[] args) {
    String s = "java";
    System.out.println(rev(s, "", s.length()-1));
  }
}
