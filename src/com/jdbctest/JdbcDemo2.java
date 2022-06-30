package com.jdbctest;


import java.sql.*;

/**
 * @author wanghao
 * @date 2022/6/22
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        Statement statement =null;
        Connection conn = null;
        ResultSet result = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "SELECT * FROM departments";
            conn = DriverManager.getConnection("jdbc:mysql:///employees", "root", "123456");
            statement = conn.createStatement();
            result = statement.executeQuery(sql);
            System.out.println("dept_no\t\tdept_name");
            while(result.next()){
                int i = result.getInt(1);
                String str = result.getString(2);
                System.out.println(i+"\t\t"+str);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(result!=null){
                try {
                    result.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
