package com.scme.datasource;//package com.itmayiedu.datasource;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//@Configuration // 注册到springboot容器中
//@MapperScan(basePackages = "com.itmayiedu.test01", sqlSessionFactoryRef = "test1SqlSessionFactory")
//public class DataSource1Config {
//
//	/**
//	 * @returnType:@return DataSource
//	 */
//	@Bean(name = "test1DataSource")
//	@ConfigurationProperties(prefix = "spring.datasource.test1")
//	@Primary
//	public DataSource testDataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	/**
//	 * @param: @param
//	 *             dataSource
//	 * @param: @return
//	 * @param: @throws
//	 *             Exception
//	 * @createTime:2017年9月17日 下午3:17:08
//	 * @returnType:@param dataSource
//	 */
//	@Bean(name = "test1SqlSessionFactory")
//	@Primary
//	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
//			throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		//mybatis写配置文件
////		 bean.setMapperLocations(
////		 new
////		 PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
//		return bean.getObject();
//	}
//
//	/**
//	 * @param: @param
//	 *             dataSource
//	 * @param: @return
//	 * @param: @throws
//	 *             Exception
//	 * @createTime:2017年9月17日 下午3:17:08
//	 * @returnType:@param dataSource
//	 * @returnType:@return
//	 * @returnType:@throws Exception SqlSessionFactory
//	 */
//	@Bean(name = "test1TransactionManager")
//	@Primary
//	public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//	@Bean(name = "test1SqlSessionTemplate")
//	@Primary
//	public SqlSessionTemplate testSqlSessionTemplate(
//			@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//
//}
