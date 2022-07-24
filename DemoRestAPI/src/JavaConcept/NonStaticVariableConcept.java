package JavaConcept;

public class NonStaticVariableConcept {
	Boolean isRainyToday = true;
	
	int childCount = 5; // initialization -- basket 1
	int childCount1 = 15; // basket 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mujhe non static variable use karna h idhar
		//kaise karunga? --> object banake uss class ka jis class me vo variable h
		NonStaticVariableConcept obj = new NonStaticVariableConcept();
		NonStaticVariableConcept obj1 = new NonStaticVariableConcept();
		System.out.println("Is today going to be a rainy day? " + obj.isRainyToday);
		System.out.println("Number of children in Society in 2021 is " + obj.childCount); 
		
		obj1.childCount = 1500;
		
		obj.childCount = 10;
		
		System.out.println("Number of children in Society in 2022 is " + obj.childCount); //10
		System.out.println("Number of children in Society in 2022 is " + obj1.childCount); //1500
		
		obj.childCount = 15;
		
		System.out.println("Number of children in Society in 2023 is " + obj.childCount); 

		
		
		obj.childCount = 100;
		obj.childCount = 200;
		obj.childCount = 300;
		System.out.println("Number of children in Society in 2024 is " + obj.childCount);	
		
		obj.check();
		
	}
	
	public void check() {
		System.out.println("Number of children in Society in 2025 is " + childCount);
		System.out.println("is it going to rain today? " + isRainyToday);
	}
	
	

}
