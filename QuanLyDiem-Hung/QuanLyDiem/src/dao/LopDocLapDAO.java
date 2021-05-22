package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.LopDocLap;
import java.sql.*;
import model.Mon;

public class LopDocLapDAO {

    private static LopDocLapDAO instance;

    public static LopDocLapDAO getInstance() {
        if (instance == null) {
            instance = new LopDocLapDAO();
        }
        return instance;
    }

    public ArrayList<LopDocLap> layDSLopDocLap(Mon mon) {
        ArrayList<LopDocLap> dsLopDocLap = new ArrayList<>();
        try {
            String query = "SELECT * FROM LopDocLap INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon WHERE Mon.maMon=" + mon.getMaMon();
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                LopDocLap lopDocLap = new LopDocLap(rs);
                dsLopDocLap.add(lopDocLap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsLopDocLap;
    }

    public int laySoLopDaTaoTheoMon(Mon mon, int kyHoc, int namHoc) {
        int kq = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soLopDaTao' FROM "
                    + "LopDocLap INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon "
                    + "WHERE Mon.maMon=" + mon.getMaMon() + " AND kyHoc=" + kyHoc + " AND namHoc=" + namHoc;
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                kq = rs.getInt("soLopDaTao");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return kq;
    }

    public ArrayList<LopDocLap> layDSLopDocLapChuaCoDiem(Mon mon, int kyHoc, int namHoc) {
        ArrayList<LopDocLap> dsLopDocLap = new ArrayList<>();
        try {
            String query = "SELECT *  FROM "
                    + "LopDocLap INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon "
                    + "WHERE Mon.maMon=" + mon.getMaMon() + " AND kyHoc=" + kyHoc + " AND namHoc=" + namHoc
                    + " AND maLopDocLap NOT IN (SELECT maLopDocLap FROM Diem)";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                LopDocLap lopDocLap = new LopDocLap(rs);
                dsLopDocLap.add(lopDocLap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsLopDocLap;
    }

    public ArrayList<LopDocLap> layNamHocTheoTenMon(String tenMon) {
        ArrayList<LopDocLap> dsLopDocLap = new ArrayList<>();
        try {
            String query = "SELECT DISTINCT namHoc FROM LopDocLap "
                    + "INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon "
                    + "WHERE tenMon = ? ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, tenMon);
            while (rs.next()) {
                LopDocLap lopDocLap = new LopDocLap();
                lopDocLap.setNamHoc(rs.getInt("namHoc"));
                dsLopDocLap.add(lopDocLap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsLopDocLap;
    }

    public ArrayList<LopDocLap> layMaLopDocLapTheoMonNamKy(String tenMon, int namHoc, int kyHoc) {
        ArrayList<LopDocLap> dsLopDocLap = new ArrayList<>();
        try {
            String query = "SELECT maLopDocLap FROM LopDocLap "
                    + "INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon "
                    + "WHERE tenMon = N'" + tenMon + "' AND namHoc = '" + namHoc + "' AND kyHoc = '" + kyHoc + "'";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                LopDocLap lopDocLap = new LopDocLap();
                lopDocLap.setMaLopDocLap(rs.getInt("maLopDocLap"));
                dsLopDocLap.add(lopDocLap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsLopDocLap;
    }
    
    public ArrayList<LopDocLap> layKyHocTheoMonVaNam(String tenMon, int namHoc) {
        ArrayList<LopDocLap> dsLopDocLap = new ArrayList<>();
        try {
            String query = "SELECT kyHoc FROM LopDocLap " +
                           "INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon " +
                           "WHERE tenMon = N'" + tenMon + "' AND namHoc = '" + namHoc + "' ORDER BY kyHoc ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                LopDocLap lopDocLap = new LopDocLap();
                lopDocLap.setKyHoc(rs.getInt("kyHoc"));
                dsLopDocLap.add(lopDocLap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsLopDocLap;
    }
    
    public ArrayList<LopDocLap> layTTLopDLTheoMaDiem(int maDiem) {
        ArrayList<LopDocLap> dsLopDocLap = new ArrayList<>();
        try {
            String query =  "SELECT  namHoc, kyHoc, Diem.maLopDocLap FROM LopDocLap " +
                            "INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon " +
                            "INNER JOIN Diem on Diem.maLopDocLap=LopDocLap.maLopDocLap " +
                            "WHERE maDiem = '" + maDiem + "'";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                LopDocLap lopDocLap = new LopDocLap(rs.getInt("maLopDocLap"), rs.getInt("kyHoc"), rs.getInt("namHoc"));
                dsLopDocLap.add(lopDocLap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsLopDocLap;
    }
}
