package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.DiemTichLuy;

public class CustomTableTichLuy extends AbstractTableModel{
    
    private final String[] columnName = {"Mã SV", "Học kỳ", "Tổng TC","TBC Học Kỳ", "Ghi chú"};
    private ArrayList<DiemTichLuy> list = new ArrayList<>();
    private final Class[] classes = {String.class, Integer.class,Float.class,Float.class, String.class};
     
     public CustomTableTichLuy(ArrayList<DiemTichLuy> list) {
        this.list = list;
    }
     
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return classes.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0:
                return list.get(row).getSv().getMaSinhVien();
            case 1:
                return list.get(row).getHky();
            case 2:
                return list.get(row).getTongTinChi();
            case 3:
                return list.get(row).getTbcHocKy();
            case 4:
                if(list.get(row).getHky() == 1 && list.get(row).getTbcHocKy() < 0.8)
                    return "Cảnh báo";
                else if(list.get(row).getTbcHocKy() < 1)
                    return "Cảnh báo";
                else if(list.get(row).getTongTinChi() < 12)
                    return "Cảnh báo";
                else
                    return "";
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
        return columnName[column];
    }

}
