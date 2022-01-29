package by.epam.level01.main;

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task18 {

	public static void main(String[] args) {
		for (int i = 58; i <= 100; i++) {
			System.out.println("For number " + i + " respond to the symbol " + (char) i);
		}
	}
}
