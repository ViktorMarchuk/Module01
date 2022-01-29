package by.epam.level01.main;

import java.util.Scanner;

/**
 * 2. Найти max{min(a, b), min(c, d)}
 */
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number: ");
		int a = sc.nextInt();
		System.out.println("Enter B number: ");
		int b = sc.nextInt();
		System.out.println("Enter C number: ");
		int c = sc.nextInt();
		System.out.println("Enter D number: ");
		int d = sc.nextInt();
		int min1 = 0;
		int min2 = 0;
		int max = 0;
		if (a < b) {
			System.out.println("min1 " + a);
			min1 = a;
		} else {
			System.out.println("min1 " + b);
			min1 = b;
		}
		if (c < d) {
			System.out.println("min2 " + c);
			min2 = c;
		} else {
			System.out.println("min2 " + d);
			min2 = d;
		}
		if (min1 > min2) {
			System.out.println("Max valuje: " + min1);

		} else {
			System.out.println("Max value: " + min2);
		}
	}
}
