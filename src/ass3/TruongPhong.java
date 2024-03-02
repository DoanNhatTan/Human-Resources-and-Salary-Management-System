package ass3;

public class TruongPhong extends NhanVien {
	double trachnhiem;
public TruongPhong() {
		
	}
	public TruongPhong(String manv, String hoten, double luong, double trachnhiem) {
		super(manv, hoten, luong);
		this.trachnhiem=trachnhiem;
	}
	public double getThuNhap() {
		return luong+trachnhiem;
	}
	public double getThueTN() {
		if(luong<9)
			return 0;
		else if(luong<15)
			return luong*0.1;
		else
			return luong*0.12;
	}
	public String xuatThongTin() {
		return "manv: " +manv+"\nhoten : "+hoten+"\nluong: "+luong+"\ntrach nhiem: "+trachnhiem+"\nthu nhap: "+getThuNhap()+"\nthue: "+getThueTN()+"\n";
	}
}
