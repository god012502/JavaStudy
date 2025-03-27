package ex12inheritance;
/*
class Animal() {
	
	
}

 	1. 멤버변수 생성
 		종(포유류, 어류, 조류)-부모클래스
 		
 		어떠한 종인지(말티즈, 푸들)-자식 클래스 
 		나이, 이름, 성별
 	2. 멤버메소드 
 		강아지의 기능
 		eat
 		bark
 		sleep
 	3. 인자생성자
 	
 	
 		

class Animal extends Dog{ //자식 클래스
	
}
*/

/*
연습문제] Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.
 */
public class Animal {
 
	//멤버변수
	private String species; //동물의 종류
//	private String species; 
	public int age; //나이
	public String gender; //성별
	
	//현재상태 
	public void showAnimal() {
		System.out.println("동물의 종류는:"+ species);
		System.out.println("나이는:"+ age);
		System.out.println("성별은:"+ gender);
	}
	
	//생성자 
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}

	public String getSpecies() {
		return species;
	}
	
	/*
	getter메서드 
		: private으로 선언된 멤버변수를 클래스 외부로 반환할때 
		사용하는 메서드
	 */
	
}



