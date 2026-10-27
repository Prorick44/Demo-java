public class Test1 {
  public static void main(String[] args) {
    String s1 = "projjal";
    String s2 = "projjal";
    String s3 = new String("Projjal");
    String s4 = "Pro";
    String s5 = s4 + "jjal";
    
    System.out.println(s1 == s2); // True
    System.out.println(s2 == s3); // False
    System.out.println(s2 == s5); // False
  }
}
