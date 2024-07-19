package day5_inherritance;

public class GiaoVien extends Nguoi {

	public String maGV;
	public String soNamKN;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(String soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	@Override
	public void diChoi() {
		System.out.println("Dạy và chấm xong bài thì đi chơi");
	}
	
	public void diDay() {
		System.out.println("Giáo Viên dạy 15 tiết/ tuần");
	}
}
