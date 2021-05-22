package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Mon;

public class CustomTableMon extends AbstractTableModel {

    private final String[] columnName = {"Mã môn", "Tên môn", "Số tín"} ;
    private ArrayList<Mon> list = new ArrayList<>();
    private final Class[] classes = {String.class, String.class, String.class};

    public CustomTableMon(ArrayList<Mon> list) {
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
        switch (column) {
            case 0:
                return list.get(row).getMaMon()+"";
            case 1:
                return list.get(row).getTenMon();
            case 2:
                return list.get(row).getSoTin()+"";
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
