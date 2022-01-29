package by.epam.level01.main;

import java.util.Scanner;

/**
 * 4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size A of the hole : ");
		int a = sc.nextInt();
		System.out.println("Enter the size B of the hole : ");
		int b = sc.nextInt();
		System.out.println("Enter the size X of the brick : ");
		int x = sc.nextInt();
		System.out.println("Enter the size Y of the brick : ");
		int y = sc.nextInt();
		System.out.println("Enter the size Z of the brick : ");
		int z = sc.nextInt();
		if (x < a && y < b && z < a && z < b) {
			System.out.println("The brick pass into the hole ");

		} else {
			System.out.println("The brick NOT pass into the hole ");
		}
	}
}
