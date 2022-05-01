package ListadeCadastro;

import java.util.ArrayList;

public class ListadeCadastro {

	public static void main(String[] args) {
		 ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
		 
		   Cadastro cadastro1 = new Cadastro (1, 25, "camida iatliana", "italiano", "Av. Paulista", 980, "são paulo", "0123-000", "3215-9534", "macarrão", "macarrão", "italiano@gmail.com", "aclimação" );
		   
		   Cadastro cadastro2 = new Cadastro (1, 25, "1235-000", null, null, 0, null, null, null, null, null, null, null );
		   
		   cadastros.add(cadastro1);
		   cadastros.add(cadastro2);
		 
		   
		   for (Cadastro c : cadastros) {
		 System.out.println(c);
		 
		 System.out.println(cadastros.get(1));
		 
		 }
	} 

}
