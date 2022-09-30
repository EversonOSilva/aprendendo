public class Aluguel {

	private String data;
	private int periodo;
	private String cpf;
	private String nome;
	private double valorFinal;

	private Alugavel alugavel;


	public Aluguel() {
	}
	public Aluguel(String data, int periodo, String cpf, String nome,Alugavel alugavel) {
		this.data = data;
		this.periodo = periodo;
		this.cpf = cpf;
		this.nome = nome;
		this.alugavel = alugavel;
		alugavel.adicionaAluguel(this);
		calculaValorTotal();
	}

	public double calculaValorTotal() {
		double perD = Double.valueOf(periodo);
		valorFinal = perD * alugavel.getPrecoDiaria() ;

		if(periodo > 7){
			valorFinal = valorFinal - (valorFinal/10);
		}

		return valorFinal;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setAlugavel(Alugavel alugavel) {
		this.alugavel = alugavel;
	}

	public double getAlugavel() {
		return alugavel.getPrecoDiaria();
	}

	public String toString() {
		String print2;
		print2 = "vvvvvvvvvvvvvvvvv\n" +
				"Data: " + data + "\n" +
				"Periodo: " + periodo + "\n" +
				"CPF: " + cpf + "\n" +
				"Nome: " + nome + "\n" +
				"Valor Final: R$" + valorFinal + "\n"+"^^^^^^^^^^^^^^^^^\n";
		return print2;

		/*return "\n" +
				"Data:  " + data + "\n" +
				"Periodo: " + periodo + " dias\n"+
				"CPF: " + cpf + "\n" +
				"Nome: " + nome + "\n" +
				"Valor Final: R$"+ valorFinal + "\n";*/
	}

}
