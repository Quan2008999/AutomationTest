package day4_encapsolution;

public class Person {
	private String phoneNumber;
	public String name;
	
	// Vì phoneNumber là biến private nên cần tạo phương thức get để lấy thông tin
	// và set để nhập thông tin số điện thoại
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
