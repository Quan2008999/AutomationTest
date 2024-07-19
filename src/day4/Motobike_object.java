package day4;

public class Motobike_object {

	static String hangXe;
	static String mauXe;
	static String bienSoXe;
	static String ngayDangKy;
	
	public static void getInformation() {
		System.out.println("Hãng xe là : "+hangXe + ", Màu xe là: "+mauXe+ ", Biển số xe là: "+bienSoXe+ ", Ngày đăng ký là: "+ngayDangKy);
		
	}
	public static void main(String[] args) {
		Motobike_object mb1 = new Motobike_object();
		mb1.hangXe = "SH";
		mb1.mauXe = "Trắng";
		mb1.bienSoXe = "29B-123456";
		mb1.ngayDangKy = "03/01/2024";
		mb1.getInformation();

		Motobike_object mb2 = new Motobike_object();
		mb2.hangXe = "AB";
		mb2.mauXe = "Đen";
		mb2.bienSoXe = "29B-123456";
		mb2.ngayDangKy = "01/01/2023";
		mb2.getInformation();
	}

}
