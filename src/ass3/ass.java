package ass3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ass {
	
	static Scanner s=new Scanner(System.in);
	static ArrayList<NhanVien> ds=new ArrayList<NhanVien>();
	public static void main(String[] args) {
		while(true) {
		System.out.println("+----------------------------------------------------------+");
		System.out.println("+ 1. Nhap danh sach nhan vien tu ban phim.                 +");
		System.out.println("+ 2. Xuat danh sach nhan vien tu ban phim.                 +");
		System.out.println("+ 3. Tim va hien thi nhan vien theo ma nhap tu ban phim    +");
		System.out.println("+ 4. Xoa nhan vien theo ma nhap tu ban phim                +");
		System.out.println("+ 5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim +");
		System.out.println("+ 6. Tim cac nhan vien theo khoang luong nhap tu ban phim  +");
		System.out.println("+ 7. Sap xep nhan vien theo ho va ten                      +");
		System.out.println("+ 8. Sap xep nhan vien theo thu nhap                       +");
		System.out.println("+ 9. Xuat 5 nhan vien co thu nhap cao nhat                 +");
		System.out.println("+----------------------------------------------------------+");
		System.out.print("Chon chuc nang tu 1-9: ");
		int a=s.nextInt();
		s.nextLine();
		switch(a) {
			case 0: chucnang();
				break;
			case 1: Nhapnv();
				break;
			case 2: Xuatnv();
				break;
			case 3: timnv();
				break;
			case 4: xoanv();
				break;
			case 5: Suanv();
				break;
			case 6: Timluong();
				break;
			case 7: Sxtennv();
				break;
			case 8: Sxluongnv();
				break;
			case 9: luongcao5nv();
				break;
			default: 
				break;
		}
		if(a==10)
			break;
		}
		System.out.print("Ket thuc");
	}
	public static void chucnang() {
		System.out.println("Ban chon them danh sach nhan vien");
		ds.add(new NhanVien("002","Kien",18));
		ds.add(new TiepThi("005","Dung",12,5,8));
		ds.add(new NhanVien("007","Phong",5));
		ds.add(new TiepThi("006","Dinh",11,6,8));
		ds.add(new TruongPhong("008","Linh",9,3));
		ds.add(new NhanVien("009","Phu",8));
		
	}
	public static void Nhapnv() {
		System.out.println("Ban chon nhap danh sach nhan vien");
		System.out.println("Nhap ma nhan vien: ");
		String ma=s.nextLine();
		System.out.println("Nhap ten nhan vien: ");
		String ten=s.nextLine();
		System.out.println("Nhap luong nhan vien: ");
		double luong=s.nextDouble();
		s.nextLine();
		
		System.out.println("nhap chuc vu 1(nhan vien) 2(tiep thi) 3(truong phong)");
		int chucvu=s.nextInt();
		s.nextLine();
		if(chucvu==1) {
			NhanVien nv=new NhanVien(ma,ten,luong);
			ds.add(nv);
		}else if(chucvu==2) {
			System.out.println("Nhap doanh so: ");
			int doanhso=s.nextInt();
			System.out.println("Nhap hoa hong: ");
			int hoahong=s.nextInt();
			NhanVien nv=new TiepThi(ma,ten,luong,doanhso,hoahong);
			ds.add(nv);
		}else if(chucvu==3) {
			System.out.println("Nhap trach nhiem: ");
			int trachnhiem=s.nextInt();
			NhanVien nv=new TruongPhong(ma,ten,luong,trachnhiem);
			ds.add(nv);
		}
	
	}
	public static void Xuatnv() {
		System.out.println("Ban chon xuat danh sach nhan vien");
		for(int i=0;i<ds.size();i++) {
			System.out.println(ds.get(i).xuatThongTin());
		}
	}
	public static void timnv() {
		System.out.println("Ban chon tim nhan vien");
		String macantim=s.nextLine();
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).manv.equals(macantim)) {
				System.out.println(ds.get(i).xuatThongTin());
			}
			
		}
	}
	public static void xoanv() {
		System.out.println("Ban chon xoa nhan vien");
		String macanxoa=s.nextLine();
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).manv.equals(macanxoa)) {
				ds.remove(i);
			}
			
		}
	}
	public static void Suanv() {
		System.out.println("Ban chon chuc nang sua nhan vien");
		System.out.println("Nhap ma nhan vien can sua");
		String macansua=s.nextLine();
		int vitricansua=-1;
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).manv.equals(macansua)) {
				vitricansua=i;
			}
			
		}
		if(vitricansua==-1) {
			System.out.println("Khong tim thay nhan vien");
		}else {
			System.out.println("Nhap ma nhan vien: ");
			String ma=s.nextLine();
			System.out.println("Nhap ten nhan vien: ");
			String ten=s.nextLine();
			System.out.println("Nhap luong nhan vien: ");
			double luong=s.nextDouble();
			s.nextLine();
			
			System.out.println("nhap chuc vu 1(nhan vien) 2(tiep thi) 3(truong phong)");
			int chucvu=s.nextInt();
			s.nextLine();
			if(chucvu==1) {
				NhanVien nv=new NhanVien(ma,ten,luong);
				ds.set(vitricansua, nv);
			}else if(chucvu==2) {
				System.out.println("Nhap doanh so: ");
				int doanhso=s.nextInt();
				System.out.println("Nhap hoa hong: ");
				int hoahong=s.nextInt();
				NhanVien nv=new TiepThi(ma,ten,luong,doanhso,hoahong);
				ds.set(vitricansua, nv);
			}else if(chucvu==3) {
				System.out.println("Nhap trach nhiem: ");
				int trachnhiem=s.nextInt();
				NhanVien nv=new TruongPhong(ma,ten,luong,trachnhiem);
				ds.set(vitricansua, nv);
			}
		}
	}
	public static void Timluong() {
		System.out.println("Ban chon tim nhan vien theo bang luong");
		System.out.println("Nhap luong min");
		double min=s.nextDouble();
		System.out.println("Nhap luong max");
		double max=s.nextDouble();
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).luong>min && ds.get(i).luong<max) {
				System.out.println(ds.get(i).xuatThongTin());
			}
			
		}
	}
	public static void Sxtennv() {
		System.out.println("Ban chon sap xep theo ten nhan vien");
		Comparator<NhanVien> tieuchi=new Comparator<NhanVien>()
		{

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				int so=o1.hoten.compareTo(o2.hoten);
				return so;
			}
	
		};
		Collections.sort(ds, tieuchi);
		
	}
	public static void Sxluongnv() {
		System.out.println("Ban chon sap xep theo luong nhan vien");
		Comparator<NhanVien> tieuchi=new Comparator<NhanVien>()
		{

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				int so=(int)(o1.luong - o2.luong);
				return so;
			}
	
		};
		Collections.sort(ds, tieuchi);
	}
	public static void luongcao5nv() {
		System.out.println("Ban chon xuat 5 nhan vien co thu nhap cao nhat nhat");
		Sxluongnv();
		Collections.reverse(ds);
		for(int i=0;i<5;i++) {
			System.out.println(ds.get(i).xuatThongTin());
		}
	}
}
