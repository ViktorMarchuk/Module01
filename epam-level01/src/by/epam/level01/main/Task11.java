package by.epam.level01.main;

import java.util.Scanner;

/**
 * 5.Вычислить значение функции
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value X :");
		double x = sc.nextDouble();
		double f = 0;
		if (x <= 3) {
			f = x * x - 3 * x + 9;
			System.out.println("The value of function is : " + f);

		}
		if (x > 3) {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println("The value of function is :" + f);
		}
	}
}
