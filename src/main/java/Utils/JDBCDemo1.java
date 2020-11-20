package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo1 {
    private static Connection conn=null;
    private static PreparedStatement ps=null;
    public static void main(String[] args) {
        JavaB javaB = new JavaB(4,232,111);
        addData(javaB);

    }
    public static void addData(JavaB javaB){
         conn=JDBCUtils.getConn();
        String sql="insert into t1 values(?,?,?)";
        try {
           ps = conn.prepareStatement(sql);
            ps.setInt(1,javaB.getId());
            ps.setInt(2,javaB.getIdddd());
            ps.setInt(3,javaB.getIdd());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.CloseAll(conn,ps,null);
         }

    }
}
