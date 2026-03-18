package ch18;

import java.sql.*;

public class DBDemo {
  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/test?serverTimezone=Asia/Seoul";

    Connection con = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      System.out.println("1. 데이터베이스 연결중 ...");
      con = DriverManager.getConnection(url, "root", "11111111");
      System.out.println("1. 데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다...");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
      System.out.println(e.getMessage());
    }
    return con;

  }

  public static void main(String[] args) {
    Connection con = makeConnection();// MySql 드라이버 연결하고 접속한 con을 반환해주는 메서드 호출
    String sql = "select * from table1";

    Statement stmt = null;
    try {
      stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String address = rs.getString("address");
        System.out.println("id : " + id + ", name : " + name + ", address : " + address);

      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }


  }

}
