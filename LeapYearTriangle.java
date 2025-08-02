import java.util.Scanner;

public class LeapYearTriangle {
    public void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }

    double base, height, area;

    public void inputTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    public void calculateArea() {
        area = 0.5 * base * height;
    }
