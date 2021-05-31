package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Lop;

public class LopDAO {

    private static LopDAO instance;

    public static LopDAO getInstance() {
        if (instance == null) {
            instance = new LopDAO();
        }
        return instance;
    }

    public ArrayList<Lop> layDSLop() {
        ArrayList<Lop> listLop = new ArrayList<>();
        try {
            String query = "SELECT * FROM Lop";
            ResultSet rs = DataProvider.getInstance().executeQuery(query, (Object) null);
            while (rs.next()) {
                Lop lop = new Lop(rs);
                listLop.add(lop);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            DataProvider.getInstance().closeConection();
        }
        return listLop;
    }

}
