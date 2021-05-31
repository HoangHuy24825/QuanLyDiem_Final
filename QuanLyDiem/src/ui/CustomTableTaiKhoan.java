package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.TaiKhoan;

/**
 *
 * @author HKhanh
 */
public class CustomTableTaiKhoan extends AbstractTableModel{
    private String name[]={"Tên đăng nhập","Trạng Thái", "Lớp quản lý"} ;
    private Class classes[]={String.class,String.class, String.class};

    ArrayList<TaiKhoan> list=new ArrayList<>();

    public CustomTableTaiKhoan(ArrayList<TaiKhoan> list)
   {
       this.list=list;
   }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }

    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    
    /**
     *
     * @param rowIndex
     * @param columnIndex
     * @return
     */
    @Override
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return list.get(rowIndex).getId();
            case 1: return list.get(rowIndex).isTrangThai();
            case 2: return list.get(rowIndex).getLop().getMaLop();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
