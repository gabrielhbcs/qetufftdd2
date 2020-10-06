package fatura;

import java.util.Date;
import java.util.List;

public class Pagamento {
	private Boleto boleto;
	private Double valorPago;
	private Date data;
	private TipoPagamento tipoPagamento;
	
	public Boleto getBoleto() {
		return boleto;
	}
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
