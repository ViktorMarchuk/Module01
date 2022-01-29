package by.epam.level01.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Task21 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number M:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(bf.readLine());
		System.out.println("Enter the number N:");
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array1 = new ArrayList<>();
		do {
			array.add(m % 10);
			m /= 10;
		} while (m > 0);
		{

		}
		System.out.println(array);

		do {
			array1.add(n % 10);
			n /= 10;
		} while (n > 0);
		{
			System.out.println(array1);
		}
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array1.size(); j++) {
				if (array.get(i) == array1.get(j)) {

					System.out.println("The numbers entering to the first and second number is " + array.get(i));
				}
			}

		}
	}
}