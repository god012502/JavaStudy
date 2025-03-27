package ex07string;
public class E02StringMethod4 {
	public static void main(String[] args) {
		//시나리오 1]
		/*
	  	2]charAt(인덱스) : 문자열에서 특정 index에 해당하는 문자하나를 반환한다.
	  					  index는 배열과 같이 0부터 시작한다.
	 */
    String str1 = "190419-3000000";
	String str2 = "190419-4000000";	
	System.out.println("str1의 성별 :"+str1.charAt(7));
	System.out.println("str2의 성별 :"+str2.charAt(7));
	System.out.println("[시나리오 1]\n주민등록번호를 보고 성별이 무엇인지 나타내시오");
	if(str1.charAt(7)==3) {
		System.out.println("성별은 남성입니다");
	}
	else if(str1.charAt(7)==4) {
		System.out.println("성별은 여성입니다.");
		}
	if(str2.charAt(7)==3) {
		System.out.println("성별은 남성입니다");
	}
	else if(str2.charAt(7)==4) {
		System.out.println("성별은 여성입니다.");
		}
	

	//시나리오2]
	/*
 	5]contains() : 문자열에 특정 문자열이 포함된 경우 true를 반환한다.
 */
	String email1="hong@daum.net";
	String email2="not@naver";
	System.out.println("[시나리오2]\n문자열이 이메일 형식인지 나타내시오");
	
	if(email1.contains(".")) {
		System.out.println("이메일 형식입니다.");
	}else {
		System.out.println("이메일 형식이 아닙니다.");
	}
	
	if(email2.contains(".")) {
		System.out.println("이메일 형식입니다.");
	}else {
		System.out.println("이메일 형식이 아닙니다.");
	}
	
	
	//시나리오3]
	/*
 	10]indexOf() : 문자열에서 특정 문자열의 시작인덱스를 반환한다.
 				   만약 존재하지 않으면 -1을 반환한다.
 				   인덱스는 0부터 시작이므로 -1은 
 				   해당 문자열이 없다는 의미로 해석할 수 있다.
 	2]charAt(인덱스) : 문자열에서 특정 index에 해당하는 문자하나를 반환한다.
		  index는 배열과 같이 0부터 시작한다.
	*/
	
		System.out.println("[시나리오3]\n주민등록번호로 성별을 구분하는 프로그램을 만드시오");
		
		System.out.println(str1.indexOf("-3"));
		System.out.println(str2.indexOf("-4"));
		
		System.out.println("str1의 성별 :"+str1.charAt(7));
		System.out.println("str2의 성별 :"+str2.charAt(7));
	
	//시나리오 4]
	/*
	 * 
	 //lastindexof 이용 
	 //
 	14]substring : 시작인덱스와 마지막인덱스 사이의 문자열을 잘라서 반환한다.
 		방법 1 : 인덱스를 하나만 사용 → 인덱스부터 문자열의 끝까지 잘라낸다.
 		방법 2 : 시작인덱스, 종료 인덱스를 사용 → 인덱스에 해당하는 부분만 잘라서 반환한다.
	*/
	String fileName="my.file.images.jpg";
	System.out.println("[시나리오 4]\n파일명에서 확장자를 잘라내는 프로그램을 작성하시오");
	System.out.println(fileName.substring(15,18));
	
	
	/*
	 * 정답
	 
	 		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		
		System.out.println("### 시나리오1 ###");
		String juminNum = "190419-1000000";
		
		주민번호로 주어진 문자열의 8번째 문자 즉 인덱스 7에 해당하는
		문자가 성별을 표현하므로 이를 통해 판단할수 있다. 
		이때 문자를 비교해야 하므로 '(싱글쿼테이션)을 사용해야한다.
		 
		if(juminNum.charAt(7)=='1' || juminNum.charAt(7)=='3') {
			System.out.println("남자입니다");
		}
		else if(juminNum.charAt(7)=='2' || juminNum.charAt(7)=='4') {
			System.out.println("여자입니다");
		}
		else if(juminNum.charAt(7)=='5' || juminNum.charAt(7)=='6') {
			System.out.println("외국인입니다");
		}
		else {
			System.out.println("주민번호가 잘못 입력되었습니다.");
		}
		
		
		
		
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net, aaaa@domain.co.kr => 이메일형식임
		not@naver => 이메일형식이아님
		
		//복습시 indexOf(), split() 메서드를 이용해서도 구현해보세요.
		System.out.println("### 시나리오3 ###");
		String email = "not@naver.com";
		
		이메일은 아이디와 도메인을 구분하는 @(엣)과 
		도메인 부분에 .(닷)이 동시에 포함되므로 이를 이용해서 판단한다.
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식이 맞습니다.");
		}
		else {
			System.out.println("이메일 형식이 아닙니다.");
		}
	

		

		
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 
			charAt()을 이용해서 작성하시오.
		
		System.out.println("### 시나리오2 ###");
		String jumin = "190419-2000000";
		//하이픈의 인덱스를 찾은후 1을 더해 성별에 해당하는 문자의
		//인덱스를 구한다. 
		int index = jumin.indexOf("-") + 1;
		//앞에서 구한 인덱스를 charAt() 인수로 전달한다.
		if(jumin.charAt(index)=='1' || jumin.charAt(index)=='3') {
			System.out.println("남자");
		}
		else if(jumin.charAt(index)=='2' || jumin.charAt(index)=='4') {
			System.out.println("여자");
		}
		else if(jumin.charAt(index)=='5' || jumin.charAt(index)=='6') {
			System.out.println("외국인");
		}
		
		
		
		
		
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		
		System.out.println("### 시나리오4 ###");
		
		System.out.println("방법1-lastIndexOf사용");
		String filename = "my3545.4354343.fi4.54le.456.56.images986856.jpg";
		int indexNum = filename.lastIndexOf(".") + 1;
		System.out.println("내가찾은인덱스:"+ indexNum);
		String fileExt = filename.substring(indexNum);
		System.out.println("파일확장자:"+ fileExt);
		
		System.out.println("방법2-split사용");
		//Java에서 split()메서드 사용시 .(닷)의 경우 []를 씌워야된다.
		String[] strArr = filename.split("[.]");
		System.out.println("배열의크기:"+ strArr.length);
		System.out.println("파일확장자:"+ strArr[strArr.length-1]); 
	 */
	}
}
