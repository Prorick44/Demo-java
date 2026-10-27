class Student1 {
  String name;
  int age;
  int marks;
  char gender;

  Student1(String name, int age, int marks, char gender) {
    this.name = name;
    this.age = age;
    this.marks = marks;
    this.gender = gender;
  }
}

public class Test7 {
  public static void main(String[] args) {
    Student1[] students = {
        new Student1("Rick", 20, 80, 'M'),
        new Student1("Projjal", 24, 50, 'M'),
        new Student1("Rupam", 22, 90, 'M'),
        new Student1("Ronti", 21, 85, 'M'),
        new Student1("Mimi", 21, 75, 'F'),
        new Student1("Mehuli", 25, 65, 'F'),
        new Student1("Mou", 23, 95, 'F'),
        new Student1("Rohan", 24, 95, 'M'),
        new Student1("Mohini", 25, 20, 'F'),
        new Student1("Ram", 25, 25, 'M')
    };
    System.out.println("Your student list:- ");
    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].name + "\t" + students[i].age + "\t" + students[i].marks + "\t" + students[i].gender);
    }
    System.out.println("Passed Students:- ");
    for (Student1 s : students) {
      if (s.marks >= 50)
        System.out.println("Name:- " + s.name + "\t Marks:- " + s.age);
    }
  }
}
