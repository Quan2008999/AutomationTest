package day4_QuanLyXe;

public class XeMay {

	public static void main(String[] args) {
		
		Xe xeMay1 = new Xe();
		xeMay1.setLoaiXe("Honda");
		xeMay1.setTenXe("Lead");
		xeMay1.setVanTocMax(120);
		System.out.println(xeMay1.getLoaiXe()+"," +xeMay1.getTenXe()+"," +xeMay1.getVanTocMax());

		Xe xeMay2 = new Xe();
		xeMay2.setLoaiXe("Yamaha");
		xeMay2.setTenXe("AB");
		xeMay2.setVanTocMax(150);
		System.out.println(xeMay2.getLoaiXe()+"," +xeMay2.getTenXe()+"," +xeMay2.getVanTocMax());

	}

}
