package config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Configuration {
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			/* ch06시 위에 reader와 sqlsessionfactory 주석처리하고 이건 주석해제, ch07때 다시 돌아옴.
			InputStream stream = Resources.getResourceAsStream("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream, "hr");
			*/
		} catch(Exception e) {}
	}
	
	public static <T> T getMapper(Class<T> arg) {
		return sqlSessionFactory.openSession(true).getMapper(arg);
	}
}
