package model;

import java.sql.*;
import javax.swing.JOptionPane;

public final class LopDocLap {

    private int maLopDocLap;
    private Mon mon;
    private int kyHoc;
    private int namHoc;

    public LopDocLap(int maLopDocLap, Mon mon, int kyHoc, int namHoc) {
        this.maLopDocLap = maLopDocLap;
        this.mon = mon;
        this.kyHoc = kyHoc;
        this.namHoc = namHoc;
    }

    public LopDocLap(Mon mon, int kyHoc, int namHoc) {
        this.mon = mon;
        this.kyHoc = kyHoc;
        this.namHoc = namHoc;
    }

    public LopDocLap(int maLopDocLap, int kyHoc, int namHoc) {
        this.maLopDocLap = maLopDocLap;
        this.kyHoc = kyHoc;
        this.namHoc = namHoc;
    }

    public LopDocLap() {
        this.mon = new Mon();
    }

    public int getMaLopDocLap() {
        return maLopDocLap;
    }

    public void setMaLopDocLap(int maLopDocLap) {
        this.maLopDocLap = maLopDocLap;
    }

    public Mon getMon() {
        return mon;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public LopDocLap(ResultSet rs) {
        try {
            setMaLopDocLap(rs.getInt("maLopDocLap"));
            setKyHoc(rs.getInt("kyHoc"));
            setNamHoc(rs.getInt("namHoc"));
            setMon(new Mon(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR);
        }
    }

    @Override
    public String toString() {
        return "LopDocLap{" + "maLopDocLap=" + maLopDocLap + ", mon=" + mon + ", kyHoc=" + kyHoc + ", namHoc=" + namHoc + '}';
    }
    
    
}
