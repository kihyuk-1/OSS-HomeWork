package ch연습용;

public class SmartPhone2 extends Phone2 {

		//생성자 선언
		SmartPhone2(String owner) {
		
			
		//Phone2 생성자 호출
		super(owner);
		}


		//메소드 선언
		void internetSearch() {
			System.out.println("인터넷 검색을 합니다.");
		}


}
