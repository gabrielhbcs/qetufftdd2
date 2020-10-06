package carrinho;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")
class CarrinhoTest {

	private Carrinho carrinho;
	private Produto abacaxi;
	
	@BeforeEach
	public void CarregaProdutos() {
		System.out.println("Gerando carrinho");
		carrinho = new Carrinho();
		carrinho.addItem(new Produto("Produto 1", 10.0));
		carrinho.addItem(new Produto("Produto 2", 10.0));
		carrinho.addItem(new Produto("Produto 3", 10.0));
		carrinho.addItem(new Produto("Produto 4", 10.0));
		
		abacaxi = new Produto("abacaxi", 10.00);
		carrinho.addItem(abacaxi);
		
	}
		
	@Test
	void testQtdeItem() {
		assertTrue(5 == carrinho.getQtdeItems());
	}
	
	@Test
	void testEsvazia() {
		carrinho.esvazia();
		assertTrue(0 == carrinho.getQtdeItems());
	}
	
	@Test
	void testGetValorTotal() {
		assertTrue(50 == carrinho.getValorTotal());
	}
	
	@Test
	void testAddItem() {
		carrinho.addItem(new Produto("Maçã", 10.00));
		assertTrue(6 == carrinho.getQtdeItems());
	}
	
	@Test
	void testRemoveItem() throws ProdutoNaoEncontradoException {
		carrinho.removeItem(abacaxi);
		assertTrue(4 == carrinho.getQtdeItems());
	}

}
