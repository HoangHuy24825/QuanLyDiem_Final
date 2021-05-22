package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.SinhVien;


public class CustomTableInforSV extends AbstractTableModel{
    private final String[] tenCot = {"Mã sinh viên", "Họ tên"};
    private final Class[] classes = {Integer.class, String.class};
    private ArrayList<SinhVien> dsSinhVien = new ArrayList<>();

    public CustomTableInforSV(ArrayList<SinhVien> dsSinhVien) {
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
