package com.ivs.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
@ComponentScan(basePackages = { "com.ivs.service" })
public class MyBatisDbConfig {
	
	/*
     * Create bean dataSource
     * 
     * */
	@Bean
    public DriverManagerDataSource dataSource() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass().getResourceAsStream("/jdbc.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(properties.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource.url"));
        dataSource.setUsername(properties.getProperty("spring.datasource.username"));
        dataSource.setPassword(properties.getProperty("spring.datasource.password"));
        return dataSource;
    }
	
	/*
     * Read MyBatisMapConfig.xml file
     * 
     * */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        Resource resource = new ClassPathResource("MyBatisMapConfig.xml");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(resource);
        return sqlSessionFactory;
    }
    
    /*
     * scan all mapped package from com.ivs.dao
     * 
     * */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.ivs.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
