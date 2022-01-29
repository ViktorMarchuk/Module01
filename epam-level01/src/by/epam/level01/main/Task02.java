package by.epam.level01.main;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): 𝑏 + √𝑏^2 + 4𝑎𝑐/2𝑎− 𝑎^3 𝑐 + 𝑏^−2
 * 
 */
public class Task02 {

	public static void main(String[] args) {
		double a = 4;
		double b = 3;
		double c = 5;
		double x1 = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a;
		double x2 = Math.cbrt(a) * c;
		double x3 = Math.pow(b, -2);
		System.out.println("Result = " + (x1 - x2 + x3));
	}

}
