package ex12inheritance;

public class AnimalMain {
	
	public static void main(String[] args) {
		Dog dog = new Dog("포유류",2,"수컷","포매라니안","뽀미");
		//개의 객체(종, 나이, 성별, 종류, 이름)
		dog.showAnimal();//
		System.out.println("====================");
		dog.bark();
		System.out.println("====================");
		dog.showDog();
	}
}

