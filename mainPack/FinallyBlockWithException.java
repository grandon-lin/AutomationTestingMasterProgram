package mainPack;

public class FinallyBlockWithException {

	public static void main(String[] args) {
		
		try
		{
			int num = 5/0;
			System.out.println(num);
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("then rest of the code...");
	}

}
