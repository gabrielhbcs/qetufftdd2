package fatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaturaTest {
	Fatura fatura;
	int qtdBoletos;
	
	@BeforeEach
	void setInit(List<Boleto> boletos) {
		this.qtdBoletos = boletos.size();
		
		// MOCK (a lista de boletos vem onde? ficou confuso)
		List<Pagamento> listaPagamentos = new ArrayList();
		Pagamento pagamento;
		for(Boleto boleto:boletos) {
			pagamento = new Pagamento();
			pagamento.setBoleto(boleto);
			
			pagamento.setData(new Date(boleto.getDataVencimento().getTime() - 1000 * 60 * 60 * 24));
			pagamento.setTipoPagamento(TipoPagamento.BOLETO);
			pagamento.setValorPago(100.00);
			
			listaPagamentos.add(pagamento);
		}
		Fatura fatura = new Fatura("Fatura teste", new Date());
		
		fatura.setPagamentos(listaPagamentos);
	}
	
	
	@Test
	void TesteFaturaPaga() {
		Date data = new Date();
		// TEST
		List<Pagamento> pagamentos2 = new ArrayList();
		Pagamento pagamento1 = new Pagamento();
		Boleto boleto1 = new Boleto();
		boleto1.setCodigoBoleto("Boleto 1");
		boleto1.setDataVencimento(data);
		boleto1.setValorPago(100.00);
		pagamento1.setBoleto(boleto1);
		pagamento1.setValorPago(90.00);
		pagamento1.setTipoPagamento(TipoPagamento.BOLETO);
		pagamento1.setData(data);
		pagamentos2.add(pagamento1);

		Pagamento pagamento2 = new Pagamento();
		Boleto boleto2 = new Boleto();
		boleto2.setCodigoBoleto("Boleto 2");
		boleto2.setDataVencimento(data);
		boleto2.setValorPago(200.00);
		pagamento2.setBoleto(boleto2);
		pagamento2.setValorPago(210.00);
		pagamento2.setTipoPagamento(TipoPagamento.BOLETO);
		pagamento2.setData(data);
		pagamentos2.add(pagamento2);
		
		fatura.setPagamentos(pagamentos2);
		
		assertTrue(fatura.isFaturaPaga() == true);		
	}
	

}
