package by.epam.level01.main;

import java.util.Scanner;

// 2. Вычислить значения функции на отрезке [а,b] c шагом h

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value A : ");
		int a = sc.nextInt();
		System.out.println("Enter the value B : ");
		int b = sc.nextInt();
		System.out.println("Enter the value of step H : ");
		int h = sc.nextInt();
		int y = 0;
		int x = 0;
		for (int i = a; i <= b; i = i + h) {
			x += i;

		}
		if (x > 2) {
			y = x;
			System.out.println("The value of function is :" + y);

		}
		if (x <= 2) {
			y = (-x);
			System.out.println("The value of function is : " + y);
		}

	}

}
