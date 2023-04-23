//Rony Ahmmed BDU-ICTE
//class and object
public class Main {
	public static void main(String[] args) {
		Main x = new Main();
		x.name = "ICT in Education ";
		x.age = 2020;
		System.out.println(x.name+x.age);
		x.sleep();
		x.eat();
	}
	String name;
	int age;
	void eat(){
		System.out.println("Eating...");
	}
	void sleep(){
		System.out.println("Sleeping...");
	}
	
}
