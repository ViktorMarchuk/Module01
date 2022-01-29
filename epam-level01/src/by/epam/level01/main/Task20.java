package by.epam.level01.main;

/*
 * 7.Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа , m и n вводятся с клавиатуры.
 */
import java.io.*;

public class Task20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the N: ");
		int n = Integer.parseInt(bf.readLine());
		System.out.println("Enter the M:");
		int m = Integer.parseInt(bf.readLine());

		for (int i = n; i <= m; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(" For number  " + i + " divider is " + j);
				}
			}

		}

	}

}
