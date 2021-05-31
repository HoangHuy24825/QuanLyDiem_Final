package dao;

import java.util.ArrayList;
import model.Mon;
import java.sql.*;
import javax.swing.JOptionPane;

public class MonDAO {

    private static MonDAO instance;

    public static MonDAO getInstance() {
        if (instance == null) {
            instance = new MonDAO();
        }
        return instance;
    }

    public ArrayList<Mon> layDSMon() {
        ArrayList<Mon> dsMon = new ArrayList<>();
        try {
            String query = "SELECT * FROM Mon WHERE isDeleted = 0";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                Mon mon = new Mon(rs);
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsMon;
    }

    public ArrayList<Mon> layDSMonTheoTrang(int trang) {
        ArrayList<Mon> dsMon = new ArrayList<>();
        try {
            String query = "SELECT TOP(15)*  FROM Mon WHERE isDeleted = 0 AND maMon NOT IN "
                    + "(SELECT TOP (" + (trang * 15 - 15) + ") maMon FROM Mon WHERE isDeleted = 0 ORDER BY tenMon ASC )"
                    + " ORDER BY tenMon ASC";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                Mon mon = new Mon(rs);
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsMon;
    }

    public int layTongSoBanGhi() {
        int banGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM Mon WHERE isDeleted = 0";
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

    public int layMaxMaMon() {
        int maxMaMon = 0;
        try {
            String query = "SELECT MAX(maMon) AS 'maxMaMon' FROM Mon WHERE isDeleted = 0";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                maxMaMon = rs.getInt("maxMaMon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return maxMaMon;
    }

    public int layTongSoBanGhiTimKiem(String tuKhoa) {
        int banGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM Mon WHERE isDeleted = 0 AND (maMon LIKE '%"
                    + tuKhoa + "%') OR (tenMon LIKE N'%" + tuKhoa + "%') ";
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

    public ArrayList<Mon> layDSMonTheoTrangTimKiem(int trangHienTai, String tuKhoa) {
        ArrayList<Mon> dsMon = new ArrayList<>();
        try {
            String query = "SELECT TOP(15)*  FROM Mon "
                    + "WHERE isDeleted = 0 AND (maMon LIKE '%" + tuKhoa + "%') OR (tenMon LIKE '%" + tuKhoa + "%') AND "
                    + "maMon NOT IN (SELECT TOP (" + (trangHienTai * 15 - 15) + ") maMon "
                    + "FROM Mon  WHERE isDeleted = 0 AND "
                    + "(maMon LIKE '%" + tuKhoa + "%') OR (tenMon LIKE '%" + tuKhoa + "%') ORDER BY tenMon ASC ) "
                    + "ORDER BY tenMon ASC";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                Mon mon = new Mon(rs);
                dsMon.add(mon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return dsMon;
    }

    public int laySoTinChiTheoTenMon(String value) {
        int soTC = 0;
        try {
            String query = "SELECT soTin FROM Mon WHERE tenMon= ? ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, value);
            while (rs.next()) {
                soTC = rs.getInt("soTin");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return soTC;
    }
}