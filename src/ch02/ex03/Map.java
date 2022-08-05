package ch02.ex03;

import java.time.LocalDate;

import org.apache.ibatis.annotations.Param;

import ch02.domain.User;

public interface Map {
	int insertUser(User user); //파라미터로 도메인.
	
	int insertUser2(@Param("userId") int userId, 
					@Param("userName")String userName,
					@Param("regDate")LocalDate regDate); // 문제 멤버변수X
	
	int insertUser3(int userId, String userName, LocalDate regDate);
}
