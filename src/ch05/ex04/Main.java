package ch05.ex04;

import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		System.out.println(mapper.updateUser(new User(2, "king", null)));
		//1�� �����µ�, ������Ʈ �� �ο��� ������ ��Ÿ��!
	}
}
