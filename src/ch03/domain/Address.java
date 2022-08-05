package ch03.domain;

public class Address {
	private String address; 
	
	@Override
	public String toString() {
		return address;
	}
}
/*
address는 user와 관계맺어서 쓸거기때문에 useriD는 작성하지 X(멤버변수로x)
*/