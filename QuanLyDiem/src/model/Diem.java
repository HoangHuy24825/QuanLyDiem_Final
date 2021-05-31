package model;

import java.sql.*;
import javax.swing.JOptionPane;

public final class Diem {

    private int maDiem;
    private SinhVien sinhVien;
    private LopDocLap lopDocLap;
    private int hocKy;
    private float diemTX1;
    private float diemTX2;
    private float diemHS2;
    private float diemKTHP;

    public double diemTrungBinh() {
        double diem = 0;
        if (diemHS2 == 0) {
            if (diemTX2 == 0) {
                diem = (diemTX1 + diemKTHP * 2) / 3;
            } else {
                diem = ((diemTX1 + diemTX2) / 2 + diemKTHP * 2) / 3;
            }
        } else {
            diem = ((diemTX1 + diemTX2 + diemHS2 * 2) / 4 + diemKTHP * 2) / 3;
        }
        return Math.round(diem * 100.0) / 100.0;
    }

    public Diem() {
        this.sinhVien = new SinhVien();
        this.lopDocLap = new LopDocLap();
    }

    public Diem(ResultSet set) {
        try {
            setMaDiem(set.getInt("maDiem"));
            setSinhVien(new SinhVien(set));
            setLopDocLap(new LopDocLap(set));
            setHocKy(set.getInt("hocKy"));
            setDiemTX1(set.getFloat("diemTX1"));
            setDiemTX2(set.getFloat("diemTX2"));
            setDiemHS2(set.getFloat("diemHS2"));
            setDiemKTHP(set.getFloat("diemKTHP"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Diem(int maDiem, SinhVien sinhVien, LopDocLap lopDocLap, int hocKy, float diemTX1, float diemTX2, float diemHS2, float diemKTHP) {
        this.maDiem = maDiem;
        this.sinhVien = sinhVien;
        this.lopDocLap = lopDocLap;
        this.hocKy = hocKy;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemHS2 = diemHS2;
        this.diemKTHP = diemKTHP;
    }

    public int getMaDiem() {
        return maDiem;
    }

    public void setMaDiem(int maDiem) {
        this.maDiem = maDiem;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public LopDocLap getLopDocLap() {
        return lopDocLap;
    }

    public void setLopDocLap(LopDocLap lopDocLap) {
        this.lopDocLap = lopDocLap;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) throws Exception {
        if (hocKy < 1 || hocKy > 16) {
            throw new Exception("Học kỳ không tồn tại. Học kỳ trong khoảng [1-16]");
        } else {
            this.hocKy = hocKy;
        }
    }

    public float getDiemTX1() {
        return diemTX1;
    }

    public void setDiemTX1(float diemTX1) throws Exception {
        if (diemTX1 < 0 || diemTX1 > 10) {
            throw new Exception("Điểm thường xuyên 1 phải lớn hoặc bằng 0 và nhỏ hơn hoặc bằng 10");
        } else {
            this.diemTX1 = diemTX1;
        }
    }

    public float getDiemTX2() {
        return diemTX2;
    }

    public void setDiemTX2(float diemTX2) throws Exception {
        if (diemTX2 < 0 || diemTX2 > 10) {
            throw new Exception("Điểm thường xuyên 2 phải lớn hoặc bằng 0 và nhỏ hơn hoặc bằng 10");
        } else {
            this.diemTX2 = diemTX2;
        }
    }

    public float getDiemHS2() {
        return diemHS2;
    }

    public void setDiemHS2(float diemHS2) throws Exception {
        if (diemHS2 < 0 || diemHS2 > 10) {
            throw new Exception("Điểm hệ số 2 phải lớn hoặc bằng 0 và nhỏ hơn hoặc bằng 10");
        } else {
            this.diemHS2 = diemHS2;
        }
    }

    public float getDiemKTHP() {
        return diemKTHP;
    }

    public void setDiemKTHP(float diemKTHP) throws Exception {
        if (diemKTHP < 0 || diemKTHP > 10) {
            throw new Exception("Điểm kết thúc học phần phải lớn hoặc bằng 0 và nhỏ hơn hoặc bằng 10");
        } else {
            this.diemKTHP = diemKTHP;
        }
    }    
    
}
