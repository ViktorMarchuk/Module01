package by.epam.level01.main;

import java.util.Scanner;

/**
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */
public class Task04 {

	public static void main(String[] args) {
		System.out.println("Input the number : ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double r1 = (r * 1000) % 1000 + Math.floor(r) / 1000;
		System.out.println("Result = " + r1);

	}

}
