package trabalhomdsfinal1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FaltasTeste {
	
	FaltasTeste teste;

	@Before
	public void setUp() throws Exception {
		
		teste = new FaltasTeste("Maxime Lucero","062", "aluno");
	}

	@After
	public void tearDown() throws Exception {
		
		teste = null;
	}
	
	@Test   //teste
	public void testSetNome() {
		
		teste.setNome("Maxime Luceiro");
		String valor = teste.getNome();
		assertEquals("Maxime Luceiro", valor);
	}
	
	@Test
	public void testSetCart�o() {
		
		teste.setCart�o("063");
		String valor = teste.getCart�o();
		assertEquals("Valor dever� ser igual a 063",valor, "063");
	}
	
	@Test
	public void testSetValor_falta() {
		
		teste.setCart�o("1.00");
		String valor = teste.getValor_falta();
		assertEquals("Valor dever� ser igual a 1.00",valor, "1.00");
	}
	
	
	

	@Test
	public void testGetNome() {
		
		String valor = teste.getNome();
		assertEquals("Valor deve ser Maxime Lucero" , valor, "Maxime Lucero");
		
	}
	
	@Test
	public void testGetCart�o() {
		
		String valor = teste.getCart�o();
		assertEquals("O valor dever ser igual ao n�mero do cart�o que ser� 062" , valor, "062");
		
	}
	
	
	@Test
	public void testgetValor_falta() {
		
		Double valor = teste.getValor_falta();
		assertEquals("O valor dever ser igual a 1.00" , valor, "1.00");
		
	}
}
