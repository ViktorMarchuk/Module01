package by.epam.level01.main;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task15 {

	public static void main(String[] args) {
		double mult = 1;

		for (int i = 1; i <= 200; i++) {

			mult *= Math.pow(i, 2);
		}
		System.out.println("The amount is : " + mult);
	}
}
