import java.util.Scanner;

class Student {
  String name;
  int age;
  int marks;
  char gender;

  Student(String name, int age, int marks, char gender) {
    this.name = name;
    this.age = age;
    this.marks = marks;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return (name + "\t" + age + "\t" + marks + "\t" + gender);
  }
}

public class Student_Management {
  static void quickSort(int start, int end, Student[] students) {
    if (start >= end)
      return;
    int pivot = (start + end) / 2;
    int i = start, j = end;
    while (students[i].marks < students[pivot].marks)
      i++;
    while (students[j].marks > students[pivot].marks)
      j--;
    if (i <= j) {
      Student temp = students[i];
      students[i] = students[j];
      students[j] = temp;
      i++;
      j--;
    }
    quickSort(start, j, students);
    quickSort(i, end, students);
  }

  static void merge(Student[] a, Student[] b, Student[] c) {
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i].marks < b[j].marks)
        c[k++] = a[i++];
      else
        c[k++] = b[j++];
    }
    while (i < a.length) {
      c[k++] = a[i++];
    }
    while (j < b.length) {
      c[k++] = b[j++];
    }
  }

  static void mergeSort(Student[] students) {
    if (students.length == 1)
      return;
    Student[] left = new Student[students.length / 2];
    Student[] right = new Student[students.length - left.length];
    for (int i = 0; i < left.length; i++) {
      left[i] = students[i];
    }
    for (int j = 0; j < right.length; j++) {
      right[j] = students[j + left.length];
    }
    mergeSort(left);
    mergeSort(right);
    merge(left, right, students);
  }

  static void selectionSort(Student[] students) {
    for (int i = 0; i < students.length; i++) {
      int min = i;
      for (int j = i + 1; j < students.length; j++) {
        if (students[j].marks < students[min].marks)
          min = j;
      }
      if (i != min) {
        Student temp = students[i];
        students[i] = students[min];
        students[min] = temp;
      }
    }
  }

  static void insertionSort(Student[] students) {
    for (int i = 1; i < students.length; i++) {
      int j = i - 1;
      Student key = students[i];
      while (j >= 0 && students[j].marks > key.marks) {
        students[j + 1] = students[j];
        j--;
      }
      students[j + 1] = key;
    }
  }

  static void sortRecords(Student[] students) {
    for (int i = 0; i < students.length; i++) {
      for (int j = 0; j < students.length - i - 1; j++) {
        if (students[j].marks > students[j + 1].marks) {
          Student temp = students[j];
          students[j] = students[j + 1];
          students[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student[] students = {
        new Student("Rick", 20, 80, 'M'),
        new Student("Projjal", 24, 50, 'M'),
        new Student("Rupam", 22, 90, 'M'),
        new Student("Ronti", 21, 85, 'M'),
        new Student("Mimi", 21, 75, 'F'),
        new Student("Mehuli", 25, 65, 'F'),
        new Student("Mou", 23, 95, 'F'),
        new Student("Rohan", 24, 95, 'M'),
        new Student("Mohini", 25, 20, 'F'),
        new Student("Ram", 25, 25, 'M')
    };
    boolean flag = true;
    while (flag) {
      System.out.println("\n\n\t\t\t <----------MENU------------->");
      System.out.println("Your opitions:- ");
      System.out.println("\n\t Press 1 to get all the records.");
      System.out.println("\n\t Press 2 to get all the MALE records.");
      System.out.println("\n\t Press 3 to get all the FEMALE records.");
      System.out.println("\n\t Press 4 to get all the PASSED STUDENT records.");
      System.out.println("\n\t Press 5 to get the Sorted STUDENT records by marks in ascending order(BUBBLE SORT).");
      System.out.println("\n\t Press 6 to get the Sorted STUDENT records by marks in ascending order(INSERTION SORT).");
      System.out.println("\n\t Press 7 to get the Sorted STUDENT records by marks in ascending order(SELECTION SORT).");
      System.out.println("\n\t Press 8 to get the Sorted STUDENT records by marks in ascending order(MERGE SORT).");
      System.out.println("\n\t Press 9 to get the Sorted STUDENT records by marks in ascending order(QUICK SORT).");
      System.out.println("\n\t Press 0 to EXIT.");
      int opt = sc.nextInt();
      switch (opt) {
        case 1: {
          System.out.println("\n\t Your Requested Records:- \n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
        }
          break;
        case 2: {
          System.out.println("\n\t Your Requested Records:- \n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            if (s.gender == 'M')
              System.out.println(s);
          }
        }
          break;
        case 3: {
          System.out.println("\n\t Your Requested Records:- \n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            if (s.gender == 'F')
              System.out.println(s);
          }
        }
          break;
        case 4: {
          System.out.println("\n\t Your Requested Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            if (s.marks >= 50)
              System.out.println(s);
          }
        }
          break;
        case 5: {
          System.out.println("\n\t Your Original Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
          sortRecords(students);
          System.out.println("\n\t Your Sorted Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
        }
          break;
        case 6: {
          System.out.println("\n\t Your Original Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
          insertionSort(students);
          System.out.println("\n\t Your Sorted Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
        }
          break;
        case 7: {
          System.out.println("\n\t Your Original Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
          selectionSort(students);
          System.out.println("\n\t Your Sorted Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
        }
          break;
        case 8: {
          System.out.println("\n\t Your Original Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
          mergeSort(students);
          System.out.println("\n\t Your Sorted Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
        }
          break;
        case 9: {
          System.out.println("\n\t Your Original Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
          quickSort(0, students.length - 1, students);
          System.out.println("\n\t Your Sorted Records:-\n");
          System.out.println("NAME\tAGE\tMARKS\tGENDER");
          System.out.println("----\t---\t-----\t------\n");
          for (Student s : students) {
            System.out.println(s);
          }
        }
          break;
        case 0: {
          System.out.println("\t\t <---------------EXITED------------->");
          flag = false;
        }
          break;
        default:
          System.out.println("DABBA FELLOWW DO AS DIRECTED!!!!!");
      }
    }
    sc.close();
  }
}
