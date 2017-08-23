package com.exam.demo.config;


import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;

@Configuration
@EnableTransactionManagement
public class AppConfig {

    //You should change it to your oracle  db Url on server if using in production
    private  static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE";


    private static  final String DB_USERNAME= "Your Oracle Database URL HERE ";
    private  static final String DB_PASSWORD = "Your Oracle Database Password Here";

    @Bean(name = "dataSource")
    public OracleDataSource DataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();

        // Set credentials for your datasource
        dataSource.setURL(ORACLE_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);

        return dataSource;
    }

}

