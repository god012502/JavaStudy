package ex08class;

class FruitSeller2{
	/*
	 	두 번째 버전에서는 멤버변수의 초기값을 제거한다
	 	이 경우 멤바상수는 에러가 발생하므로 final을 제거하여 
	 	일반적인 멤버변수로 변경한다.
	 	
	 	변ㅅ는 소문자를 사용하므로 이 부분도 변경해준다.
	 */
	int numOfApple;
	int myMoney;
	int applePrice;
	
	/*
	 	초기화 메서드를 선언하여 인스턴스 생성 후 
	 	다양한 형태로 초기화 할 수 있다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney=money;
		numOfApple=appleNum;
		applePrice=price;
	}	
	public int saleApple(int money) {
		int num=money/applePrice;
		
		numOfApple -=num;
		myMoney +=money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자] 남은 사과갯수 : "+numOfApple);
		System.out.println("[판매자] 판매수익 : "+myMoney);
	}
}

class FruitBuyer2{
	//초기값 제거
	
	int myMoney;
	int numOfApple;
	
	//멤버변수 초기화를 위한 초기화메서드 추가
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney-=_myMoney;
		numOfApple +=_numOfApple;
	}
	public void buyApple(FruitSeller2 seller,int money) {
		numOfApple +=seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuyresult() {
		System.out.println("[구매자] 현재잔액 : "+myMoney);
		System.out.println("[구매자] 사과갯수 : "+numOfApple);
	}
}
public class E06FruitSalesMain2 {
	public static void main(String[] args) {
		//판매자 1 : 사과100개, 단가 1000원
		FruitSeller2 seller1=new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		//판매자2: 사과80개, 단가 500원
		FruitSeller2 seller2=new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		//구매자 : 보유금액10,000원 
		FruitBuyer2 buyer=new FruitBuyer2();
		buyer.initMembers(10000, 0);
				
		System.out.println("구매 행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyresult();
		//각각의 판매자에게 5000원씩 지불한 후 사과 구매
		buyer.buyApple(seller1,5000);
		buyer.buyApple(seller2,5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();	
		buyer.showBuyresult();	
}
	}

