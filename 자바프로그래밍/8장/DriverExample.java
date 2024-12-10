package ch연습용;

public class DriverExample {
	public static void main (String [] args) {
		//Driver 객체 생성
		
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		
		Bus1 bus1 = new Bus1();
		Taxi taxi  = new Taxi();
		
		
		
		//매개 값으로 구현 객체 대입 (다형성 : 실행 결과 다름)
		
		
		driver.drive(bus1);
		driver.drive(taxi);
		
		
	}
}
