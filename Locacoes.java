import java.util.ArrayList;

public class Locacoes {
	ArrayList<Aluguel> itemAluguel = new ArrayList<>();

	public void adicionaAluguel(Aluguel aluguel) {
		itemAluguel.add(aluguel);
	}

	public ArrayList<Aluguel> pesquisaAluguel(String cpf) {
		ArrayList<Aluguel> itenCpf = new ArrayList<>();
		for (int i = 0; i < itemAluguel.size(); i++) {
			Aluguel temp = itemAluguel.get(i);
			if(cpf.equalsIgnoreCase(temp.getCpf())) {
				itenCpf.add(temp);
			}
		}
		if(itenCpf.isEmpty()){
			return null;
		}
		return itenCpf;
	}

	public ArrayList<Aluguel> getItemAluguel() {
		return itemAluguel;
	}

}
