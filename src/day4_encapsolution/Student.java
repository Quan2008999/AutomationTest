package day4_encapsolution;

public class Student {

	public static void main(String[] args) {
		
		Person student1 = new Person();
		student1.name = "Cao Anh Quan";
		student1.setPhoneNumber("0392012324");
		System.out.println("Họ tên: "+student1.name+ ", số điện thoại: "+student1.getPhoneNumber());;

	}

}
