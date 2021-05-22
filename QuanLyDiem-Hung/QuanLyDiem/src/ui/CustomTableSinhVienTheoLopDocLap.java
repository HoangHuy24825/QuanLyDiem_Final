package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Diem;

public class CustomTableSinhVienTheoLopDocLap extends AbstractTableModel {

    private String[] tenCot = {"Mã sinh viên", "Tên sinh viên", "Điểm TX1", "Điểm TX2", "Điểm HS2", "Điểm KTHP", "Điểm TB"};
    private Class[] classes = {Integer.class, String.class, Float.class, Float.class, Float.class, Float.class, Double.class};
    private ArrayList<Diem> dsDiem = new ArrayList<>();

    public CustomTableSinhVienTheoLopDocLap(ArrayList<Diem> dsDiem) {
        this.dsDiem = dsDiem;
    }

    @Override
    public int getRowCount() {
        return dsDiem.size();
    }

    @Override
    public int getColumnCount() {
        return classes.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dsDiem.get(row).getSinhVien().getMaSinhVien();
            case 1:
                return dsDiem.get(row).getSinhVien().getTenSinhVien();
            case 2:
                return dsDiem.get(row).getDiemTX1();
            case 3:
                return dsDiem.get(row).getDiemTX2();
            case 4:
                return dsDiem.get(row).getDiemHS2();
            case 5:
                return dsDiem.get(row).getDiemKTHP();
            case 6:
                return dsDiem.get(row).diemTrungBinh();
            default:
                return null;

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
