package JavaConcept;

public class ConstructorConcept {
	
	int global1 = 1, global2 = 3, global3 = 5; // global variables
	static int global4 = 6; // static variables/instance variable
	//Default Constructor
	ConstructorConcept(){
		global3 = global1 + global2;
	}
	//parameterized constructor
	ConstructorConcept(int x, int y){
		int z = 0; // local variable
		global3 = x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object
		ConstructorConcept obj = new ConstructorConcept();
		System.out.println(obj.global3);//4
		
		ConstructorConcept obj1 = new ConstructorConcept(12, 14);
		System.out.println(obj1.global3);//26
		
		System.out.println(obj.global3);//4
		
	}

}
