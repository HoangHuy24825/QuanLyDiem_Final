package model;

import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;

public final class SinhVien {

    private int maSinhVien;
    private String tenSinhVien;
    private byte[] anh;
    private Lop lop;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private int trangThai;

    public SinhVien(int maSinhVien, String tenSinhVien, byte[] anh, Lop lop, Date ngaySinh, String gioiTinh, String diaChi, int trangThai) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.anh = anh;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public SinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public SinhVien() {
        this.lop = new Lop();
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) throws Exception {
        if (maSinhVien < 0) {
            throw new Exception("Mã sinh viên là số nguyên dương!");
        } else {
            this.maSinhVien = maSinhVien;
        }
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) throws Exception {
        if (tenSinhVien.equalsIgnoreCase("")) {
            throw new Exception("Tên sinh viên không được rỗng!");
        } else {
            this.tenSinhVien = tenSinhVien;
        }
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if (diaChi.equalsIgnoreCase("")) {
            throw new Exception("Địa chỉ của sinh viên không được rỗng!");
        } else {
            this.diaChi = diaChi;
        }
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

    public SinhVien(ResultSet set) {
        try {
            setMaSinhVien(set.getInt("maSinhVien"));
            setTenSinhVien(set.getString("tenSinhVien"));
            setAnh(set.getBytes("anh"));
            setLop(new Lop(set));
            setNgaySinh(set.getDate("ngaySinh"));
            setGioiTinh(set.getBoolean("gioiTinh") == true ? "Nữ" : "Nam");
            setDiaChi(set.getString("diaChi"));
            setTrangThai(set.getInt("trangThai"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public SinhVien(int maSinhVien, String tenSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
    }
}
