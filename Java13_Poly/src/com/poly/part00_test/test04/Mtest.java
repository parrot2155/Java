package com.poly.part00_test.test04;

public class Mtest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("뼈다귀");
		dog.bite();
		
		Pigeon p = new Pigeon();
		p.bark();
		p.eat("벌레");
		p.fly();
		
		Animal a = new Cat(); //Animal에 다 잘 담긴다.
		a.bark();
		a = new Dog();
		a.bark();
		a = new Pigeon();
		a.bark();
		
		Bird b = new Pigeon();
		//b = new Dog(); 
		//b = new Cat();
		//상속받은 애들이 아니라 당연히 담을 수 없다.
		
		//a.fly(); //a변수 타입이 Animal이니까. Animal에는 fly()없기 떄문.
		
		
	}

}
