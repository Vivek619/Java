package JavaConcept;

public class ContructorExample {
	int x; //global variable declaration only
	Boolean isOk;
	//default constructor
//	ContructorExample(){
//		
//	}
	
	//user defined constructor -- non parameterized constructor
	ContructorExample(){
		x = 5;
		isOk = false;
		System.out.println("I am user defined non parameterized constructor");
	}
	
	//Parameterized constructor
	ContructorExample(int a, Boolean y){
		x = a;
		isOk = y;
		System.out.println("I am user defined parameterized constructor with 2 parameters");
	}
	
	ContructorExample(int a){
		x = a;
		System.out.println("I am user defined parameterized constructor with 1 parameter");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContructorExample obj = new ContructorExample();
		ContructorExample obj1 = new ContructorExample(300, false);
		ContructorExample obj2 = new ContructorExample(100, true);
		ContructorExample obj3 = new ContructorExample(4000);
		
		check(3,true);
		
	}
	
	public static void check(int a, Boolean b) {
		ContructorExample obj = new ContructorExample();
		obj.x = a;
		obj.isOk = b;
		
		System.out.println(obj.x);
		System.out.println(obj.isOk);
		
	}

}
