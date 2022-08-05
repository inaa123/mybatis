package ch05.ex04;

import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		System.out.println(mapper.updateUser(new User(2, "king", null)));
		//1이 나오는데, 업데이트 된 로우의 개수를 나타냄!
	}
}
