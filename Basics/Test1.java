class A {
  A() {
    System.out.println("food");
  }

  void m1() {
    System.out.println("Water");
  }

  static void m2() {
    System.out.println("Milk");
  }
}

class B extends A {
  @Override
  void m1() {
    System.out.println("Sprite");
  }

  static void m2() {
    System.out.println("Milkshake");
  }
}

public class Test1 {
  public static void main(String[] args) {
    A a1 = new B();
    a1.m1();
    a1.m2();
  }
}