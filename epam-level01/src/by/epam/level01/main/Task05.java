package by.epam.level01.main;

import java.util.Scanner;

/**
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc.
 */
public class Task05 {

	public static void main(String[] args) {
		System.out.println("Input the number: ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m = t / 60;
		int m1 = m % 60;
		int s = t % 60;
		int h = t / 3600;

		System.out.printf("%02d:%02d:%02d", h, m1, s);

	}

}
