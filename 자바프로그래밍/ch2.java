package 자바기초;

public class ch2 {
	public static void main(String[] args) {
		
		// 2-1 변수 선언
		
		//변수 value 선언
		int value = 10;
		//연산 결과를 변수 result 의 초기값으로 대입 
		int result = value + 10;
		System.out.println(result);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		int totalMinute = (hour*60) + minute;
		System.out.println("총"+ totalMinute + "분");
	
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + " , y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + " , y:" + y);
		
		
		// 2-2 정수 타입 
		
		int var1 = 0b1011; //2진수 
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		
		byte var5 = -128;
		byte var6 = 30;
		System.out.println("var5:" + var5);
		System.out.println("var6:" + var6);
	
		long var7 = 20L; // long 타입은 뒤에 L추가
		System.out.println("var7:" + var7);
		
		
		// 2-3 문자 타입
		
		char c1 = 'A'; // 문자 저장
		char c2 = 65; // 유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 2-4 실수 타입
		
		// 정밀도 확인
		float var8 = 0.1231231312f;
		double var9 = 023132134;
		
		System.out.println("var8:"+var8);
		System.out.println("var8:"+var9);
		
		
		
		//2-5 논리 타입 
		
	    int a = 5;
	    int b = 10;
        boolean isEqual = (a == b);    // false
        boolean isGreater = (a > b);   // false
        boolean isLessOrEqual = (a <= b); // true

        System.out.println("a == b: " + isEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a <= b: " + isLessOrEqual);

        
        //2-6 문자열 타입
    	String name = "홍길동";
		char job = 'A';
		
		System.out.println(name);
		System.out.println(job);
	
        
		//2-7 자동 타입 변환
		// byte < short , char < int < long < float < double 크기 순서
		
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 :" + intValue);
		
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue :" + floatValue);
		
		//2-8 강제 타입 변환
		
		// int -> byte
		int  intValue = 10;
		byte byteValue = (byte) intValue;
		
		// long -> int
		long longValue = 300;
		int intValue = (int) longValue;
		
		// int -> char
		int intValue = 65;
		char charValue = (char) intValue;
		
		// 실수 -> 정수
		double doubleValue = 3.14;
		int intValue = (int) doubleValue;
		

		// 2-9 연산식에서 자동 타입 변환
		

		int num = 10;
        double result = num;  // int가 double로 자동 변환됨

        System.out.println("int num: " + num);
        System.out.println("자동 변환된 double result: " + result);

		
		
        // 2-10 키보드 입력
        
	    import java.util.Scanner;
	    public class 연습용 {
    	public static void main(String[] args) {	
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성
		System.out.print("이름을 입력하세요: ");
	    String name = scanner.nextLine();  
	    System.out.println("안녕하세요!" + name + '님');

		
		
		
		
		
	}
	
	
	
}
