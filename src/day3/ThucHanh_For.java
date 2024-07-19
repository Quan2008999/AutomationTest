package day3;

import java.util.Scanner;

public class ThucHanh_For {

	public static void inCacSoChanNhoHon11() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("Gia trị cua i la: " + i);
		}
	}

	public static void inCacSoChiaHetCho5NhoHonBang100() {
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0)
				System.out.println("Các số chia hết cho 5 là: " + i);
		}
	}

	public static void nhapMang(int doDaiMang) {
		Scanner scanner = new Scanner(System.in);
		int[] mangSoNguyen = new int[doDaiMang];
		for (int i = 0; i < doDaiMang; i++) {
			System.out.println("Nhập giá trị của mảng ở vị trí thứ: " + i);
			mangSoNguyen[i] = scanner.nextInt();

		}
		inMang(mangSoNguyen);
		timGiaTriLonNhat(mangSoNguyen);
		sapXepMangTangDan(mangSoNguyen);
	}

	public static void inMang(int[] mangSoNguyen) {
		System.out.println("Độ dài của mảng " + mangSoNguyen.length);
		System.out.println("Các giá trị của mảng vừa nhập là: ");
		for (int i = 0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}

	public static void timGiaTriLonNhat(int[] mangSoNguyen) {
		int soLonNhat = 0;
		for (int i = 0; i < mangSoNguyen.length; i++) {
			if (soLonNhat < mangSoNguyen[i])
				soLonNhat = mangSoNguyen[i];
		}
		System.out.println("Giá trị lớn nhât của mảng là: " + soLonNhat);
	}

	public static void sapXepMangTangDan(int[] mangSoNguyen) {
		int tmp = 0;
		for (int i = 0; i < mangSoNguyen.length; i++)
			for (int j = 0; j < mangSoNguyen.length - 1; j++) {
				System.out.println("Lần lặp thứ "+j+ " để so sánh " + mangSoNguyen[j] + " và " +mangSoNguyen[j+1] + ": ");
				if (mangSoNguyen[j] > mangSoNguyen[j + 1]) {
					tmp = mangSoNguyen[j];
					mangSoNguyen[j] = mangSoNguyen[j + 1];
					mangSoNguyen[j + 1] = tmp;
				}
				inMang(mangSoNguyen);
			}
	}

	public static void main(String[] args) {
//		inCacSoChanNhoHon11();
//		inCacSoChiaHetCho5NhoHonBang100();
		nhapMang(5);
	}

}
