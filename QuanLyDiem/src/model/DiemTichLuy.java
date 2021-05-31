package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class DiemTichLuy {
    //public int maSV;
    public SinhVien sv = new SinhVien();
    public int hky;
    public float tongTinChi;
    public float tbcHocKy;

    public DiemTichLuy() {
    }

//    public DiemTichLuy(int maSV, int hky, float tongTinChi, float tbcHocKy) {
//        this.maSV = maSV;
//        this.hky = hky;
//        this.tongTinChi = tongTinChi;
//        this.tbcHocKy = tbcHocKy;
//    }

    public DiemTichLuy(SinhVien sv, int hky, float tongTinChi, float tbcHocKy) {
        this.sv = sv;
        this.hky = hky;
        this.tongTinChi = tongTinChi;
        this.tbcHocKy = tbcHocKy;
    }
    
    
    
    public DiemTichLuy(ResultSet set) {
        try {
            getSv().setMaSinhVien(set.getInt("maSinhVien"));
            setHky(set.getInt("hocKy"));
            setTongTinChi(set.getFloat("TongTin"));
            setTbcHocKy(set.getFloat("TBCHK"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }

        
    }
    
//    public int getMaSV() {
//        return maSV;
//    }
//
//    public void setMaSV(int maSV) {
//        this.maSV = maSV;
//    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }
    
    public int getHky() {
        return hky;
    }

    public void setHky(int hky) {
        this.hky = hky;
    }

    public float getTongTinChi() {
        return tongTinChi;
    }

    public void setTongTinChi(float tongTinChi) {
        this.tongTinChi = tongTinChi;
    }

    public float getTbcHocKy() {
        return tbcHocKy;
    }

    public void setTbcHocKy(float tbcHocKy) {
        this.tbcHocKy = tbcHocKy;
    }

//    @Override
//    public String toString() {
//        return "KetQuaHocTap{" + "maSV=" + maSV + ", hky=" + hky + ", tongTinChi=" + tongTinChi + ", tbcHocKy=" + tbcHocKy + '}';
//    }

    @Override
    public String toString() {
        return "DiemTichLuy{" + "sv=" + sv + ", hky=" + hky + ", tongTinChi=" + tongTinChi + ", tbcHocKy=" + tbcHocKy + '}';
    }
}
