import java.util.Scanner;
public class ACMERental {
	Scanner in = new Scanner(System.in);

	Acervo catalogo = new Acervo();
	Locacoes aluguel1 = new Locacoes();
	Alugavel n = new Alugavel();




	public void preCadastra() {
		//PreCadastra Itens Alugaveis
		Alugavel camisa = new Alugavel("Camisa","Preta", 2544, 48, 12.50);
		catalogo.adicionaAlugavel(camisa);
		Alugavel calca = new Alugavel("Calca","Preta", 1254, 48, 10.30);
		catalogo.adicionaAlugavel(calca);
		Alugavel smoke = new Alugavel("Smoke","Branco",2564, 48, 22.40);
		catalogo.adicionaAlugavel(smoke);

		//PréCadastra alugueis deve ser 5 alugueis
		Aluguel a1 = new Aluguel("22/10/2022",10,"833.000.542-12","Fernando",camisa);
		aluguel1.adicionaAluguel(a1);
		Aluguel a2 = new Aluguel("22/10/2022",10,"833.000.542-12","Fernando",calca);
		aluguel1.adicionaAluguel(a2);
		Aluguel a3 = new Aluguel("22/10/2022",10,"833.000.542-12","Fernando",smoke);
		aluguel1.adicionaAluguel(a3);
		Aluguel a4 = new Aluguel("23/05/2019",15,"655.687.152-18","Adalberto",camisa);
		aluguel1.adicionaAluguel(a4);
		Aluguel a5 = new Aluguel("15/04/2021",12,"054.524.456-58","Reginaldo",camisa);
		aluguel1.adicionaAluguel(a5);
		Aluguel a6 = new Aluguel("28/05/2019",21,"655.688.192-18","Arandela", calca);
		aluguel1.adicionaAluguel(a6);
		Aluguel a7 = new Aluguel("18/09/2021",5,"054.524.456-58","Ferdinando", smoke);
		aluguel1.adicionaAluguel(a7);
		Aluguel a8 = new Aluguel("18/09/2021",5,"054.524.456-58","Ferdinando", calca);
		aluguel1.adicionaAluguel(a8);

	}
	public void executa() {
		boolean sair = false;

		do {
			System.out.println("===============================================");
			System.out.println("=====[[ACMERental Aluguel de Vestimentas]]=====");
			System.out.println("===============================================");
			System.out.println("Escolha uma opcao!");
			System.out.println("[1] Mostrar todos os dados cadastrados");
			System.out.println("[2] Pesquisar item Alugavel pelo Codigo");
			System.out.println("[3] Pesquisar itens Alugaveis pelo nome");
			System.out.println("[4] Pesquisar Alugueis de um Cliente");
			System.out.println("[5] Cadastrar item alugavel");
			System.out.println("[6] Cadastrar Aluguel");
			System.out.println("[7] Sair do Programa");

			String opcao = in.nextLine();
			switch (opcao) {
				case "1":
					if(catalogo.getItens().isEmpty()) {
						System.out.println("Nenhum item alugavel cadastrado no sistema.\n");
					} else {
						System.out.println(catalogo.getItens() + "\n\n");
					}
					break;

				case "2":
					System.out.print("Digite o Codigo: ");
					String codStr = in.nextLine();
					int codp = Integer.parseInt(codStr);
					if(catalogo.pesquisaAlugavel(codp) == null){
						System.out.println("Nenhum item alugavel encontrado com este codigo.\n");
					} else {
						System.out.println(catalogo.pesquisaAlugavel(codp));
					}

					break;

				case "3":
					System.out.print("Digite o Nome: ");
					String nomep = in.nextLine();
					if(catalogo.pesquisaAlugavel(nomep)==null) {
						System.out.println("Nenhum item alugavel encontrado com este nome.\n");
					} else {
						System.out.println(catalogo.pesquisaAlugavel(nomep));
					}
					break;

				case "4":
					System.out.print("Digite o CPF: ");
					String cpfp = in.nextLine();
					if(aluguel1.pesquisaAluguel(cpfp)==null) {
						System.out.println("Nenhum aluguel encontrado com este CPF. \n");
					} else {
						System.out.println(aluguel1.pesquisaAluguel(cpfp));

					}
					break;

				case "5":
					System.out.println("Cadastrar novo Item alugavel.");
					System.out.print("Nome: ");
					String nomeN = in.nextLine();
					System.out.print("Cor: ");
					String corN = in.nextLine();
					System.out.print("Codigo: ");
					String codStr1 = in.nextLine();
					int codN = Integer.parseInt(codStr1);
					System.out.print("Tamanho: ");
					String tamStr = in.nextLine();
					int tamanhoN = Integer.parseInt(tamStr);
					System.out.print("Preco da diaria: ");
					String preStr = in.nextLine();
					double precoDiariaN = Double.parseDouble(preStr);
					Alugavel item = new Alugavel(nomeN,corN,codN,tamanhoN,precoDiariaN);
					catalogo.adicionaAlugavel(item);
					System.out.println("Item cadastrado com sucesso!!\n");
					break;


				case "6":
					System.out.println("Cadastrar novo aluguel.");
					System.out.print("Data: ");
					String dataN = in.nextLine();
					System.out.print("CPF: ");
					String cpfN = in.nextLine();
					System.out.print("Nome: ");
					String nomeN1 = in.nextLine();
					System.out.print("Periodo: ");
					String perStr = in.nextLine();
					int periodoN = Integer.parseInt(perStr);
					System.out.print("Codigo do item: ");
					String codStr2 = in.nextLine();
					int cod2 = Integer.parseInt(codStr2);
					if(catalogo.pesquisaAlugavel(cod2)!= null) {
						Aluguel novoAluguel = new Aluguel(dataN,periodoN,cpfN,nomeN1,catalogo.pesquisaAlugavel(cod2));
						aluguel1.adicionaAluguel(novoAluguel);
						System.out.println("Aluguel Cadastrado com sucesso!\n");
					} else {
						System.out.println("Item nao encontrado!\n");
					}
					break;


				case "7":
					sair = true;
					break;

				default:
					System.out.println("Opcao invalida!\n\n");
					break;

			}

		}while(!sair);
		System.out.println("=====!!!!Programa encerrado!!!!=====");
		System.out.println("====================================");

	}

}
