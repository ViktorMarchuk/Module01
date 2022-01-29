package by.epam.level01.main;

import java.util.Scanner;

/**
 * 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае:
 */
public class Task06 {

	public static void main(String[] args) {
		System.out.println("Enter the coordinate x : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the coordinate y : ");
		int y = sc.nextInt();
		if (x >= -2 && x <= 2 & y >= 0 && y <= 4) {
			System.out.println("True");
		} else if (x >= -4 && x <= 4 && y <= 0 && y >= -3) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

	}

}
