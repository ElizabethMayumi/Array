package ListadeCadastro;

import java.util.ArrayList;

public class Dados {
	 
	ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
	 
	public void cadastraContato (Cadastro cadastro) {
	 
		cadastros.add(cadastro);
	 
	}
	 
	public int numedoDeCadastro (){
	 
		return cadastros.size();
	 
	}
}