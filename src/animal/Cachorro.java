package animal;

public class Cachorro extends Animal {
	private String nome;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	@Override
	public String fazerBarulho() {
		return "Au";
	}
	
}