package mainPack;

public class MultilevelInheritance extends Y{

	public void methodZ()
	{
		System.out.println("Class Z method");
	}
	
	public static void main(String[] args) {
		
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.methodX();
		obj.methodY();
		obj.methodZ();

	}

}

class X {
	
	public void methodX()
	{
		System.out.println("Class X method");
	}
}

class Y extends X {
	
	public void methodY()
	{
		System.out.println("Class Y method");
	}
}