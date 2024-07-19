package day4_BTVN;

public class Developer {

	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		em1.setEmployee_id(1);
		em1.setEmployee_name("Giang");
		em1.getEmployee_salary();
		System.out.println(em1.getEmployee_id()+"," +em1.getEmployee_name()+"," +em1.getEmployee_salary());

		Employee em2 = new Employee();
		em2.setEmployee_id(2);
		em2.setEmployee_name("Quân");
		em2.getEmployee_salary();
		System.out.println(em2.getEmployee_id()+"," +em2.getEmployee_name()+"," +em2.getEmployee_salary());

	}
	// Với thuộc tính salary khi không khai báo phương thức setter thì khi lấy thông tin employee_salary giá trị mặc định sẽ là 0
}
