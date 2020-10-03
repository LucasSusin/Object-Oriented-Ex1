package ACMEArts;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		int opcao = 0;
		String autorPesquisa = "";

		boolean iniciar = true;

		Catalogo c1;
		Filme filme[] = new Filme[5];
		Autor autorTitanic[] = new Autor[1];
		Autor autorBackToTheFuture[] = new Autor[2];
		Autor autorShutterIsland[] = new Autor[2];
		Autor autorTropaDeElite[] = new Autor[2];
		Autor autorInception[] = new Autor[2];
		Autor autorSemFilme[] = new Autor[2];

		c1 = new Catalogo("Catálogo", filme);

		filme[0] = new Filme("Titanic", 1997,"U$D 200.000.000", "U$D 2.186.772.302", autorTitanic); 
		filme[1] = new Filme("Back to the Future", 1985, "U$D 19.000.000", "U$D 381.109.762", autorBackToTheFuture);
		filme[2] = new Filme("Shutter Island", 2010, "U$D 80.000.000", "U$D 294.800.000", autorShutterIsland);
		filme[3] = new Filme("Tropa de Elite", 2007, "R$ 10.500.000", "R$ 24.655.621", autorTropaDeElite);
		filme[4] = new Filme("Inception", 2010, "U$D 160.000.000", "U$D 825.532.764", autorInception);

		autorTitanic[0] = new Autor("James_Cameron", 1954);
		autorBackToTheFuture[0] = new Autor("Robert_Zemeckis", 1951);
		autorBackToTheFuture[1] = new Autor("Bob_Gale", 1951);
		autorShutterIsland[0] = new Autor("Mike_Medavoy", 1941);
		autorShutterIsland[1] = new Autor("Bradley_Fischer", 1976);
		autorTropaDeElite[0] = new Autor("José_Padilha", 1967);
		autorTropaDeElite[1] = new Autor("Marcos_Prado", 1961);
		autorInception[0] = new Autor("Christopher_Nolan", 1970);
		autorInception[1] = new Autor("Emma_Thomas", 1971);
		autorSemFilme[0] = new Autor();

		if(args.length > 0 && args.length < 3) {
			if(args[0].equals("1") && args.length == 1) {
				System.out.println("\n");
				c1.mostraTudo();
				iniciar = false;
			} else if(args[0].equals("2") && args.length == 2) {
				int x = Integer.parseInt(args[1]);
				System.out.println("\n");
				c1.pesquisa(x);
				iniciar = false;					
			} else if(args[0].equals("3") && args.length == 2) {
				System.out.println("\n");
				String y = (args[1]);
				c1.pesquisa(y);
				iniciar = false;
			} else if(args[0].equals("4") && args.length == 1) {
				System.out.println("\n");
				System.out.println("Saindo...");
				iniciar = false;
			}
		}

		if(iniciar == true) {
			do {
				System.out.println("\n                                         ### ACMEArts ###");
				System.out.println("                   ============================================================");
				System.out.println("                  |     1 - Mostrar todas as informações dos itens cadastrados |");
				System.out.println("                  |     2 - Pesquisar por ano                                  |");
				System.out.println("                  |     3 - Pesquisar por nome do autor                        |");
				System.out.println("                  |     4 - Sair                                               |");
				System.out.println("                   ============================================================\n");
		
				opcao = scan.nextInt();
				System.out.print("\n");
				switch(opcao) {
				case 1:
					System.out.println("\n");
					c1.mostraTudo();
					break;
		
				case 2:
					System.out.println("Digite o ano para pesquisa: ");
					int anoPesquisa = scan.nextInt();
					c1.pesquisa(anoPesquisa);
					break;
					
				case 3:
					System.out.println("Digite o nome para pesquisa: ");
					autorPesquisa = scanString.nextLine();
					c1.pesquisa(autorPesquisa);
					break;
		
				case 4:
					System.out.println("\n");
					System.out.println("Saindo...");
					break;
					
				default:
					System.out.println("\n");
					System.out.println("Opção Inválida!");
					break;
				}
			}while (opcao != 4);
		}
	}
}

