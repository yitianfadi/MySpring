package com.zzkun.dao;

import com.zzkun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Repository用于标注数据访问组件，即DAO组件
 * Created by kun on 2016/5/5.
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void register(User resource) {
        String sql = "insert into resource(isbnNumber, path) values(?, ?)";
        jdbcTemplate.update(sql, resource.getIsbnNumber(), resource.getPath());

    }
    public User findIsbnNumber(String isbnNumber) {
        String sql = "select id, isbnNumber, path from resource where isbnNumber=?";
        User resource = new User();
        jdbcTemplate.query(sql, new Object[]{isbnNumber}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                resource.setId(resultSet.getInt("id"));
                resource.setIsbnNumber(resultSet.getString("isbnNumber"));
                resource.setPath(resultSet.getString("path"));
            }
        });
        return resource;
    }
}
