package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("Cao Anh Quan");
		sv1.setMaSV("SV01");
		sv1.setNgaySinh("20/08/2001");
		sv1.setSoTinChi(20);
		System.out.println("Sinh viên: "+sv1.getHoTen()+ " " +sv1.getMaSV()+ " " + sv1.getNgaySinh()+ " " +sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		System.out.println("==================");
		GiaoVien gv1 = new GiaoVien();
		gv1.setHoTen("Nguyen Van B");
		gv1.setNgaySinh("01/01/2000");
		gv1.setMaGV("GV01");
		gv1.setSoNamKN("3.5");
		System.out.println("Giáo Viên: "+gv1.getHoTen()+ " " +gv1.getNgaySinh()+ " " +gv1.getMaGV()+ " " +gv1.getSoNamKN());
		gv1.diDay();
		gv1.diChoi();
	}

}
