package fatura;

import java.util.Date;
import java.util.List;

import produto.Produto;

public class Boleto {
	private String codigoBoleto;
	private Date dataVencimento;
	private Double valorPago;
	
	public String getCodigoBoleto() {
		return codigoBoleto;
	}
	public void setCodigoBoleto(String codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	
	
}
