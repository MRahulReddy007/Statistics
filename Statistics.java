
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
    int highestMark = 0;
    int lowestMark = 30;
    for (int mark : marks) {
      if (mark > highestMark) {
        highestMark = mark;
      }
      if (mark < lowestMark) {
        lowestMark = mark;
      }
    }
        System.out.println("Assignment: " + assignmentName);
    System.out.println("Highest mark: " + highestMark);
    System.out.println("Lowest mark: " + lowestMark);
        double mean = 0;
    double sumOfSquares = 0;
    for (int mark : marks) {
      mean += mark;
      sumOfSquares += (mark - mean) * (mark - mean);
    }
    double standardDeviation = Math.sqrt(sumOfSquares / marks.length);

    // Print the mean and standard deviation.
    System.out.println("Mean: " + mean);
    System.out.println("Standard deviation: " + standardDeviation);
  }
}



    
  


