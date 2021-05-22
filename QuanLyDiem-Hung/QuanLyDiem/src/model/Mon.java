package model;

import java.sql.*;
import javax.swing.JOptionPane;

public final class Mon {

    private int maMon;
    private String tenMon;
    private float soTin;

    public int getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public float getSoTin() {
        return soTin;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public void setTenMon(String tenMon) throws Exception {
        if (tenMon.equalsIgnoreCase("")) {
            throw new Exception("Tên môn không được rỗng!");
        } else {
            this.tenMon = tenMon;
        }
    }

    public void setSoTin(float soTin) throws Exception {
        if (soTin < 1 || soTin > 10) {
            throw new Exception("Số tín phải thuộc đoạn [1-10]!");
        } else {
            this.soTin = soTin;
        }
    }

    public Mon(int maMon, String tenMon, float soTin) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTin = soTin;
    }

    public Mon(ResultSet set) {
        try {
            setMaMon(set.getInt("maMon"));
            setTenMon(set.getString("tenMon").trim());
            setSoTin(set.getFloat("soTin"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Mon() {
    }

    @Override
    public String toString() {
        return "Mon{" + "maMon=" + maMon + ", tenMon=" + tenMon + ", soTin=" + soTin + '}';
    }
}
