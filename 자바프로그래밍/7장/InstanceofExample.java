package ch연습용;

public class InstanceofExample {
	
	public static void personInfo (Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		
		if(person instanceof Student student) {
			System.out.println("studentNO : " + student.studentNo);
			student.study();
		}
	}
	

	public static void main (String [] args) {
		// Person 객체를 매개값으로 제공하고 PersonInfo 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		
		// Student 객체를 매개값으로 제공하고 PersonInfo 호출
		
		Person p2 = new Student("김길동" , 10);
		personInfo(p2);
		
	}





}
