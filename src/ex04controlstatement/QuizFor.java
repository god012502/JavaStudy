package ex04controlstatement;

public class QuizFor {

	public static void main(String[] args) {
		/*
		퀴즈1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		
		//단에 해당하는 for문(2~9단)
		for(int i=2; i<=9; i++) {
			
		
		
		//수에 해당하는 for문
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%2d ", i, j, i*j);
				//System.out.println(i+"x"+j+" = "+i*j+" ");
			}
			//하나의 단을 출력한 후 줄바꿈
			System.out.println();
		}	
			int i = 2;
		for(i=2; i<=9; i++) {
		}	
		
		/*
		퀴즈2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
		해법 : x와 y를 더해서 5가 될때 1을 출력한다.
		 */
		System.out.println();
		System.out.println("0과 1패턴 출력하기");
		for(int x=1; x<=4; x++) {
			for(int y=1; y<=4; y++) {
				if(x+y==5)
					System.out.print("1");
				else
					System.out.print("0");
			}System.out.println();
			}
		}

	}

