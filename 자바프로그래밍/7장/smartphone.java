package ch연습용;

public class smartphone extends Phone {
		// 자식 클래스 
		// 필드 선언

		public boolean wifi;
		
		//생성자 선언
		public smartphone(String model , String color) {
			this.model = model;
			this.color = color;
		}
	
		//메소드 선언
		
		public void setWifi (boolean wifi) {
			this.wifi = wifi;
			System.out.println("와이파이 상태를 변경했습니다.");
		}
		
		public void internet() {
			System.out.println("인터넷에 연결합니다.");
			
		}
}
