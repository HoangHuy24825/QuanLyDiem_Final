package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Diem;

public class CustomTableDiem extends AbstractTableModel {

    private final String[] columnName = {"Mã sinh viên", "Họ tên","Mã lớp","Tên môn", "Học kỳ",
        "Điểm TX1", "Điểm TX2", "Điểm HS2", "Điểm KTHP", "ĐTB"};
    private ArrayList<Diem> list = new ArrayList<>();
    private final Class[] classes = {String.class, String.class,String.class,String.class, Integer.class,
        Float.class, Float.class, Float.class, Float.class, Double.class};

    public CustomTableDiem() {
    }
    
    public CustomTableDiem(ArrayList<Diem> list) {
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
                return list.get(row).getSinhVien().getMaSinhVien();
            case 1:
                return list.get(row).getSinhVien().getTenSinhVien();
            case 2:
                return list.get(row).getSinhVien().getLop().getMaLop();
            case 3:
                return list.get(row).getLopDocLap().getMon().getTenMon();
            case 4:
                return list.get(row).getHocKy();
            case 5:
                return list.get(row).getDiemTX1();
            case 6:
                return list.get(row).getDiemTX2();
            case 7:
                return list.get(row).getDiemHS2();
            case 8:
                return list.get(row).getDiemKTHP();
            case 9:
                return list.get(row).diemTrungBinh();
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
