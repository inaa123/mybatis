package ch07.ex01;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import ch07.domain.User;

public interface Map {
	@Select("select user_id userId, user_name userName, reg_date regDate "
			+ "from users "
			+ "order by user_id") //쿼리를 어노테이션으로..?, 단점 스파게티코드(자카,sql코드 섞임) 쓰지마.
	List<User> selectUsers();
	
	
}
