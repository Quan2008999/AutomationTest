package day5_abstract;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Draw red rectangle with 4 edges, use color "+getColor());
		
	}

}
