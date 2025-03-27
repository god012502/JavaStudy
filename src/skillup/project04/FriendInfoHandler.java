package skillup.project04;

import java.util.Scanner;

public class FriendInfoHandler{
	/*
	 	멤버변수 
	 	상속관계에 있어 최상위 클래스인 Friend로 
	 	배열을 생성한다.
	 	클래스가 상속관계에 있다면 상위클래스 배열에 하위클래스의
	 	인스턴스를 저장할 수 있다.
	 */
	//멤버변수 
	private Friend[] myFriends;
	//정보 카운트용 변수 생성
	private int numOfFriends;
	//생성자
	public FriendInfoHandler(int num) {
		/*
		 	핸들러 클래스의 인스턴스를 생성할 때 데이터 저장을 위한
		 	Friend타입의 배열 인스턴스도 함께 생성한다.
		 	크기는 num으로 지정한다
		 */
		myFriends=new Friend[num];
		//카운트용 변수는 0으로 초기화
		numOfFriends=0;
	}
	
	//연락처 정보 추가를 위한 메서드
	//친구 정보 추가
	public void addFriend(int choice) {
//		System.out.println("addFriend 호출됨");
		//공통정보 3가지를 먼저 입력받는다
		Scanner scan=new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름"); iName=scan.nextLine();
		System.out.print("전화번호"); iPhone=scan.nextLine();
		System.out.print("이름"); iAddr=scan.nextLine();
		/*
		 	1,2번을 구분해서 각 인스턴스를 생성한 후 저장은
		 	부모타입인 friend 배열에 저장한다.
		 	즉 상속을 통해 타입이 다른 자식 인스턴스를 통합적으로 관리할 수 있다
		 */
		if(choice==1) {
			System.out.print("별명:");iNickname=scan.nextLine();
			HighFriend high=new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++]=high;
		}
		else if(choice==2) {
			System.out.print("전공:");iMajor=scan.nextLine();
			myFriends[numOfFriends++]=new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		/*
		 	High, Univ 타입의 인스턴스를 Friend타입의 배열에 추가할 때에는 자동 형변환이 일어난다.
		 	정수를 실수타입의 변수에 저장할 때 자동 형변환이 되는 것과 동일한 현상이라고 생각하면 된다.
		 	즉, High.Univ 인스턴스는 Friend 타입의 인스턴스로 자동 형변환되어 저장된다.
		 */
		System.out.println("##친구정보 입력이 완료되었습니다##");
	}	
//저장된 연락처 전체정보 출력
	public void showAllData() {
		System.out.println("showAllData 호출됨");
		//배열에 저장된 정보의 갯수만큼 반복
		
		
		/*
		 	myFriends[i].showAllData();
		 	
		 	코드가 한줄로도 실행이 되는 이유
		 	MyFriend[i]=변수명.동일한 메서드명을 이용하여 오버라이딩을 함으로써 
		 	상속관계 부모클래스인 Friend에서 자식클래스인 High, Univ클래스로
		 	업캐스팅(자동형변환)이 됨으로써 코드가 한줄로 단축되었어도
		 	실행이 잘됨을 알수가 있다.
		 */
		
		
		for(int i=0; i<numOfFriends; i++) {
				myFriends[i].showAllData();
		}
		System.out.println("##전체정보가 출력되었습니다.");
}
		
//	저장된 연락처 간략정보 출력
	public void showSimpleData() {
		System.out.println("showSimpleData 호출됨##");
		/*
		 	저장된 인스턴스의 갯수만큼 반복해서 각 인스턴스가 원래 
		 	어떤 타입이었는지 확인 한 후 원래의 타입으로 형변환한다.
		 */
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("##간략정보가 출력되었습니다##");
	}	
				
		
//연락처 정보 검색
	public void searchInfo() {
		System.out.println("searchInfo 호출됨");
		//검색 결과 저장용 변수
		boolean isFind=false;
		Scanner scan=new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요");
		String searchName=scan.nextLine();
		//저장된 정보의 갯수만큼 반복
		for(int i=0; i<numOfFriends; i++) {
			//검색할 이름과 일치하는지 확인
			if(searchName.compareTo(myFriends[i].name)==0) {
				myFriends[i].showAllData();
				System.out.println("##귀하가 요청하는 정보를 찾았습니다.##");
				//정보를 찾아다면 true로 변경
				isFind=true;
			}
		}
		if(isFind==false)
			System.out.println("##찾는 정보가 없습니다##");
	}

	//연락처 정보 삭제
	public void deleteInfo() {
		System.out.println("##deleteInfo 호출됨##");
		Scanner scan=new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요");
		String deleteName=scan.nextLine();
		//삭제할 인스턴스의 인덱스 저장용 변수
		int deleteIndex=-1;
		//갯수만큼 반복
		for(int i=0; i<numOfFriends; i++) {
			//일치하는 이름 검색
			if(deleteName.equals(myFriends[i].name)) {
				//일치하는 정보가 있다면 null로 변경해서 삭제
				myFriends[i]=null;
				//인덱스 저장
				deleteIndex=i;
				//전체카운트 1감소
				numOfFriends--;
				//반복문 탈출
				break;
			}
		}
		if(deleteIndex==-1) {
			//-1을 유지한다면 삭제된 인스턴스가 없는것으로 간주
			System.out.println("##삭제된 데이터가 없습니다.##");
		}
		else {
			//삭제되었다면 해당 인덱스부터 마지막까지 반복해서
			for(int i=deleteIndex; i<numOfFriends; i++) {
				//한 칸씩 앞으로 인스턴스를 이동시킨다.
				myFriends[i]=myFriends[i+1];
			}
			System.out.println("##데이터("+deleteIndex+"번)가 삭제되었습니다##");
		}
	}
}


