package model;

import java.util.Objects;
import java.sql.*;
import javax.swing.JOptionPane;

public final class TaiKhoan {

    private String id;
    private String pass;
    private String loaiTaiKhoan;
    private String trangThai;
    private Lop  lop;

    public TaiKhoan(String id, String pass, String loaiTaiKhoan, String trangThai, Lop lop) {
        this.id = id;
        this.pass = pass;
        this.loaiTaiKhoan = loaiTaiKhoan;
        this.trangThai = trangThai;
        this.lop = lop;
    }

    public TaiKhoan(String id, String pass) {
        this.id = id;
        this.pass = pass;
        this.lop=new Lop();
    }

    public TaiKhoan() {
        this.lop = new Lop();
    }

    public TaiKhoan(ResultSet set) {
        try {
            setId(set.getString("id").trim());
            setPass(set.getString("pass").trim());
            setLoaiTaiKhoan(set.getBoolean("loaiTaiKhoan") == true ? "Admin" : "Giảng viên");
            setTrangThai(set.getBoolean("isDisable") == true ? "Vô hiệu hóa" : "Hoạt động");
            this.lop=new Lop();
            getLop().setMaLop(set.getString("maLop").trim());
            getLop().setTenLop(set.getString("tenLop").trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (id.equalsIgnoreCase("")) {
            throw new Exception("Tên đăng nhập không được rỗng!");
        } else {
            this.id = id;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) throws Exception {
        if (pass.equalsIgnoreCase("")) {
            throw new Exception("Tài khoản không được rỗng!");
        } else {
            this.pass = pass;
        }
    }

    public String isLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public String isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.pass);
        return hash;
    }

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public String getTrangThai() {
        return trangThai;
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
        final TaiKhoan other = (TaiKhoan) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        return true;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final TaiKhoan other = (TaiKhoan) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//    
    

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
}
