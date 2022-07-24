package JavaConcept;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj = new ClassA();
		obj.Logic1(); //non static method calling within same class -- using object
		obj.Logic2();
		
		ClassA.Logic3(); //static method calling within same class  -- using classname
	}
	
	public int Sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public void Logic1() {
		System.out.println("This is Logic 1 from Class A");
		//logic to sum 2 numbers
	}
	
	public void Logic2() {
		System.out.println("This is Logic 2 from Class A");
	}
	
	public static void Logic3() {
		System.out.println("This is Logic 3 from Class A");
	}

}
