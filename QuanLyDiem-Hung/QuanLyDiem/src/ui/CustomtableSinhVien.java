package ui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.SinhVien;

public class CustomtableSinhVien extends AbstractTableModel {

    private final String[] tenCot = {"Mã sinh viên", "Tên sinh viên", "Tên lớp", "Ngày sinh", "Giới tính","Địa chỉ","Trạng thái"};
    private final Class[] classes = {Integer.class, String.class, String.class, String.class, String.class, String.class,String.class};
    private ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public CustomtableSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    @Override
    public int getRowCount() {
        return dsSinhVien.size();
    }

    @Override
    public int getColumnCount() {
        return classes.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dsSinhVien.get(row).getMaSinhVien();
            case 1:
                return dsSinhVien.get(row).getTenSinhVien();
            case 2:
                return dsSinhVien.get(row).getLop().getTenLop();
            case 3:
                return sdf.format(dsSinhVien.get(row).getNgaySinh());
            case 4:
                return dsSinhVien.get(row).getGioiTinh();
            case 5:
                return dsSinhVien.get(row).getDiaChi();
            case 6:
                int trangThai=dsSinhVien.get(row).getTrangThai();
                switch (trangThai) {
                    case 0:
                        return "Thôi học";
                    case 1: 
                        return "Đang học";
                    case 2:
                        return "Bảo lưu";
                    default:
                        return "Đã ra trường";
                }

             default: return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return tenCot[column];
    }

}
