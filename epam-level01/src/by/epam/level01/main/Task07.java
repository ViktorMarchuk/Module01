package by.epam.level01.main;

import java.util.Scanner;

/**
 * Ветвления 1. Даны два угла треугольника (в градусах). Определить, существует
 * ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first  corner : ");
		int x = sc.nextInt();
		System.out.println("Enter the second corner : ");
		int y = sc.nextInt();
		if (x <= 90 && y < 90 || x < 90 && y <= 90) {
			System.out.println("The triangle is exist");
		}

		if (x == 90 && y != 90 || y == 90 && x != 90) {
			System.out.println("The triangle is right triangle");

		}
	}
}
