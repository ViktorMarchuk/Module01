package by.epam.level01.main;

/**
 * 3.Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦/𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦 )∗ 𝑡𝑔 𝑥𝑦
 */
public class Task03 {

	public static void main(String[] args) {
		double x = 25;
		double x1 = Math.toRadians(x);
		double y = 45;
		double y1 = Math.toRadians(y);
		System.out.println(
				"Result = " + ((Math.sin(x1) + Math.cos(y1)) / (Math.cos(x1) - Math.sin(y1))) * Math.tan(x1 * y1));

	}

}
