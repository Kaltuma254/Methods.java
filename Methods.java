package java_methods;

import java.util.Scanner;

public class Methods {
    public void findLargestSmallest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = a;
        int smallest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " smallest number.");
    }
}
