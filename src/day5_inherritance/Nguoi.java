package day5_inherritance;

public class Nguoi {

	private String hoTen;
	private String ngaySinh;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void diChoi() {
		System.out.println("Trời đẹp thì đi chơi");
	}
}
