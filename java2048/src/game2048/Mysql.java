package game2048;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Mysql extends GameView {
    public void connection(int score) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/day?useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String pwd = "hhl123rrg";
        Connection connection = DriverManager.getConnection(url,user,pwd);
        if (connection == null){
            System.out.println("连接失败");
        }else {
            System.out.println("连接成功");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO test VALUES("+score+");";
            System.out.println(sql);

            if (statement.executeUpdate(sql) >= 1){
                System.out.println("插入成功！");
            }else {
                System.out.println("插入失败！");
            }
            connection.close();
        }
    }

}
