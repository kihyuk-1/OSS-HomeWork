package 자바기초;

import 자바기초.eeee.Day;

public class ch5 {
	public static void main (String [] args) {
		
		
		// 5-1 참조 타입 변수의 == , != 연산
		
		int[] arr1; // arr1 변수 선언
		int[] arr2; // arr2 변수 선언
		int[] arr3; // arr3 변수 선언
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2; 
		
		System.out.println(arr1 == arr2); // false 
		System.out.println(arr2 == arr3); // true
		
		
		
		// 5-2  NULL(번지를 정하지 않았다는 )
		
		
		int[] intArray = null;
		//intArrayp[0] = 10; -> 참조할 객체가 없음
		
		String str = null;
		System.out.println("총 문자 수 : " + str.length()); // NULLPointerException
		
		
		
		// 5-2-1
		
		String hobby = "여행";
		hobby = null; // "여향"애 해당하는 String 객체를 쓰레기로 만듦
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2 : " + kind2);
		
		
		// 5-3 문자열 타입 
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");	
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");	
		}
		
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
			
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		// 5-3-1 charAt(문자 추출)
		String str = "Hello, World!";
		char ch = str.charAt(4); // 문자열에서 4번째 인덱스의 문자 추출 ('o')
		System.out.println("추출한 문자: " + ch);

		
		// 5-3-2  length(문자열 길이) 
		String str = "Hello, World!";
		int length = str.length(); // 문자열의 길이 구하기
		System.out.println("문자열의 길이: " + length);

		// 5-3-3  replace(문자열 대체)
		String str = "Hello, World!";
		String replacedStr = str.replace("World", "Java"); // "World"를 "Java"로 대체
		System.out.println("대체된 문자열: " + replacedStr);

		// 5-3-4  substring(문자열 잘라내기)
		String ssn = "880815-1234567";
	
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		
		// 5-3-5 indexOf(문자열 찾기)
		String str = "Hello,World!";
		int index = str.indexOf("World"); // "World"라는 문자열의 시작 인덱스 찾기
		System.out.println("찾은 인덱스: " + index);

		
		// 5-3-6 split(문자열 분리) 
		String str = "Java,Python,C++,JavaScript";
		String[] languages = str.split(",", 2); // 최대 2개로 분리

		// 분리된 문자열 출력
		for (String lang : languages) {
		    System.out.println(lang);
		}
		// 출력 
		//Java
		//Python,C++,JavaScript


		// 5-4 배열 타입
		String[] season = {"Spring" , "Summer" , "Fall" , "Winter"};
		
		// 배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		// 인덱스 1번 항목 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
		//배열 변수 선언과 배열 생성
		int[] scores = {83,90,87};
		
		//총합과 평균 구하기
		
		int sum = 0;
		for (int i = 0; i<3; i++) {
			sum += scores[i];
			
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :" + avg);
		
		// 5-4-1 
		
		int[] scores;
		scores = new int[] {83,90,87};
		
		int sum1 = 0;
		for (int i = 0; i<3; i++) {
			sum1 += scores[i];
			
		}
		System.out.println("총합: " + sum1);
		
		
		printItem(new int[] {83,90,87});
	}

		// printItem() 메소드 선언
		
		public static void printItem(int[] scores) {
					
		//매개변수가 참조하는 배열의 항목을 출력	
		for (int i = 0; i<3; i++) {
		 System.out.println("scroe[" + i + "]: " + scores[i]);		 
			 }		
	}



		// 5-4-2 new 연산자로 배열 생성
		
		// 정수형 배열 생성
		int[] numbers = new int[5]; // 크기가 5인 정수형 배열 생성

		// 배열 초기화
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		// 배열의 요소 출력
		for (int i = 0; i < numbers.length; i++) {
		    System.out.println("numbers[" + i + "] = " + numbers[i]);
		}

		
		// 5-5 다차원 배열
		
		// 2차원 배열 선언 및 초기화
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 배열의 요소 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 줄 바꿈
        }
        
        
        // new 연산자로 다차원 배열 생성
        public class SimpleTwoDimensionalArray {
            public static void main(String[] args) {
                // 2차원 배열 생성 (3행 3열)
                int[][] array = new int[3][3];

                // 배열에 값 할당
                array[0][0] = 1;
                array[0][1] = 2;
                array[0][2] = 3;
                array[1][0] = 4;
                array[1][1] = 5;
                array[1][2] = 6;
                array[2][0] = 7;
                array[2][1] = 8;
                array[2][2] = 9;

                // 배열의 요소 출력
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println(); // 줄 바꿈
                }
            }
        }

        // 5-6 객체를 참조하는 배열
    	String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));


        
		// 5-9 배열 복사
		
		// 길이 3인 배열
		
		String[] oldStrArray = {"java" , "array" , "copy"};
		// 길이 5인 배열을 새로 생성
		
		String[] newStrArray = new String[5];
		
		//배열 항목 복사
		System.arraycopy(oldStrArray , 0 , newStrArray , 0 , oldStrArray.length);
		
		// 배열 항목 출력
		for (int i = 0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + " , ");
		
    
		// 5-10 배열 항목 반복을 위한 향상된 for문
		//배열 변수 선언과 배열 생성
		
		int[] scores = {95,71,84,93,87};
		//배열 항목 전체 합 구하기
		
		int sum = 0;
		
		for (int score : scores) {
			
			sum = sum + score;
		}
			
		System.out.println("점수 총합 = " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);
		
			
		// 5-11 main() 메소드의 String[] 매개변수 용도 
		if (args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
			
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + "=" + result);
		
		
		
		// 5-12 열거(Enum) 타입 
	    public enum Day {
	        SUNDAY,
	        MONDAY, 
	        TUESDAY, 
	        WEDNESDAY, 
	        THURSDAY, 
	        FRIDAY, 
	        SATURDAY
	    }

	    public static void main(String[] args) {
	        // 열거타입 사용 예시
	        Day today = Day.WEDNESDAY;

	        System.out.println("오늘의 요일은: " + today);

	        // 모든 요일 출력
	        System.out.println("모든 요일:");
	        for (Day day : Day.values()) {
	            System.out.println(day);
	        }
		
		}
		
		
		
	}
}
