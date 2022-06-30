package com.jdbctest;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author wanghao
 * @date 2022/6/30
 */
public class TemplateTest {
    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "select * from departments";
        List<Dep> list = template.query(sql, new BeanPropertyRowMapper<Dep>(Dep.class));
        for (Dep dep : list) {
            System.out.println(dep);
        }
    }
}
