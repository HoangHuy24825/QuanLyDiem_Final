package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import javax.swing.JOptionPane;

public final class Lop {

    private String maLop;
    private String tenLop;

    public Lop(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public Lop() {
    }

    public Lop(ResultSet set) {
        try {
            setMaLop(set.getString("maLop").trim());
            setTenLop(set.getString("tenLop").trim());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maLop);
        hash = 79 * hash + Objects.hashCode(this.tenLop);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lop other = (Lop) obj;
        if (!Objects.equals(this.maLop, other.maLop)) {
            return false;
        }
        if (!Objects.equals(this.tenLop, other.tenLop)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lop{" + "maLop=" + maLop + ", tenLop=" + tenLop + '}';
    }

}
