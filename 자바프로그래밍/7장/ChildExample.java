package ch연습용;

public class ChildExample {
	public static void main (String [] args) {
		//자식 개체 생성
		
		Child child = new Child();
		
		// 자동 타입 변환
		
		parent parent = child;
	
		//메소드 호출
		
		parent.method1();
		parent.method2();
	
	
	}

}
