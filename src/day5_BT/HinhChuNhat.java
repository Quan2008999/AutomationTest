package day5_BT;

public class HinhChuNhat extends HinhHoc {

	public int chieuDai;
	public int chieuRong;
	
	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

}
