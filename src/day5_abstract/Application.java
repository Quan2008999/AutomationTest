package day5_abstract;

import day5_BT.HinhChuNhat;
import day5_BT.HinhHoc;
import day5_BT.HinhTron;

public class Application {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.setTenHinh("Hình chữ nhật có diện tích : ");
		hcn.chieuDai = 6;
		hcn.chieuRong = 4;
		System.out.println(hcn.getTenHinh() + hcn.tinhDienTich());
		
		HinhTron hinhTron = new HinhTron();
		hinhTron.setTenHinh("Hình tròn bán kính có diện tích : ");
		hinhTron.banKinh = 5;
		System.out.println(hinhTron.getTenHinh() + hinhTron.tinhDienTich());
	}

}
