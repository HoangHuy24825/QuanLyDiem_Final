package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Diem;
import model.DiemTichLuy;
import model.SinhVien;

public class SinhVienDAO {

    private static SinhVienDAO instance;

    public static SinhVienDAO getInstance() {
        if (instance == null) {
            instance = new SinhVienDAO();
        }
        return instance;
    }

    public int layTongSoBanGhi(String maLop) {
        int soBanGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM SinhVien ,Lop WHERE SinhVien.maLop=Lop.maLop AND SinhVien.maLop = ?";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maLop);
            while (rs.next()) {
                soBanGhi = rs.getInt("soBanGhi");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return soBanGhi;
    }

    public ArrayList<SinhVien> layDSSVTheoTrang(String maLop, int trangHienTai) {
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        try {
            String query = "SELECT TOP(15)* FROM SinhVien,Lop WHERE SinhVien.maLop=Lop.maLop AND SinhVien.maLop = ? AND maSinhVien NOT IN "
                    + "(SELECT TOP(" + (trangHienTai * 15 - 15) + ") maSinhVien FROM SinhVien,Lop WHERE SinhVien.maLop=Lop.maLop "
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1))) "
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1))";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maLop);
            while (rs.next()) {
                SinhVien sv = new SinhVien(rs);
                dsSinhVien.add(sv);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsSinhVien;
    }

    public int layMaxMaSinhVien() {
        int maxMaSV = 0;
        try {
            String query = "SELECT MAX(maSinhVien) AS 'soBanGhi' FROM SinhVien ,Lop WHERE SinhVien.maLop=Lop.maLop";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                maxMaSV = rs.getInt("soBanGhi");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return maxMaSV;
    }

    public int layTongSoBanGhiTimKiem(String maLop, String tuKhoa) {
        int banGhi = 0;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM SinhVien INNER JOIN Lop ON SinhVien.maLop=Lop.maLop WHERE SinhVien.maLop = ? AND (maSinhVien LIKE '%"
                    + tuKhoa + "%') OR (tenSinhVien LIKE '%" + tuKhoa + "%') ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maLop);
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

    public ArrayList<SinhVien> layDSSVTheoTrangTimKiem(String maLop, int trangHienTai, String tuKhoa) {
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        try {
            String query = "SELECT TOP(15)*  FROM SinhVien INNER JOIN Lop ON Lop.maLop=SinhVien.maLop "
                    + "WHERE SinhVien.maLop = ? AND (maSinhVien LIKE '%" + tuKhoa + "%') OR (tenSinhVien LIKE N'%" + tuKhoa + "%') AND "
                    + "maSinhVien NOT IN (SELECT TOP (" + (trangHienTai * 15 - 15) + ") maSinhVien "
                    + "FROM SinhVien INNER JOIN Lop ON Lop.maLop=SinhVien.maLop "
                    + "WHERE (maSinhVien LIKE '%" + tuKhoa + "%') OR (tenSinhVien LIKE '%" + tuKhoa + "%') "
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1))) "
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1))";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maLop);
            while (rs.next()) {
                SinhVien sv = new SinhVien(rs);
                dsSV.add(sv);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsSV;
    }

    public String layTenSVTheoMa(int value) {
        String name = "";
        try {
            String query = "SELECT tenSinhVien FROM SinhVien where maSinhVien = ? ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, value);
            while (rs.next()) {
                name = rs.getString("tenSinhVien");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return name;
    }

    public int kiemTraMaSV(int value) {
        int check = 0;
        try {
            String query = "SELECT dbo.kiemTraMaSinhVien( ? ) AS N'checkSV'";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, value);
            while (rs.next()) {
                check = rs.getInt("checkSV");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return check;
    }

    public ArrayList<SinhVien> layMaVaTenSVTheoLop(String maLopGV) {
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        try {
            String query = "SELECT maSinhVien, tenSinhVien FROM SinhVien "
                    + "INNER JOIN Lop on SinhVien.maLop = Lop.maLop "
                    + "WHERE SinhVien.maLop = N'" + maLopGV + "'"
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),"
                    + "dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1))";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                SinhVien sv = new SinhVien(rs.getInt("maSinhVien"), rs.getString("tenSinhVien"));
                dsSinhVien.add(sv);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return dsSinhVien;
    }

    public boolean checkSinhVienCoDiem(int maSV) {
        boolean kq = true;
        try {
            String query = "SELECT COUNT(*) AS 'soBanGhi' FROM Diem INNER JOIN SinhVien ON SinhVien.maSinhVien=Diem.maSinhVien "
                    + "WHERE SinhVien.maSinhVien = ?";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, maSV);
            while (rs.next()) {
                kq = rs.getInt("soBanGhi") > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return kq;
    }

    public ArrayList<DiemTichLuy> layDiemTichLuy(int masv) {
        ArrayList<DiemTichLuy> ds = new ArrayList<>();
        try {
            String query = "SELECT d.maSinhVien,hocKy, sum(soTin) AS TongTin, SUM(dbo.tinhDiemTB(maDiem)*dbo.soTinChi(maDiem))/sum(soTin) AS N'TBCHK' "
                    + "FROM  Diem d INNER JOIN LopDocLap ldl ON d.maLopDocLap = ldl.maLopDocLap "
                    + "INNER JOIN Mon m ON ldl.maMon = m.maMon "
                    + "WHERE d.maSinhVien = ? "
                    + "GROUP BY hocKy, d.maSinhVien";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, masv);
            while (rs.next()) {
                DiemTichLuy diem = new DiemTichLuy(rs);
                ds.add(diem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return ds;
    }

    public ArrayList<Diem> layKQHocTap(int masv) {
        ArrayList<Diem> ds = new ArrayList<>();
        try {
            String query = "SELECT * FROM "
                    + "Diem INNER JOIN SinhVien ON Diem.maSinhVien=SinhVien.maSinhVien "
                    + "INNER JOIN LopDocLap ON Diem.maLopDocLap=LopDocLap.maLopDocLap "
                    + "INNER JOIN MON ON Mon.maMon=LopDocLap.maMon "
                    + "INNER JOIN Lop ON Lop.maLop=SinhVien.maLop "
                    + "WHERE SinhVien.maSinhVien= ? "
                    + "ORDER BY dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,3)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,2)),dbo.F_ConvertToUnsigned(dbo.F_TachTen(tenSinhVien,1)) ";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, masv);
            while (rs.next()) {
                Diem diem = new Diem(rs);
                ds.add(diem);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return ds;
    }

    public void thayDoiTrangThaiSV(int trangThai, int maSV) {
        try {
            String query = "UPDATE SinhVien set trangThai = ? WHERE maSinhVien = ?";
            int result = DataProvider.getInstance().executeNonQuery(query, trangThai, maSV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
            DataProvider.getInstance().closeConection();
        }
    }
}
