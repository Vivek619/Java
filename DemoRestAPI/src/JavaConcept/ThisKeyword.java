package JavaConcept;

public class ThisKeyword {

	int a;
	int b;
	static int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword();
		
		obj.check();
	}
	
	public void check() {
		int a = 12; int b= 4;
		
		this.a = 10; //global variable is referred here
		a = 13;  //local variable is referred here
		this.b = 15;
		
		ThisKeyword.c = 13;
	}

}
