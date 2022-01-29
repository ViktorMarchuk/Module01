package by.epam.level01.main;

import java.util.Scanner;

/*   Циклы
 * 1.Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует 
 *   все числа от 1 до введенного пользователем числа.
 */
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any positive number :");
		int x = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= x; i++) {
			sum += i;
		}
		System.out.println("The amount is : " + sum);
	}
}
