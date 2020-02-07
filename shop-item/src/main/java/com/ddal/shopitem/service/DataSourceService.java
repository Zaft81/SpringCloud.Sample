package com.ddal.shopitem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Ryan
 * @version 1.0
 * @date 2/5/2020
 */
@Service
public class DataSourceService {

    private DataSource dataSource;



    public void insertUser() throws SQLException {
        Connection connection = dataSource.getConnection();
        try {

            connection.setAutoCommit(false);



            connection.commit();
        }catch(Exception e){
            connection.rollback();
        }

    }
}
