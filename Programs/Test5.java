public class Test5 {
  public static void main(String[] args) {
    String s = "Ram@123#NA";
    String sp = "";
    String lc = "";
    String up = "";
    String num = "";
    for (int i=0;i<s.length(); i++) {
      char ch = s.charAt(i);
      if (ch >= 'a' && ch <='z')
        lc += s.charAt(i);
      else if (ch >= 'A' && ch <='Z')
        up += s.charAt(i);
      else if (ch >= '0' && ch <='9')
        num += s.charAt(i);
      else
        sp += s.charAt(i);
    }
    System.out.println(sp);
    System.out.println(up);
    System.out.println(lc);
    System.out.println(num);
  }
}
