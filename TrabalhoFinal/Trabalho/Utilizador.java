package trabalhomds;

public class Utilizador {
	
	String nome;
	String cartão;
	String papel;
	
	public Utilizador(String nome, String cartão, String papel) {
		
		this.nome = nome;
		this.cartão = cartão;
		this.papel = papel;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCartão() {
		return cartão;
	}
	
	public String getPapel() {
		return papel;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCartão(String cartão) {
		this.cartão = cartão;
	}
	
	public void setPapel(String papel) {
		this.papel = papel;
	}
	

}
