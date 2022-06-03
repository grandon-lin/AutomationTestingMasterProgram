package mainPack;

public class SingleHeritance {

	public void methodA()
	{
		System.out.println("Base class method");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.methodA(); //calling super class method
		obj.methodB(); //calling local method

	}

}

class B extends SingleHeritance {
	
	public void methodB()
	{
		System.out.println("Child class method");
	}
}