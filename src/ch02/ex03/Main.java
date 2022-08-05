package ch02.ex03;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		/*
		if(mapper.insertUser(new User(11, "able", LocalDate.now())) > 0)
			System.out.println("성공 11"); //error, users테이블에서 11을 삭제하면 성공함.
		
		if(mapper.insertUser(new User(12,null,null)) > 0)
			System.out.println("성공 12"); //error, null은 문자도 날짜도 아님.
	
		if(mapper.insertUser2(13, "kianu", LocalDate.of(2022, 8, 15)) > 0)
			System.out.println("성공 13"); //error, sqlMap.xml의 insertUser2 의 파라미터를 못찾음.
										  //Map에서 user2 -> 도메인이 아니기 때문에, SO, 어노테이션쓴다.
		
		*/
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0)
			System.out.println("성공 14");
		
 	}
}