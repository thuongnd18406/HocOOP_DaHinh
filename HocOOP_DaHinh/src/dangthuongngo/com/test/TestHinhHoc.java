package dangthuongngo.com.test;

import dangthuongngo.com.model.HinhChuNhat;
import dangthuongngo.com.model.HinhHoc;
import dangthuongngo.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {

		HinhHoc h;
		h=new HinhChuNhat(4, 5);
		System.out.println("Chu Vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
		System.out.println("________________");
		
		h=new HinhVuong(5);
		System.out.println("Chu Vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
		System.out.println("________________");
		
		HinhChuNhat hv1 =new HinhVuong(5);
		System.out.println("Chu Vi="+hv1.tinhChuVi());
		System.out.println("Diện Tích="+hv1.tinhDienTich());
	}

}
