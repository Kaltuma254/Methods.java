package mark_average;

import java.util.Scanner;

public class LecturerMarks {
    public void computeAverage() {
        Scanner sc = new Scanner(System.in);
        String[] units = {"Java Programming", "Networking", "Maths"};
        double total = 0;

        for (String unit : units) {
            System.out.printf("Enter marks for %s: ", unit);
            total += sc.nextDouble();
        }

        double average = total / units.length;
        System.out.println("\n--- Results ---");
        System.out.printf("marks for java programming is: %.2f%n", total - average * 2);
        System.out.printf("marks for networking is: %.2f%n", average);
        System.out.printf("marks for maths is: %.2f%n", total - average * 1);
        System.out.printf("the average is: %.2f%n", average);
    }
}
