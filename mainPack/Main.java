package mainPack;

import pack2.*;

public class Main extends ProtectAccessSpecifier {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		DefaultAccessSpecifier das = new DefaultAccessSpecifier();
		das.display();
		
		//private
		System.out.println("Private Access Specifier");
		PrivateAccessSpecifier pas = new PrivateAccessSpecifier();
		//Not ablt to access private method of the pas's class
		//pas.display();
		
		Main proas = new Main();
		proas.display();
		
		PublicAccessSpecifier pubas = new PublicAccessSpecifier();
		pubas.display();
	}

}
