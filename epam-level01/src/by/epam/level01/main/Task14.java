package by.epam.level01.main;

// 3.Найти сумму квадратов первых ста чисел.
public class Task14 {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += Math.pow(i, 2);

		}
		System.out.println("The amount is : " + sum);
	}
}