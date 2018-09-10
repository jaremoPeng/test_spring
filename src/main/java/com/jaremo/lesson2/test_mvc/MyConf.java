package com.jaremo.lesson2.test_mvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyConf {
	/*
	 * <context:property-placeholder location="classpath:prop.properties"/> 只要配置文件中引用了外部文件
	 * 此@Value("${}")注解 相当于 <property name="xxx" value="${xxx}"></property>
	 */
	@Value("${url}")
	private String url;
	@Value("${user}")
	private String username;
	@Value("${pwd}")
	private String password;
	@Value("${driverClass}")
	private String driverClassName;
	
	@Bean // 定义在方法上面,告诉容器这个也是个bean , 以方法名作为id,以返回值作为bean 
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource); // 但是这个注解不是让spring容器来构建bean,而是手动去new
	}
	
	@Bean // 换种说法  根据方法的返回值生成一个bean , 以方法名作为id,放回spring容器中
	public DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(url);
		dmds.setUsername(username);
		dmds.setPassword(password);
		dmds.setDriverClassName(driverClassName);
		return dmds;
	}

}
