package controller;

import dao.DataProvider;
import javax.swing.JOptionPane;
import model.Diem;
import model.LopDocLap;
import model.Mon;
import model.SinhVien;
import model.TaiKhoan;

public class Controller implements Controllerable {

    private Controller() {
    }

    private static Controller instance;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private String query = "";

    @Override
    public <T> boolean capNhat(T obj) {
        boolean result = true;
        try {
            DataProvider.getInstance().getConnection();
            if (obj instanceof SinhVien) {
                query = "UPDATE SinhVien SET tenSinhVien = ? , anh = ? , maLop = ? ,"
                        + "ngaySinh = ? , gioiTinh = ? , diaChi = ? , trangThai = ? "
                        + "WHERE maSinhVien = ?";

                Object[] objects = {((SinhVien) obj).getTenSinhVien(), ((SinhVien) obj).getAnh(), ((SinhVien) obj).getLop().getMaLop(),
                    ((SinhVien) obj).getNgaySinh(), ((SinhVien) obj).getGioiTinh().equalsIgnoreCase("Nữ"), ((SinhVien) obj).getDiaChi(),
                    ((SinhVien) obj).getTrangThai(), ((SinhVien) obj).getMaSinhVien()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof Diem) {
                query = "UPDATE Diem SET maSinhVien = ? ,maLopDocLap = ? ,hocKy = ? ,diemTX1= ? ,"
                        + "diemTX2= ? ,diemHS2= ? ,diemKTHP= ? WHERE maDiem= ?";
                Object[] objects = {((Diem) obj).getSinhVien().getMaSinhVien(), ((Diem) obj).getLopDocLap().getMaLopDocLap(), ((Diem) obj).getHocKy(), ((Diem) obj).getDiemTX1(),
                    ((Diem) obj).getDiemTX2(), ((Diem) obj).getDiemHS2(), ((Diem) obj).getDiemKTHP(), ((Diem) obj).getMaDiem()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof Mon) {
                query = "UPDATE Mon SET tenMon= ? ,soTin= ? WHERE maMon= ? ";
                Object[] objects = {((Mon) obj).getTenMon(), ((Mon) obj).getSoTin(), ((Mon) obj).getMaMon()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof TaiKhoan) {
                query = "UPDATE TaiKhoan SET pass = ? ,isDisable = ? ,maLop = ?  WHERE id = ?";
                int trangThai = 1;
                if (((TaiKhoan) obj).isTrangThai().equals("Hoạt động")) {
                    trangThai = 0;
                }
                Object[] objects = {((TaiKhoan) obj).getPass(), trangThai, ((TaiKhoan) obj).getLop().getMaLop(), ((TaiKhoan) obj).getId()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            }
        } catch (Exception e) {
            result = false;
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    @Override
    public <T> boolean themMoi(T obj) {
        boolean result = true;
        try {
            if (obj instanceof SinhVien) {
                query = "INSERT INTO SinhVien(tenSinhVien,anh,maLop,ngaySinh,"
                        + "gioiTinh,diaChi,trangThai) "
                        + "VALUES ( ? , ? , ? , ? , ? , ? , ? )";

                Object[] objects = {((SinhVien) obj).getTenSinhVien(), ((SinhVien) obj).getAnh(), ((SinhVien) obj).getLop().getMaLop(), ((SinhVien) obj).getNgaySinh(),
                    ((SinhVien) obj).getGioiTinh().equalsIgnoreCase("Nữ"), ((SinhVien) obj).getDiaChi(), ((SinhVien) obj).getTrangThai(),
                    ((SinhVien) obj).getMaSinhVien()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof Diem) {
                query = "INSERT INTO Diem(maSinhVien,maLopDocLap,hocKy,diemTX1,diemTX2"
                        + ",diemHS2,diemKTHP) "
                        + "VALUES( ? , ? , ? , ? , ? , ? , ? )";
                Object[] objects = {((Diem) obj).getSinhVien().getMaSinhVien(), ((Diem) obj).getLopDocLap().getMaLopDocLap(), ((Diem) obj).getHocKy(),
                    ((Diem) obj).getDiemTX1(), ((Diem) obj).getDiemTX2(), ((Diem) obj).getDiemHS2(), ((Diem) obj).getDiemKTHP()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof Mon) {
                query = "INSERT INTO Mon(tenMon,soTin) VALUES ( ? , ? )";
                Object[] objects = {((Mon) obj).getTenMon(), ((Mon) obj).getSoTin()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof TaiKhoan) {
                query = "INSERT INTO TaiKhoan(id, pass, loaiTaiKhoan, isDisable, maLop "
                        + ") VALUES( ? , ? , ? , ? , ? )";
                Object[] objects = {((TaiKhoan) obj).getId(), ((TaiKhoan) obj).getPass(), 0,
                    0, ((TaiKhoan) obj).getLop().getMaLop()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof LopDocLap) {
                query = "INSERT INTO LopDocLap(maMon,kyHoc,namHoc"
                        + ") VALUES( ? , ? , ? )";
                Object[] objects = {((LopDocLap) obj).getMon().getMaMon(), ((LopDocLap) obj).getKyHoc(), ((LopDocLap) obj).getNamHoc()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            }
        } catch (Exception e) {
            result = false;
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    @Override
    public <T> boolean xoa(T obj) {
        boolean result = true;
        try {
            if (obj instanceof SinhVien) {
                query = "DELETE SinhVien WHERE maSinhVien= ?";
                Object[] objects = {((SinhVien) obj).getMaSinhVien()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof Diem) {
                query = "DELETE Diem WHERE maDiem= ?";
                Object[] objects = {((Diem) obj).getMaDiem()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof Mon) {
                query = "DELETE Mon WHERE maMon= ?";
                Object[] objects = {((Mon) obj).getMaMon()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof TaiKhoan) {
                query = "DELETE TaiKhoan WHERE id= ?";
                Object[] objects = {((TaiKhoan) obj).getId()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            } else if (obj instanceof LopDocLap) {
                query = "DELETE LopDocLap WHERE maLopDocLap= ?";
                Object[] objects = {((LopDocLap) obj).getMaLopDocLap()};
                if (DataProvider.getInstance().executeNonQuery(query, objects) < 1) {
                    result = false;
                }
            }
        } catch (Exception e) {
            result = false;
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
}
