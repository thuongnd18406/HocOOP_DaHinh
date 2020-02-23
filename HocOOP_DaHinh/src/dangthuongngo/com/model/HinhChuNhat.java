package dangthuongngo.com.model;

public class HinhChuNhat extends HinhHoc {

	public double tinhChuVi() {
		return (this.getChieuDai()+this.getChieuRong())*2;
	}

	public double tinhDienTich() {
		return this.getChieuDai()*this.getChieuRong();
	}

	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(int chieuDai, int chieuRong) 
	{
		super(chieuDai, chieuRong);
	}

}
