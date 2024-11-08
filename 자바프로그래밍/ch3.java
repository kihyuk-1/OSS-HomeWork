package 자바기초;

public class ch3 {
	public static void main(String [] args) {
		
		
		// 3-1 부호/증감 연산자
		
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
		
		
		System.out.println("-----------------------");
		int q =10;
		int w = 10;
		
		q++; // 10
		++q;
		System.out.println("x=" + q);
		
		w--;
		--w;
		System.out.println("w=" +w);
		
		
		
		// 3-2 산술 연산자
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);

		long result2 = v1 + v2 - v4;
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
		
		// 3-3 오버플로우와 언더플로우
		
		byte var1 = 125;
		for (int i = 0; i<5; i++) {
			var1++;
			System.out.println("var1: "  + var1);
	
		}
	
		System.out.println("---------------");
		
		
		byte var2 = -125;
		for (int i = 0; i<5; i++) {
			
			var2--; 
			System.out.println("var1: "  + var2);
		}
		
		
		// 3-4 정확한 계산은 정수 연산으로 
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result5 = totalPieces - number;
		System.out.println("10조각에서 남은 조각: " + result5);
		System.out.println("사과 1개에서 남은 양: " + result5/10.0);
		
		
		// 3-5 나눗셈 연산 후 NaN 과 infinity 처리 
		
		int e = 5;
		double r = 0.0;
		double z = e / r;
		
		
		//잘못된 계산
		System.out.println(z + 2);
		
		// 올바른 계산
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
			
			
		}
		
		else {
			
			System.out.println(z+2);
			
		}
		
		
		
		// 3-6 비교 연산자 

		int num1 = 10;
		int num2 = 10;
		
		
		boolean result6 = (num1 == num2);
		boolean result7 = (num1 != num2);
		boolean result8 = (num1 <= num2);
		System.out.println("result6:" + result6);
		System.out.println("result7:" + result7);
		System.out.println("result8:" + result8);

		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		boolean result9 = (char1 < char2);
		System.out.println("result9:" + result9);
		
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result10 = (num3 == num4);
		System.out.println("resulut10: " + result10);
	
		
		float num5 = 0.1f;
		double num6 = 0.1;
		
		
		boolean result11 = (num5 == num6);
		boolean result12 = (num5 == (float) num6);
		
		System.out.println("resulut11: " + result11);
		System.out.println("resulut12: " + result12);
	
		String str1 = "자바";
		String str2 = "Java";
		boolean result13 = (str1.equals(str2));
		boolean result14 = (! str1.equals(str2));
		
		System.out.println("resulut13: " + result13);
		System.out.println("resulut14: " + result14);
	
		
		
		// 3-7 논리 연산자
		int charCode = 'A';
		
		if ((65 <= charCode) & (charCode <=90)) {
			System.out.println("대문자이군요.");
		}
		
		
		if ((97 <= charCode) && (charCode <=122)) {
			System.out.println("소문자이군요.");
		}
		
		
		if ((48 <= charCode) && (charCode <=24)) {
			System.out.println("0~9 숫자이군요.");	
		}
	

		int value = 6;
		
		
		if ((value % 2 == 0) | (value%3==0)) {
			System.out.println("2배 또는 3의 배수이군요.");	
		}
		
		boolean result = ((value%2==0) || value%3 ==0);
		if (!result) {
			
			System.out.println("2 또는 3의 배수가 아니군요");
			
		}
		
	}
	
}

// 3-8 비트 논리 연산자 

public class new1 {
	public static void main (String [] args) {
		System.out.println("45 & 24 = " + (45 & 25) );
		System.out.println("45 & 24 = " + (45 | 25) );
		System.out.println("45 & 24 = " + (45 ^ 25) );
		
		int test =136;
		byte btest = (byte) test;
		System.out.println(btest);
		
	
	}
}

// 3-9 비트 이동 연산자
	public static void main (String [] args) {

		int num1 =1;
		int result1 = num1 << 3; // 8
		int result2 = num1 * (int) Math.pow(2,3);
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2,3);
		
		System.out.println("result3:" + result3);
		System.out.println("result4:" + result4);
		
	}
	}


// 3-10 대입 연산자 
	
	public static void main (String [] args) {
		int result = 0;
		
		result +=10;
		System.out.println("result=" + result); // 10
		result -=5;
		System.out.println("result=" + result); // 5
		result *=3;
		System.out.println("result=" + result); // 15
		result /=5;
		System.out.println("result=" + result); // 3
		result %=3;
		System.out.println("result=" + result); // 0
		

	}
}


// 3-11 삼항(조건) 연산



public class new1 {
	public static void main (String [] args) {

		int score = 85;
		
		char grade = (score> 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		
		System.out.println(score + "점은" + grade + "등급입니다.");
				

	}
}






