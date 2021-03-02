package trabalhomds;

import java.util.ArrayList;

public class Presença {
	
	String nome;
	String cartão;
	ArrayList<String> lista_presenças = new ArrayList<String>();
	String valor_presença;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCartão() {
		return cartão;
	}
	public void setCartão(String cartão) {
		this.cartão = cartão;
	}
	public ArrayList<String> getLista_presenças() {
		return lista_presenças;
	}
	public void setLista_presenças(ArrayList<String> lista_presenças) {
		this.lista_presenças = lista_presenças;
	}
	

}
