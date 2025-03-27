
/*
1.난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다. - random 함수이용
2.사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.play
3.승부를 판단하여 출력한다.winner
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.


public static void main(String[] args) {//가위 바위 보를 진행하는 구문
	Scanner sc=new Scanner(System.in);//입력메소드
	Random rd= new Random();

	System.out.println("1.가위 2.바위 3.보 게임을 시작합니다."); //	
	
	int[] choices= {1,2,3}; //1.가위 , 2.바위 3.보를 선언 및 초기화
	System.out.println("사용자 - 1.가위 , 2.바위 3.보 중 하나를 선택하시오");
	
	int userChoice = sc.nextInt(); //사용자 입력하는 정수
	
	System.out.println("컴퓨터 - 1.가위 , 2.바위 3.보 중 하나를 선택하시오");
	int computerChoice = choices[rd.nextInt(3)]; //컴퓨터 랜덤정수로 진행되는 숫자

	String result = winner(userChoice, computerChoice);
	System.out.println("결과 :"+result);
	
private static String winner(int user, int pc) {
	if(user==pc) { //사용자와 컴퓨터가 같은 값을 낸다면
		return "무승부";
	}
	else if((user==1&&pc==3)||(user==2&&pc==1)||(user==3&&pc==2))
	{
		return "사용자 승리";
	}
	else { // 사용자 승리도 아니고 무승부도 아니라면
		return "컴퓨터 승리";
	}
*/
