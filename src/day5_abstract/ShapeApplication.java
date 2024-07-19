package day5_abstract;

public class ShapeApplication {

	public static void main(String[] args) {
		Shape rectangle1 = new Rectangle();
		rectangle1.draw();
		System.out.println("--------");
		
		Shape cirle1 = new Circle();
		cirle1.draw();
	}
}
