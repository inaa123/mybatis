package ch05.ex07;

import java.util.List;

import ch05.domain.User;

public interface Map {
	List<User> selectUsers(int[] userIds); //�޼��忡�� �Ķ���ͷ� �÷���?�ޱ�! �������� �ƴ�
	List<User> selectUsers2(List<String> userNames);
}
//�÷���?�� �ΰ��� : �迭, List