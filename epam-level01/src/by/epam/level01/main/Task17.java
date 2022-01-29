package by.epam.level01.main;

/**
 * 5.Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид: см. задание
 */
public class Task17 {

	public static void main(String[] args) {
		double e = 0.26;
		double a = 0;
		for (int i = 1; i <= 10; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			// System.out.println(a);

			if (a >= e) {

				System.out.println("Output of values " + i + " : " + a);

			} else {
				System.out.println("");
			}
		}

	}
}
