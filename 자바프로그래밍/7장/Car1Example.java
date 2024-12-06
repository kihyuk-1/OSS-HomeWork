package ch연습용;

public class Car1Example {
	public static void main(String [] args) {
		// Car 객체 생성
		Car1 myCar = new Car1();
		
		
		
		//Tire 객체 장착
		
		myCar.tire = new Tire();
		myCar.run();
		
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
			
		
		// KumhoTire 객제 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
	
}
