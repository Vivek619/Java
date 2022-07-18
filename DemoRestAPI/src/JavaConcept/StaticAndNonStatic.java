package JavaConcept;

public class StaticAndNonStatic {
	int global1 = 5; // non static variable
	static int global2 = 6; // static variable
	//static method
	public static int StaticSum(int a, int b) {
		int sum1 = a + b;
		return sum1;
	}
	
	public int NonStaticSum(int a, int b) {
		int sum2 = a + b;
		return sum2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Static call
		//classname.methodname
		int x = StaticAndNonStatic.StaticSum(1, 6); // value type, Single copy in memory
		int a = StaticAndNonStatic.global2;
		
		//Non Static call
		//object banake
		StaticAndNonStatic garimaFridge = new StaticAndNonStatic(); //reference type
		int y = garimaFridge.NonStaticSum(1, 4); //dynamic memory
		int b = garimaFridge.global1;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
