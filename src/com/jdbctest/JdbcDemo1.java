package com.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author wanghao
 * @date 2022/5/28
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123456");
        String sql = "UPDATE `db1`.`employee` SET `name` = '啊啊啊', `age` = 31, `dep_id` = 1 WHERE `eid` = 1;";
        Statement statement = conn.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        statement.close();
        conn.close();

    }
}
