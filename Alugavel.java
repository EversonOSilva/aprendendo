import java.util.ArrayList;

public class Alugavel {
	private String nome;
	private String cor;
	private int codigo;
	private int tamanho;
	private double precoDiaria;

	ArrayList<Aluguel> itenAluguel = new ArrayList<>();


	public Alugavel(String nome, String cor, int codigo, int tamanho, double precoDiaria) {
		this.nome = nome;
		this.cor = cor;
		this.codigo = codigo;
		this.tamanho = tamanho;
		this.precoDiaria = precoDiaria;
	}
	public Alugavel() {

	}

	public boolean adicionaAluguel(Aluguel aluguel) {
		itenAluguel.add(aluguel);
		if(itenAluguel.get(itenAluguel.size()-1)==aluguel){
			return true;
		} else {
			return false;
		}

	}
	public String toString() {
		String print;
		print = "=======================================\n"+
				"Item: " + nome + "\n" +
				"Cor: " +cor+ "\n" +
				"Codigo: "+codigo+ "\n"+
				"Tamanho: "+tamanho+"\n"+
				"Preco da Diaria: R$"+precoDiaria+"\n"+
				"========================================\n"+
				"\nAlugueis do Item acima: \n"+itenAluguel.toString()+"\n";
		return print;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
}
