package fatura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fatura {
	private List<Pagamento> pagamentos;
	private Date data;
	private String nomeCliente;
	private boolean isFaturaPaga;
	
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	public Date getData() {		
		return data;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public boolean isFaturaPaga() {
		return isFaturaPaga;
	}
	public void setFaturaPaga(boolean isFaturaPaga) {
		this.isFaturaPaga = isFaturaPaga;
	}	

	public Fatura(String nomeCliente, Date dataFatura){
		this.nomeCliente = nomeCliente;
		this.data = dataFatura;
	}
	
}