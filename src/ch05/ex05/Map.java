package ch05.ex05;

import ch05.domain.User;

public interface Map {
	User selectUser(String userName);
}
//파라미터네임 없는 상태에서sql문서 쓰기