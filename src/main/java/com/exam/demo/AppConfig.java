package com.exam.demo;


import oracle.jdbc.pool.OracleDataSource;
import org.hibernate.cfg.Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.activation.DataSource;
import java.sql.SQLException;

@Configuration
@EnableTransactionManagement
public class AppConfig {



    @Bean(name = "dataSource")
    public OracleDataSource DataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();

        // See: datasouce-cfg.properties
        dataSource.setURL("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setUser("ssotest");
        dataSource.setPassword("centricgateway");

        System.out.println("## getDataSource: " + dataSource);

        return dataSource;
    }

}

