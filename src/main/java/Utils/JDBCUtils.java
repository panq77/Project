package Utils;

import java.sql.*;

public class JDBCUtils {
    private static Connection conn=null;
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tedu_store","root","365487740");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static  void  CloseAll(Connection conn,PreparedStatement ps,ResultSet rs){
                try {
                    if(conn!=null)  conn.close();
                    if(ps!=null)  ps.close();
                    if(rs!=null)  ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
    }
}
