package comp.citibank.training_day_1.main;
 
public class HelloWorld {
	
	String var = "hello world";

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		HelloWorld obj1 = new HelloWorld();
		System.out.println(obj1.var);
		
		TestDemo obj2 = new TestDemo();
		System.out.println(obj2.var);
		
		
	}

}
