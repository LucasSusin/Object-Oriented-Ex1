package ACMEArts;

public class Catalogo {

	private String nome;

	private Filme[] filme;

	public Catalogo(String nome, Filme[] filme) {
		this.nome = nome;
		this.filme = filme;
	}

	public void mostraTudo() {
		for(int i=0; i < filme.length; i++) {
			System.out.println("\n");
			System.out.println("Título: " + filme[i].getTitulo());
			System.out.println("Autor(es): " + filme[i].getAutor());
			System.out.println("Ano: " + filme[i].getAno());
			System.out.println("Orçamento: " + filme[i].getOrcamento());
			System.out.println("Receita: " + filme[i].getReceita());
		}
	}

	public void pesquisa(int ano) {
		boolean encontrou = false;
		for(int i=0; i < filme.length; i++) {
			if(ano == filme[i].getAno()) {
				encontrou = true;
				System.out.println("\n");
				System.out.println("Título: " + filme[i].getTitulo());
				System.out.println("Autor(es): " + filme[i].getAutor());
				System.out.println("Ano: " + filme[i].getAno());
				System.out.println("Orçamento: " + filme[i].getOrcamento());
				System.out.println("Receita: " + filme[i].getReceita());
			}
		} 
		if(encontrou == false) {
			System.out.println("\n");
			System.out.println("Nada foi localizado com este ano.");
		}
	}
	
	public void pesquisa(String nome) {
		boolean encontrou = false;
		for(int i=0; i < filme.length; i++) {
			if(nome.equals(filme[i].nomeAutorUmParaPesquisa())) {
				encontrou = true;
				System.out.println("\n");
				System.out.println("Título: " + filme[i].getTitulo());
				System.out.println("Autor(es): " + filme[i].getAutor());
				System.out.println("Ano: " + filme[i].getAno());
				System.out.println("Orçamento: " + filme[i].getOrcamento());
				System.out.println("Receita: " + filme[i].getReceita());
			}
			if(filme[i].quantosAutores() == 2) {
				if(nome.equals(filme[i].nomeAutorDoisParaPesquisa())) {
					encontrou = true;
					System.out.println("\n");
					System.out.println("Título: " + filme[i].getTitulo());
					System.out.println("Autor(es): " + filme[i].getAutor());
					System.out.println("Ano: " + filme[i].getAno());
					System.out.println("Orçamento: " + filme[i].getOrcamento());
					System.out.println("Receita: " + filme[i].getReceita());
				}
			}
		} 
		if(encontrou == false) {
			System.out.println("\n");
			System.out.println("Nome de autor não localizado.");
		}
	}
}

