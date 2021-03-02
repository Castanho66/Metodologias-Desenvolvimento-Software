package trabalhomds;

import java.util.ArrayList;

public class Faltas {
	
	String nome;
	String cartão;
	ArrayList<String> lista_faltas = new ArrayList<String>();
	double valor_falta;
	ArrayList<String> lista_data_faltas = new ArrayList<String>();
	//ArrayList<String> valor_presença = new ArrayList<String>();
	
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
	public ArrayList<String> getLista_faltas() {
		return lista_faltas;
	}
	public void setLista_faltas(ArrayList<String> lista_faltas) {
		this.lista_faltas = lista_faltas;
	}
	public double getValor_falta() {
		return valor_falta;
	}
	public void setValor_falta(double valor_falta) {
		this.valor_falta = valor_falta;
	}
	public ArrayList<String> getLista_data_faltas() {
		return lista_data_faltas;
	}
	public void setLista_data_faltas(ArrayList<String> lista_data_faltas) {
		this.lista_data_faltas = lista_data_faltas;
	}
	
	

}
