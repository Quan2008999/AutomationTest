package day4;

public class Dog_object {

	static String bread;
	static String size;
	static double age;
	static String color;
	
	public static void getInformation() {
		System.out.println("Bread is: "+bread + ", size is: "+size+ ", age is: "+age+ ", color is: "+color);
		
	}
	public static void main(String[] args) {
		Dog_object dog1 = new Dog_object();
		dog1.bread = "Beggie";
		dog1.size = "big";
		dog1.age = 2.5;
		dog1.color = "black";
		dog1.getInformation();

		Dog_object dog2 = new Dog_object();
		dog2.bread = "Beggie";
		dog2.size = "small";
		dog2.age = 1;
		dog2.color = "yellow";
		dog2.getInformation();
	}

}
