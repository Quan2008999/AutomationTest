package day5_overloading;

public class Application {

	public static void main(String[] args) {
		TinhTong test = new TinhTong();
		System.out.println(test.add(2, 678));
		System.out.println(test.add("chuoi1", " chuoi2"));
		System.out.println(test.add(4.15, 678.76));
	}

}
