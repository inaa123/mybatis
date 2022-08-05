package ch02.ex03;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		/*
		if(mapper.insertUser(new User(11, "able", LocalDate.now())) > 0)
			System.out.println("���� 11"); //error, users���̺��� 11�� �����ϸ� ������.
		
		if(mapper.insertUser(new User(12,null,null)) > 0)
			System.out.println("���� 12"); //error, null�� ���ڵ� ��¥�� �ƴ�.
	
		if(mapper.insertUser2(13, "kianu", LocalDate.of(2022, 8, 15)) > 0)
			System.out.println("���� 13"); //error, sqlMap.xml�� insertUser2 �� �Ķ���͸� ��ã��.
										  //Map���� user2 -> �������� �ƴϱ� ������, SO, ������̼Ǿ���.
		
		*/
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0)
			System.out.println("���� 14");
		
 	}
}