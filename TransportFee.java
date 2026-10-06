

//task 2


import java.util.Scanner;

public class TransportFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter distance from campus (in km): ");
        double distance = sc.nextDouble();

        int fee;
        if (distance >= 0 && distance <= 5) {
            fee = 2000;
        } else if (distance > 5 && distance <= 10) {
            fee = 3500;
        } else if (distance > 10 && distance <= 20) {
            fee = 5000;
        } else {
            fee = 7000;
        }
        System.out.println("Transport Fee Details");
        System.out.println("Student Name: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Monthly Fee: Rs. " + fee);

        sc.close();
    }
}
