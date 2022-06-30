package com.jdbctest;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

/**
 * @author wanghao
 * @date 2022/6/30
 */
public class Template2Test {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    @Test
    public void test1(){

        String sql = "update departments set dept_name='研发部' where dept_no = 1";
        int update = template.update(sql);
        System.out.println(update);
    }
    @Test
    public void test2(){

        String sql ="insert into departments values(?,?)";
        int update = template.update(sql, 2, "测试部");
        System.out.println(update);

    }

    @Test
    public void test3() {
        String sql = "select * from departments where dept_no=?";
        Map<String, Object> stringObjectMap = template.queryForMap(sql, 1);
        System.out.println(stringObjectMap);
    }
}
