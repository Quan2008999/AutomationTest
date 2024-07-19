package day2;

public class BTVN_YeuCau1 {

	public static int a,b;
	public static void main(String[] args) {
		a = 1123;
		b = 6745;
		int resulut = (a * b)/500;
		System.out.println("(a * b) /500 = " + resulut);
		printLargeNumber(a, b);

	}

	public static void printLargeNumber(double number1, double number2) {
		if(number1 > number2) {
			System.out.println("Số lớn hơn : "+ number1);
		}else {
			System.out.println("Số lớn hơn : "+ number2);
		}
	}
}
