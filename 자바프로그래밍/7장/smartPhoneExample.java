package ch연습용;

public class smartPhoneExample {

		public static void main (String [] args) {
			
			//smartPhone 객체 생성
			
			
			smartphone myPhone = new smartphone("갤럭시" , "은색");
			
			
			// phone에서 상속 받은 필드 읽기
			System.out.println("모델: "  + myPhone.model);
			System.out.println("모델: "  + myPhone.color);
			
			
			// smartPhone의 필드 읽기
			
			System.out.println("와이파이 상태 : " + myPhone.wifi);
			
			
			// phone으로부터 상속받은 메소드 호출
			
			myPhone.bell();
			myPhone.sendVoice("여보세요");
			myPhone.receiveVoice("안녕하세요! 저는 홍길이입니다.");
			myPhone.sendVoice("아~ 네 반갑습니다!");
			myPhone.hangUp();
			
			//smartPhone의 메소 호출
			myPhone.setWifi(true);
			myPhone.internet();
			
		}
	
		
		
}
