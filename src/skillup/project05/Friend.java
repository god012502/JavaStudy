package skillup.project05;
/*
	3단계까지는 최상위 클래스였으나 4단계에서는 interface를 도입하므로
	'구현' 받아 사용한다. 정의된 멤버메서드는 오버라이딩 되므로 
	어노테이션을 추가 해야 한다
 */
abstract public class Friend implements IFriend  {
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	@Override
	public void showAllData() {
		System.out.println("이름:"+name);
		System.out.print(", 전화번호:"+phone);
		System.out.print(", 주소"+addr);		
	}
	@Override
	public void showBasicInfo() {}
}
