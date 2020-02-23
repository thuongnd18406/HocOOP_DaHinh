package dangthuongngo.com.test;

import dangthuongngo.com.model.IDoAble;
import dangthuongngo.com.model.NhanVien;
import dangthuongngo.com.model.SinhVien;

public class TestDoAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoAble x;
		x=new NhanVien();
		x.doSomething();
		x= new SinhVien();
		x.doSomething();
	}

}
