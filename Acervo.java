import java.util.ArrayList;

public class Acervo {

	ArrayList<Alugavel> itens = new ArrayList<>();

	public boolean adicionaAlugavel(Alugavel alugavel) {

		for (int i = 0; i< itens.size(); i++) {
			Alugavel temp = itens.get(i);
			if(alugavel.getCodigo() == temp.getCodigo()) {
				return false;
			}
		}
		itens.add(alugavel);
		return true;
	}

	public Alugavel pesquisaAlugavel(int codigo) {
		for (int i = 0; i< itens.size(); i++) {
			Alugavel temp = itens.get(i);
			if(codigo == temp.getCodigo()) {
				return temp;
			}
		}
		return null;
	}

	public ArrayList<Alugavel> pesquisaAlugavel(String nome) {
		ArrayList<Alugavel> iten = new ArrayList<>();
		for (int i = 0; i < itens.size(); i++) {
			Alugavel temp = itens.get(i);
			if(nome.equalsIgnoreCase(temp.getNome())) {
				iten.add(temp);
			}
		}
		if(iten.isEmpty()){
			return null;
		}
		return iten;
	}

	public void addAluguelnoAlugavel(Alugavel item, Aluguel cliente) {
		item.adicionaAluguel(cliente);
	}

	public ArrayList<Alugavel> getItens() {
		return itens;
	}
	public ArrayList<Alugavel> getCodigo() {
		return itens;
	}
}
