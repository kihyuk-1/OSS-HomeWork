package 자바기초;

import ch연습용.Car;

public class ch06 {
	public static void main (String [] args) {
		
		// 6-1 객체지향 프로그래밍
		
		/*
		객체지향 프로그래밍(OOP)은 데이터를 객체라는 단위로 나누고, 이 객체들이 서로 상호작용하는 방식으로 프로그램을 구성하는 방법론입니다. 핵심 개념은 캡슐화(Encapsulation), 상속(Inheritance), 다형성(Polymorphism), **추상화(Abstraction)**입니다.

		1.캡슐화: 객체의 데이터와 기능을 하나로 묶고, 외부에선 필요한 부분만 노출.
		2.상속: 상위 클래스의 특성을 하위 클래스가 물려받아 코드 재사용성을 높임.
		3.다형성: 동일한 메서드가 상황에 따라 다른 방식으로 동작.
		4.추상화: 복잡한 시스템에서 필요한 핵심만 표현하여 단순화.
		이렇게 OOP는 코드의 재사용성, 유지보수성을 높이고, 확장성을 쉽게 합니다.
		*/
		
		
		
		
		// 6-2 객체와 클래스
		
		/*
		클래스는 객체를 만들기 위한 설계도 또는 청사진입니다. 클래스에는 속성(변수)과 메서드(함수)가 정의되어 있습니다.
		객체는 클래스를 기반으로 만들어진 실체로, 클래스의 인스턴스(instance)라고도 합니다. 객체는 클래스에 정의된 속성과 메서드를 가지며, 
		실제 데이터를 담고 동작을 수행할 수 있습니다.
		예: 자동차라는 클래스가 있다면, 특정한 자동차(예: "빨간색 스포츠카")가 객체가 됩니다.
		*/
		
		
		
		// 6-3 클래스 선언 
		
		class 클래스이름 {
		    // 필드(속성)
		    데이터타입 변수이름;

		    // 생성자
		    클래스이름() {
		        // 초기화 코드
		    }

		    // 메서드
		    반환타입 메서드이름() {
		        // 동작 코드
		    }
		}

		)ex
		class Car {
		    String color; // 속성
		    int speed;    // 속성

		    // 생성자
		    Car(String color, int speed) {
		        this.color = color;
		        this.speed = speed;
		    }

		    // 메서드
		    void drive() {
		        System.out.println("The car is driving.");
		    }
		}

		
		
		// 6-4 객체 생성과 클래스 변수 
		
		// stduent.java
		
		package 자바기초;

		public class Student {

		}
		
		// eeee.java
		package 자바기초;

		public class eeee { 
			public static void main (String [] args) {
				Student s1 = new Student();
				System.out.println("s1 변수가 Student 객체를 참조합니다.");
				
				
				Student s2 = new Student();
				
				System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
				
				
			}

		}
		
		
		
		// 6-5 클래스의 구성 멤버 
		
		public class ClassName {
			
			//필드 선언
			int fielName;
			
			//생성자 선언
			ClassName() { }
			
			//메소드 선언
			int methodName() {
	
			}

		}
		
		// 필드
		// 객체의 데이터를 저장하는 역할 변수 선언과 비슷
		
		// 생성자
		// new 연산자로 객체를 생성할 때 객체의 초기화 역할을 담담한다.
		// 선언 형태는 메소드와 비슷하지만 리턴 타입이 없고 클래스 이름과 동일
		
		
		// 메소드
		// 메소드는 객체가 수행할 동작이다. 다른 프로그램 언어에서는 함수라고 하는데
		// 객체 내부의 함수는 메소드라고 부른다. 메소드는 객체와 객체간의 상호작용을 위해 호출
		
		
		
		// 6-6 필드 선언과 사용
		
		package ch연습용;

		public class CarExample {
			public static void main (String [] args) {
				// Car 객체 생성
				Car myCar = new Car();
				
				
				//Car 객체의 필드값 읽기
				
				
				System.out.println("모델명: " +  myCar.model);
				System.out.println("시동여부: " +  myCar.start);
				System.out.println("현재속도: " +  myCar.speed);
				
				myCar.speed = 60;
				System.out.println("현재속도: " +  myCar.speed);
				
			}
			
		}

		package ch연습용;

		public class Car {
			//필드 선언
			
			String model = "그랜저";
			int speed = 300;
			boolean start = true;
			// Tire tire = new Tire();
			
		}


		// 6-7 생성자 선언과 호출
		
		// 생성 오버로딩
		
		
		// 6-8 메소드 선언과 호출
		
		// 가변길이 매개변수
		
		
		// return 문
		
		// 메소드 오버로딩
		
		
		// 6-9 인스턴스 멤버
		
		// 인스턴스 멤버 선언 및 사용
		// this 키워드 
		
		// 6-10 정적 멤버 
		
		public class 클래스 {
			// 정적 필드 선언
			static 타입 필드 [= 초기값];
			// 정적 메소드
			static 리턴타입 메소드 (매개변수 ...) {...}
			
		}
		
		// 정적 블록
		
		static {
			
		}
		
		// 인스턴스 멤버 사용 불가
		// 정적 블록 안에 인스턴스 필드 , 메소드 사용 불가
		// 하지만 정적 필드 , 정적 메소드는 가능
		
		
		
		// 6-11 final 필드와 상수(수정x 읽기만 가능)
		
		final 타입 필드 [=초기값];
		
		
		// 상수 선언 
	
		static final 타입 상수 [= 초기값];
		
		
		// 6-12 패키지 
		
		// import문
		
		
		
		// 6-13 접근 제한자
		
		// 클래스의 접근 제한
		// 생성자 접근 제한
		// 필드와 메소드의 접근 제한
		
		
		
		// 6-14 getter와 Setter
		
		
		
		//6-15 싱글톤 
		
		
		
		
		
	}
}
