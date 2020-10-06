package fatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

class FaturaTest {

	@Test
	void TesteCriacaoFatura(List<Boleto> boletos) {
		// MOCK
		List<Pagamento> listaPagamentos = new ArrayList();
		Pagamento pagamento;
		for(Boleto boleto:boletos) {
			pagamento = new Pagamento();
			pagamento.setBoleto(boleto);
			
			pagamento.setData(new Date(boleto.getDataVencimento().getTime() - 1000 * 60 * 60 * 24)); // TODO: de onde vem isso??
			pagamento.setTipoPagamento(TipoPagamento.BOLETO);
			pagamento.setValorPago(100.00); // TODO: e isso?? :(
			
			listaPagamentos.add(pagamento);
		}
		Fatura fatura = new Fatura("Fatura teste", new Date());
		
		fatura.setPagamentos(listaPagamentos);
		
		// TEST
		List<Pagamento> pagamentos = fatura.getPagamentos();
		double totalValorBoleto = 0;
		double totalValorPago = 0;
		for(Pagamento element:pagamentos) {
			totalValorBoleto += element.getBoleto().getValorPago();
			totalValorPago += element.getValorPago();		
		}
		
		fatura.setFaturaPaga(totalValorBoleto > totalValorPago);
		
	}
	

}
