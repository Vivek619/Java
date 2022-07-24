package JavaConcept;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj = new ClassB();
		obj.CallMethodLogic1InClassA();
		
		obj.MethodB();
	}
	
	public void CallMethodLogic1InClassA() {
		ClassA obj = new ClassA();
		obj.Logic1();
		
		//mujhe sum karna h 10 + 5 kaa
		int sum = 0;
		sum = obj.Sum(10, 5);
		System.out.println(sum);
	}
	
	public void MethodB() {
		System.out.println("I am methodB in class B");
	}

}
