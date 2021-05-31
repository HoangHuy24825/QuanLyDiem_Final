package dao;

import java.util.ArrayList;
import model.TaiKhoan;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Lop;

public class TaiKhoanDAO {

    private static TaiKhoanDAO instance;

    private TaiKhoanDAO() {
    }

    public static TaiKhoanDAO getInstance() {
        if (instance == null) {
            instance = new TaiKhoanDAO();
        }
        return instance;
    }

    public ArrayList<TaiKhoan> layDSTaiKhoan(){
        ArrayList<TaiKhoan> listTK = new ArrayList<>();
        try {
            String query = "SELECT * FROM TaiKhoan,Lop WHERE isDisable = 0 AND TaiKhoan.maLop=Lop.maLop";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs);
                listTK.add(tk);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return listTK;
    }

    public ArrayList<TaiKhoan> layDSTatCaTaiKhoan(){
        ArrayList<TaiKhoan> listTK = new ArrayList<>();
        try {
            String query = "SELECT * FROM TaiKhoan,Lop WHERE TaiKhoan.maLop=Lop.maLop";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs);
                listTK.add(tk);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return listTK;
    }
    
    public ArrayList<TaiKhoan> layTaiKhoanTheoID(String id) {
        ArrayList<TaiKhoan> listTK = new ArrayList<>();
        try {
            String query = "SELECT * FROM TaiKhoan,Lop WHERE loaiTaiKhoan = 0 AND TaiKhoan.maLop=Lop.maLop AND id LIKE ? ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, "%" + id + "%");
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs);
                listTK.add(tk);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return listTK;
    }

    public ArrayList<TaiKhoan> layDSTaiKhoanTheoTrang(int trang) {
        ArrayList<TaiKhoan> dsTaiKhoans = new ArrayList<>();
        try {
            String query = "SELECT TOP(15)*  FROM TaiKhoan,Lop WHERE TaiKhoan.maLop=Lop.maLop AND loaiTaiKhoan = 0 AND id NOT IN (SELECT TOP (" + (trang * 15 - 15) + ") id FROM TaiKhoan)";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs);
                dsTaiKhoans.add(tk);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsTaiKhoans;
    }

    public int layTongSoBanGhi() {
        int banGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM TaiKhoan WHERE loaiTaiKhoan = 0";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                banGhi = rs.getInt("soBanGhi");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return banGhi;
    }

    public Boolean doiMatKhau(String username, String newPass) {
        try {
            String query = "Update TaiKhoan set pass = ? where id = ?";
            int rs = DataProvider.getInstance().executeNonQuery(query, newPass, username);
            return rs > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean kiemTraVoHieuHoa(TaiKhoan tk) {
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM TaiKhoan WHERE isDisable = 1 AND id = '"+tk.getId()+"'";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                return rs.getInt("soBanGhi")>0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return false;
    }
}
