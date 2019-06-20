package com.pizza.producer.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/*import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;*/
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.pizza.producer.config"})
public class HibernateConfiguration {
	
	/*@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setPackagesToScan("com.pizza.producer.model");
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setHibernateProperties(hibernateProperties());
		return localSessionFactoryBean; 
	}

	
	private Properties hibernateProperties() {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.formate_sql", true);
		properties.put("cache.provider_class", "org.hibernate.cache.NoCacheProvider");
		properties.put("hbm2ddl.auto", "create");
		return null;
	}

	@Bean 
	private DataSource dataSource() {
		// TODO Auto-generated method stub
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springhibernate_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager tnxManager  =  new HibernateTransactionManager();
		tnxManager.setSessionFactory(s);
		return tnxManager;
	}
*/
}
