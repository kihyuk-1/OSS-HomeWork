package ch연습용;

public class SealedExample {
	public static void main(String [] args) {
		Person1 p = new Person1();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
	
	
		p.work();
		e.work();
		m.work();
		d.work();
		
	
	
	
	
	}
}
