package quiz0317;

/*

문제1)1~100까지의 숫자중 3의배수 이거나 7의배수인 
숫자의 합을 구하는 프로그램을 while, do~while, for문으로 각각 작성하시오. 
단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
 
파일명 : Qu3Or7Sum.java
 */
public class Qu3Or7Sum {

	public static void main(String[] args) {
	    
	    // while문 사용[반복무한횟수]
	    int sum = 0; // 합계를 저장할 변수 초기화
	    int i = 1; // 반복문 제어 변수 초기화

	    while (i <= 100) { // 1부터 100까지 반복
	        if (i % 3 == 0 || i % 7 == 0) { // 3의 배수 또는 7의 배수인지 확인
	            if (i % (3 * 7) != 0) { // 3과 7의 공배수(21의 배수)는 제외
	                sum += i; // 조건에 맞는 정수를 누적하여 더함
	                System.out.print(i); // 현재 숫자 출력
	                if (i < 99) System.out.print("+"); // 마지막 숫자가 아니면 '+' 출력
	            }
	        }
	        i++; // 반복 변수 증가
	    }
	    System.out.println("=" + sum); // 최종 합 출력

	    // do~while문 사용
	    sum = 0; // 합계를 다시 0으로 초기화
	    i = 1; // 반복 변수 초기화
	    do { //무조건 실행하는 do 
	        if (i % 3 == 0 || i % 7 == 0) { // 3의 배수 또는 7의 배수인지 확인
	            if (i % (3 * 7) != 0) { // 3과 7의 공배수 제외
	                sum += i; // 조건에 맞는 정수를 누적하여 더함
	                System.out.print(i); // 현재 숫자 출력
	                if (i < 99) System.out.print("+"); // 마지막 숫자가 아니면 '+' 출력
	            }
	        }
	        i++; // 반복 변수 증가
	    } while (i <= 100); // While문 1부터 100까지 반복
	    System.out.println("=" + sum); // 최종 합 출력

	    // for문 반복 사용[반복 횟수가 정해져 있는 함수]
	    sum = 0; // 합계를 다시 0으로 초기화
	    for (int x = 1; x <= 100; x++) { // 1부터 100까지 반복
	        if (x % 3 == 0 || x % 7 == 0) { // 3의 배수 또는 7의 배수인지 확인
	            if (x % (3 * 7) != 0) { // 3과 7의 공배수 제외
	                sum += x; // 조건에 맞는 정수를 누적하여 더함
	                System.out.print(x); // 현재 숫자 출력
	                if (x < 99) System.out.print("+"); // 마지막 숫자가 아니면 '+' 출력
	            }
	        }
	    }
	    System.out.println("=" + sum); // 최종 합 출력
	}
}