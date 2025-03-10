package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<SinhVien> dsSinhVien ;
	private String luaChon;
	private String tenFile;
	
	public QLSVModel() {
		this.dsSinhVien = new ArrayList<SinhVien>();
		this.luaChon = "";
		this.tenFile = "";
	}

	public QLSVModel(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
		
	}

	public ArrayList<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	
	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}
	
	

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	// Thêm sinh viên
	public void insert(SinhVien sv) {
		this.dsSinhVien.add(sv);
	}
	
	// Xoá sinh viên
	public void delete(SinhVien sv) {
		this.dsSinhVien.remove(sv);
	}
	
	// Cập nhật thông tin sinh viêm
	public void update(SinhVien sv) {
		this.dsSinhVien.remove(sv);
		this.dsSinhVien.add(sv);
	}

	public boolean kiemTraTonTai(SinhVien sv) {
		for (SinhVien sinhVien : dsSinhVien) {
			if(sinhVien.equals(sv)) {
				return true;
			}
		}
		return false;
	}
}	
