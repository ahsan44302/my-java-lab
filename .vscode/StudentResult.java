import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        double sub1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        double sub2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        double sub3 = sc.nextDouble();

        double total = sub1 + sub2 + sub3;
        double percentage = (total / 300) * 100;

        char grade;
        if (percentage >= 85) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Student Result ");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage) ;
        System.out.println("Grade: " + grade);

        sc.close();
    }
}