package by.epam.level01.main;

import java.util.Scanner;

/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой.
 */
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinate of point A x1 : ");
		int x1 = sc.nextInt();
		System.out.println("Enter the coordinate of point A y1 : ");
		int y1 = sc.nextInt();
		System.out.println("Enter the coordinate of point B x2 : ");
		int x2 = sc.nextInt();
		System.out.println("Enter the coordinate of point B y2 : ");
		int y2 = sc.nextInt();
		System.out.println("Enter the coordinate of point C x3 : ");
		int x3 = sc.nextInt();
		System.out.println("Enter the coordinate of point C y3 : ");
		int y3 = sc.nextInt();
		int amount = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
		if (amount == 0) {
			System.out.println("The coordinates are on a straight line");

		} else {
			System.out.println("The coordinates are NOT on a straight line");

		}
	}
}
