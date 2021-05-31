package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataProvider {

    private static DataProvider instance;

    public static DataProvider getInstance() {
        if (instance == null) {
            instance = new  DataProvider();
        }
        return instance;
    }

    private DataProvider() {
    } 
//    private final Stsame=sa; password=123456";
 //   private final String strConnection= "jdbc:sqlserver://localhost;databaseName=QuanLyDiem;"
//            + "username=sa;password=123456";
    private final String strConnection= "jdbc:sqlserver://localhost;databaseName=QuanLyDiem;IntegratedSecurity=true;";
    private Connection connection = null;

    public void getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(strConnection);
//            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyDiem;"
//                    + "username=sa;password=haikhanh1");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet executeQuery(String query, Object... objs) {
        ResultSet rs = null;
        try {
            getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String queries[] = query.split(" ");
            if (objs.length != 0) {
                int i = 0;
                for (String str : queries) {
                    if (str.equalsIgnoreCase("?")) {
                        preparedStatement.setObject(i+1, objs[i]);
                        i++;
                    }
                }
            }
            rs = preparedStatement.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }

    public int executeNonQuery(String query, Object... objs) {
        int result = 0;
        try {
            getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String queries[] = query.split(" ");
            if (objs.length != 0) {
                int i = 0;
                for (String str : queries) {
                    if (str.equalsIgnoreCase("?")) {
                        preparedStatement.setObject(i+1, objs[i]);
                        i++;
                    }
                }
            }
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }

    public void closeConection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
