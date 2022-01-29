package by.epam.level01.main;

import java.util.Scanner;

/**
 * 7.Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа , m и n вводятся с клавиатуры.
 * 
 */

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number M :");
		int m = sc.nextInt();
		System.out.println("Enter the number N :");
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("For number  " + i + " divider is " + j);

				}
			}
		}
	}
}
