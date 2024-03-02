package ass3;

public class TiepThi extends NhanVien {
	double doanhso;
	double hoahong;
	public TiepThi() {
		
	}
	public TiepThi(String manv, String hoten, double luong, double doanhso, double hoahong) {
		super(manv, hoten, luong);
		this.doanhso=doanhso;
		this.hoahong=hoahong;
	}
	public double getThuNhap() {
		return luong+doanhso+hoahong;
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
		return "manv: " +manv+"\nhoten : "+hoten+"\nluong: "+luong+"\ndoanh so: "+doanhso+"\nhoa hong: "+hoahong+"\nthu nhap: "+getThuNhap()+"\nthue: "+getThueTN()+"\n";
	}
}
