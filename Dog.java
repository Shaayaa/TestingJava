package dog;

public class Dog {
	
	int eyes=2;
	int tail=1;
	String color = "white";
	
	void run() {
		System.out.println("Dog can run");
	}
	
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void print() {
		System.out.println("tail="+tail);
		System.out.println("eyes="+eyes);
		System.out.println("color="+color);

	}

}
