package day5_BT;

public class HinhTron extends HinhHoc {

	public double banKinh;
	
	public double getBanKinh() {
		return banKinh;
	}



	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}



	@Override
	public double tinhDienTich() {
		return 3.14*banKinh;
	}

}
