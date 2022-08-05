package ch05.ex07;

import java.util.List;

import ch05.domain.User;

public interface Map {
	List<User> selectUsers(int[] userIds); //메서드에서 파라미터로 컬렉션?받기! 도메인이 아닌
	List<User> selectUsers2(List<String> userNames);
}
//컬렉션?은 두가지 : 배열, List