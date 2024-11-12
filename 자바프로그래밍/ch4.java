package 자바기초;

import java.util.Scanner;

public class ch4 {
	public static void main (String [] args) {
		
		
		// 4-1 코드 실행 흐름 제어
		// 조건문 -> if , switch문
		// 반복문 -> for , while , do-while문
		
		
		
		// 4-2 if문 
		int score= 40;
		
		if (score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} 
		else if (score >= 80) {
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급은 B입니다.");
					
 		}
 		
		else if (score >= 70) {
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급은 C입니다.");
					
 		}
		else {
			System.out.println("다시 공부하세요 ㅋ");
			System.out.println("등급은 없어 ㅋㅋ");
		}
 		

		// 4-2-1 
		
		int num = (int) (Math.random()*6) +1;
		
		if (num ==1) {
			System.out.println("1번이 나왔습니다.");
			
		}
		
		else if (num ==2) {
			System.out.println("2번이 나왔습니다.");	
		}
		
		else if (num ==3) {
			System.out.println("3번이 나왔습니다.");	
		}
		
		
		else if (num ==4) {
			System.out.println("4번이 나왔습니다.");	
		}
		
		
		else if (num ==5) {
			System.out.println("5번이 나왔습니다.");	
		}
		
		else {
			System.out.println("6번이 나왔습니다.");
		}
	
		
		// 4-2-2
	
		int score = (int) (Math.random()*21)+81;
	
		System.out.println("점수: " + score);
		
		String grade;
		
		
		if (score>=90) {
			if (score>=95) {
				grade = "A+";
			}
			
			else {
				grade = "A";
				
			}	
		}
		
		else {
			if (score >= 85) {
				grade = "B+";
			}
			
			else {
				grade = "B";
			}
			
		}
		
		System.out.println("학점:" + grade);


		
		// 4-3 switch 문 
		public static void main (String [] args) {
			
			
			int num =(int) (Math.random()*4) + 1;
			
			switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			
			case 2:
				System.out.println("3번이 나왔습니다.");
				break;
			
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
				
			default:
				System.out.println("4번이 나왔습니다.");

			}
			
			
		
		// 4-3-1
			
			int num =(int) (Math.random()*4) + 1;
			
			switch(num) {
			case 1: 
				System.out.println("1번이 나왔습니다.");
				break;
			
			case 2:
				System.out.println("3번이 나왔습니다.");
				break;
			
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
				
			default:
				System.out.println("4번이 나왔습니다.");
				
				
			}
		
		// 4-3-2
		// 기본  자바버전
		char grade = 'B';
		
		switch(grade) {
			
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
		}
			// 신 자바버전
		char grade = 'a';
		switch(grade) {
		
		case 'A' , 'a' -> // 자자 신버전 break문 굳이 안 써도 됨
		System.out.println("우수 회원입니다.");
		

		case 'B' , 'b' ->
				System.out.println("일반 회원입니다.");
	
		}
	
		
		// 4-4 for문 
		
		for (int i = 0; // 초기화식 i <= 10; //조건식 i++ // 증감식) {
			System.out.println(i + " ");
			
		}
		
		// 4-4-1 
		
		int sum = 0;
		int i;
		
		for(i = i; i<=100; i++) {
			sum += i;
			
		}
		
		System.out.println("1~" + (i+1) + "합 :" + sum);
		
		
		// 4-5 while문 
		
		int i = 1;
		int sum = 0;
		
		while (i<=100 ) { // 조건식
			
			sum += i; // 실행문
			i++;
				
			
		}
		System.out.println("1~" + (i-1) + "합 :" + sum);
	
	}
}

	// 4-6 do-while 문 
	System.out.println("메시지를 입력하세요");
	System.out.println("프로그램을 종료하려면 q를 입력");
	
	Scanner scanner = new Scanner(System.in);
	String inputString;
	
	
	do {
		System.out.println(">");
		inputString = scanner.nextLine();
		System.out.println(inputString);
		
	} while (! inputString.equals("q"));
	
	System.out.println();
	System.out.println("프로그램 종료");
	
	// 4-7 break 문
	
	while(true) {
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		if (num ==6) {
			break; // 종료
		}	
	}
	
	
	// continue 문
	for (int i = 0; i<=10; i++) {
		if (i%2!=0) {
			continue;
		}
	System.out.println(i + " ");
		
	}
	
	
	
