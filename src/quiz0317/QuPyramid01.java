package quiz0317;

public class QuPyramid01 {

    public static void main(String[] args) {
        
    	int i = 1; // i는 행의 개수를 제어하는 변수로 초기값은 1

    	while (i <= 5) { // i가 5 이하일 때까지 반복 (총 5행 출력)
    	        
    	    int j = 1; // j는 각 행에서 출력할 '*' 개수를 제어하는 변수로 초기값은 1

    	    // 현재 행(i)의 개수만큼 '*'을 출력하는 반복문
    	    while (j <= i) {
    	    System.out.print("*"); // '*'을 출력 (줄 바꿈 없이 출력됨)
    	    j++; // j 값을 증가시켜 다음 '*' 출력 준비
    	    }

    	    System.out.println(); // 한 행이 끝나면 줄 바꿈
    	    i++; // 다음 행으로 이동
    	    }
    	}
    }

