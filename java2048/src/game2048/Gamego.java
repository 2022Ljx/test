package game2048;

//import java.sql.SQLException;
public class Gamego {
    public static void main(String[] args) {
        GameView gameView = new GameView();
        gameView.showView();

        //下面代码为测试数据库的连接是否有用，用时将上面代码注释
//        new GameView().showView();
//          Mysql mysql = new Mysql();
//          try {
//              mysql.connection(200);
//          } catch (ClassNotFoundException | SQLException e) {
//            throw new RuntimeException(e);
//          }

    }

}