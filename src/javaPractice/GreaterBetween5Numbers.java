package javaPractice;

import java.util.Scanner;

public class GreaterBetween5Numbers {
	public void greaterNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number a");
		int a = sc.nextInt();
		System.out.println("Enter Number b");
		int b = sc.nextInt();
		System.out.println("Enter Number c");
		int c = sc.nextInt();
		System.out.println("Enter Number d");
		int d = sc.nextInt();
		System.out.println("Enter Number e");
		int e = sc.nextInt();
		int max = a;
		 // Compare 'max' with other numbers
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }

        System.out.println("The largest number is: " + max);
        sc.close();

	}

	public static void main(String[] args) {
		GreaterBetween5Numbers greater = new GreaterBetween5Numbers();
		greater.greaterNumber();

	}

}
