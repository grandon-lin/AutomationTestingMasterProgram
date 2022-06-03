package mainPack;

public class MultipleCatch {

	public static void main(String[] args) {
		try
		{
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		catch (ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("ArrayIndexOutOfBounds exception");
		}
		catch (Exception e)
		{
			System.out.println("Parent exception");
		}
		System.out.println("rest of the code");
	}

}
