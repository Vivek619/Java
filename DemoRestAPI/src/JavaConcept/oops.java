package JavaConcept;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* this is multi
		 * line comment
		 */
     int a =0, A=34;
     int p = doSomething(4,5,10); //20
     doSomething1();
     doSomething(4,5);
     
     oops obj = new oops();
     
     String x = obj.doSomething();
     
     System.out.println(x);
     System.out.println(p);
     System.out.println("vivek");
     System.out.println("garima");
     
     
	}
	
	//this method is doing sum
	public String doSomething() {
		int a = 1; int b =3;
		int sum = a+b;
		
		String name1 = "garima ", name2 = "vivek";String name3 = " ";
		String name4 = name1 + name3  + name2; //garima vivek
		char n = '0';
		String t = name1 + n; //garimaa
		
		return name4;
	}
	
	//this method is returning product
	public static int doSomething1() {
		int a = 1; int b =3;
		int product = a*b;
		return product;
		
		//variable
		//1. Value type - int, float, long, double. -- stored in stack
		//2. Reference type - classes, array, objects -- stored in heap
	}
	
	public static int doSomething(int x, int y) {
		int product = x*y;
		return product;
	}
	
	public static int doSomething(int x, int y, int z) {
		int product = x*y*z;
		return product;
	}

}
