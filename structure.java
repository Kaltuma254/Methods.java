// QUESTION 4
public class MixedStructure {
    int number;

    public MixedStructure() {
        number = 100;
        System.out.println("Constructor executed, number = " + number);
    }

    public static void staticMethodOne() {
        System.out.println("This is static method one.");
    }

    public static void staticMethodTwo() {
        System.out.println("This is static method two.");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}

// PRIME + FIBONACCI
public class PrimeFibonacci {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes() {
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static void fibonacciEvenSum() {
        int a = 1, b = 2, sum = 0;
        while (b <= 4000000) {
            if (b % 2 == 0) sum += b;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\nSum of even Fibonacci numbers ≤ 4 million: " + sum);
    }
}

// PALINDROME GUI
import javax.swing.*;

public class PalindromeGUI {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int num = Integer.parseInt(input);
        int original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        String message = (original == reversed) ? original + " is a palindrome." : original + " is not a palindrome.";
        JOptionPane.showMessageDialog(null, message);
    }
}

// ARRAY OPERATIONS
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        int[] reversed = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) arr[i] = sc.nextInt();

        // a) print
        System.out.print("Original array: ");
        for (int i : arr) System.out.print(i + " ");

        // b) search
        System.out.print("\nEnter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == search) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Number not found in this array.");

        // c) reverse copy
        for (int i = 0; i < 15; i++) reversed[i] = arr[14 - i];
        System.out.print("Reversed array: ");
        for (int i : reversed) System.out.print(i + " ");

        // d) sum and product
        int sum = 0;
        long product = 1;
        for (int i : arr) {
            sum += i;
            product *= i;
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Product: " + product);
    }
}
