package ex04controlstatement;
/*
 	if문 형식3
 		if(조건1){
 			조건1이 true일 때 실행;
 		}
 		else if(조건2){
 			조건2가 true일 때 실행;
 		}
 		else{
 			조건2가 true일 때 실행;
 		}
 */
public class E01If03 {
	public static void main(String[] args) {
		/*
		 *시나리오] 국, 영, 수 점수의 평균값을 구하여 학점을 출력하는 프로그램 작성
		 *90점 이상은 A학점, 60점 미만은 F 학점을 출력하면 된다. 
		 */
		
		//점수는 정수타입으로 변수 및 초기값 할당
		int kor=99, eng=70, math=64;
		
		/*
		 	평균값은 소수점이 될 수 있으므로 실수형으로 선언하는 것이 좋다.
		 	double형의 결과를 얻기위해 3.0으로 나눠준다.
		 */
		double avg = (kor+eng+math)/3.0;
		System.out.println("평균점수는(그대로) : "+ avg);
		
		//서식문자를 이용해서 소수점이하 2자리까지만 표현
		System.out.printf("평균점수는 (소수점2자리) : %.2f\n", avg);
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
		
		
		
		/*
		 높은 점수라 할지라도 60점 이상의 조건에 만족하므로 무조건 D학점이 출력
		 따라서, 논리적으로 문제가 있는 코드가 된다. 
		 이와 같이 구간이 필요한 경우에는 큰 숫자를 먼저 기술해야한다.
		 */
		
		System.out.println("잘못된 조건식의 if문");
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
		System.out.println("점수의 구간을 조건으로 사용");
		if(avg>=60 && avg<70) {
			System.out.println("D학점");
		}
		else if(avg>=70 && avg<80) {
			System.out.println("C학점");
		}
		else if(avg>=80 && avg<90) {
			System.out.println("B학점");
		}
		else if(avg>=90 ) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
		}
	}

