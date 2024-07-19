package day5_inherritance;

public class SinhVien extends Nguoi {

	public String maSV;
	public int soTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	
	@Override
	public void diChoi() {
		System.out.println("Học hết bài thì đi chơi");
	}
	
	public void diHoc() {
		System.out.println("Sinh Viên đi học 5 ngày/ tuần");
	}
}
