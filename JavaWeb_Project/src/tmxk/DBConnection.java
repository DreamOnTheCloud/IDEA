package tmxk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    public static void main(String[] args) {
        String dbName = "unit7website";
        String userName = "root";
        String userPasswd = "3715";
        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd; //定义url集成他们
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //注册驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


