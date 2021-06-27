import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter number of subjects");
        int numberOfSubjects = input.nextInt();
        int [][] scores = new int[numberOfStudents][numberOfSubjects];
    }
}
