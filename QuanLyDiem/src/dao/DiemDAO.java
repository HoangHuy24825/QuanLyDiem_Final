/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Diem;
import model.LopDocLap;
import model.Mon;

/**
 *
 * @author phamh
 */
public class DiemDAO {

    private static DiemDAO instance;

    public static DiemDAO getInstance() {
        if (instance == null) {
            instance = new DiemDAO();
        }
        return instance;
    }

    public ArrayList<Diem> layTTDiemTheoTrang(String maLopGV, int trang, int maLopDocLap, String tenMon) {
        ArrayList<Diem> dsDiem = new ArrayList<>();
        try {
            String query = "SELECT TOP(15)* FROM "
                    + "Diem INNER JOIN SinhVien ON Diem.maSinhVien=SinhVien.maSinhVien "
                    + "INNER JOIN LopDocLap ON Diem.maLopDocLap=LopDocLap.maLopDocLap "
                    + "INNER JOIN MON ON Mon.maMon=LopDocLap.maMon "
                    + "INNER JOIN Lop ON Lop.maLop=SinhVien.maLop "
                    + "WHERE SinhVien.maLop = N'" + maLopGV + "' AND tenMon=N'" + tenMon + "' AND Diem.maLopDocLap=" + maLopDocLap + " AND "
                    + "maDiem NOT IN (SELECT TOP(" + (trang * 15 - 15) + ") Diem.maDiem FROM Diem ) "
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),"
                    + "dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1))";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                Diem diem = new Diem(rs);
                dsDiem.add(diem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsDiem;
    }

    public int layTongSoBanGhi(String maLopGV, String tenMon, int maLopDocLap) {
        int banGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' from Diem "
                    + "INNER JOIN LopDocLap on Diem.maLopDocLap=LopDocLap.maLopDocLap "
                    + "INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon "
                    + "INNER JOIN SinhVien ON SinhVien.maSinhVien=Diem.maSinhVien "
                    + "WHERE SinhVien.maLop = N'" + maLopGV + "' AND tenMon = N'" + tenMon + "' AND Diem.maLopDocLap = " + maLopDocLap;
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

    public int layTongSoBanGhiTimKiem(String maLopGV, String tuKhoa) {
        int banGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' from Diem "
                    + "INNER JOIN LopDocLap on Diem.maLopDocLap=LopDocLap.maLopDocLap "
                    + "INNER JOIN Mon ON Mon.maMon=LopDocLap.maMon "
                    + "INNER JOIN SinhVien ON SinhVien.maSinhVien=Diem.maSinhVien "
                    + "WHERE SinhVien.maLop = ? AND (Diem.maSinhVien LIKE '%" + tuKhoa + "%') OR (tenSinhVien LIKE N'%" + tuKhoa + "%') "
                    + "OR (tenMon LIKE N'%" + tuKhoa + "%') OR (hocKy LIKE '%" + tuKhoa + "%')";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maLopGV);
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

    public int layMaDiemCuoi() {
        int maDiem = 0;
        try {
            String query = "SELECT MAX(maDiem) as maMax from Diem";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                maDiem = rs.getInt("maMax");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return maDiem;
    }

    public ArrayList<Diem> layTTDiemTheoTrangTimKiem(String maLopGV, int trangHienTai, String tuKhoa) {
        ArrayList<Diem> dsDiem = new ArrayList<>();
        try {
            String query = "SELECT TOP(15) * FROM Diem inner join SinhVien ON Diem.maSinhVien=SinhVien.maSinhVien "
                    + "INNER JOIN LopDocLap ON Diem.maLopDocLap = LopDocLap.maLopDocLap "
                    + "INNER JOIN Mon ON LopDocLap.maMon = Mon.maMon "
                    + "INNER JOIN Lop ON Lop.maLop = SinhVien.maLop "
                    + "WHERE SinhVien.maLop = '" + maLopGV + "' AND maDiem NOT IN (SELECT TOP (" + (trangHienTai * 15 - 15) + ") maDiem "
                    + "FROM Diem inner join SinhVien ON Diem.maSinhVien=SinhVien.maSinhVien "
                    + "INNER JOIN LopDocLap ON Diem.maLopDocLap = LopDocLap.maLopDocLap "
                    + "INNER JOIN Mon ON LopDocLap.maMon = Mon.maMon "
                    + "INNER JOIN Lop ON Lop.maLop = SinhVien.maLop "
                    + "WHERE SinhVien.maLop = '" + maLopGV + "' AND (Diem.maSinhVien LIKE '%" + tuKhoa + "%') OR (tenSinhVien LIKE N'%" + tuKhoa + "%') "
                    + "OR (tenMon LIKE N'%" + tuKhoa + "%') OR (hocKy LIKE N'%" + tuKhoa + "%')) "
                    + "AND (Diem.maSinhVien LIKE '%" + tuKhoa + "%') OR (tenSinhVien LIKE N'%" + tuKhoa + "%') "
                    + "OR (tenMon LIKE N'%" + tuKhoa + "%') OR (hocKy LIKE '%" + tuKhoa + "%') ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maLopGV);
            while (rs.next()) {
                Diem diem = new Diem(rs);
                dsDiem.add(diem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsDiem;
    }

    public ArrayList<Diem> layDSDiemTheoLopDocLap(LopDocLap lopDocLap, Mon mon) {
        ArrayList<Diem> dsDiem = new ArrayList<>();
        try {
            String query = "SELECT * FROM "
                    + "Diem INNER JOIN SinhVien ON Diem.maSinhVien=SinhVien.maSinhVien "
                    + "INNER JOIN LopDocLap ON Diem.maLopDocLap=LopDocLap.maLopDocLap "
                    + "INNER JOIN MON ON Mon.maMon=LopDocLap.maMon "
                    + "INNER JOIN Lop ON Lop.maLop=SinhVien.maLop "
                    + "WHERE Mon.maMon=" + mon.getMaMon() + " AND LopDocLap.maLopDocLap=" + lopDocLap.getMaLopDocLap();
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                Diem diem = new Diem(rs);
                dsDiem.add(diem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsDiem;
    }

    public boolean kiemTraMonCoDiem(Mon mon) {
        boolean kq = true;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhiHopLe' FROM Diem "
                    + "INNER JOIN LopDocLap ON Diem.maLopDocLap=LopDocLap.maLopDocLap "
                    + "INNER JOIN MON ON Mon.maMon=LopDocLap.maMon "
                    + "WHERE Mon.maMon=" + mon.getMaMon();
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                kq = rs.getInt("soBanGhiHopLe") > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return kq;
    }

    public int kiemTraDaTonTaiDiem(int maSV, String tenMon, int hocKy) {
        int check = 0;
        try {
            String query = "SELECT dbo.kiemTraSinhVienDaHoc(" + maSV + ",N'" + tenMon + "'," + hocKy + ") AS N'checkDiemTonTai'";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                check = rs.getInt("checkDiemTonTai");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return check;
    }

    public int layHocKyLonNhat(int maSV) {
        int hocKy = 0;
        try {
            String query = "SELECT MAX(hocKy) as N'hocKy' from Diem WHERE maSinhVien = ? ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maSV);
            while (rs.next()) {
                hocKy = rs.getInt("hocKy");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return hocKy;
    }
}
