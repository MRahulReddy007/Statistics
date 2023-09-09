
/**
 * @author (Rahul Reddy 24263201)
 * @version (8/09/2023)
 */


import java.util.Scanner;

public class Statistics {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the assignment name: ");
    String assignmentName = scanner.nextLine();
    System.out.print("Enter the total number of students: ");
    int numberOfStudents = scanner.nextInt();

    // Create an array to store the students' marks.
    int[] marks = new int[numberOfStudents];

    // Get the students' marks from the user.
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.print("Enter the mark for student " + (i + 1) + ": ");
      int mark = scanner.nextInt();
      while (mark < 0 || mark > 30) {
        System.out.println("Invalid mark. Please enter a mark between 0 and 30.");
        System.out.print("Enter the mark for student " + (i + 1) + ": ");
        mark = scanner.nextInt();
      }
      marks[i] = mark;
    }

    
  }
}

