package ListadeCadastro;

public class Cadastro {
	private int id;
	private int valor;
	private String descrição;
	private String nome;
	private String logadouro;
	private int numero;
	private String cidade;
	private String cep;
	private String fone;
	private String descrição2;
	private String nome2;
	private String email;
	private String bairro;
	
	public Cadastro() {
		super();
	}
	public Cadastro(int id, int valor, String descrição, String nome, String logadouro, int numero, String bairro,
			String cidade, String cep, String fone, String descrição2, String nome2, String email ) {
		super();
		Cadastro cadastro = this;
		cadastro.id = id;
		cadastro.valor = valor;
		cadastro.descrição = descrição;
		cadastro.nome = nome;
		cadastro.logadouro = logadouro;
		cadastro.numero = numero;
		cadastro.bairro = bairro;
		cadastro.cidade = cidade;
		cadastro.cep = cep;
		cadastro.fone = fone;
		cadastro.descrição2 = descrição2;
		cadastro.nome2 = nome2;
		cadastro.email = email;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro ;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getDescrição2() {
		return descrição2;
	}
	public void setDescrição2(String descrição2) {
		this.descrição2 = descrição2;
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return getBairro() + "" + getEmail();
	}
}
