package ACMEArts;

public class Filme {

	private String titulo;

	private int ano;

	private String orcamento;

	private String receita;

	private Autor[] autor;

	public Filme(String titulo, int ano, String orcamento, String receita, Autor[] autor) {
		this.titulo = titulo;
		this.ano = ano;
		this.orcamento = orcamento;
		this.receita = receita;
		this.autor = autor;
	}

	public Filme(String titulo, int ano, Autor[] autor) {
		this.titulo = titulo;
		this.ano = ano;
		this.orcamento = "-";
		this.receita = "-";
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAno() {
		return ano;
	}

	public String getOrcamento() {
		return orcamento;
	}

	public String getReceita() {
		return receita;
	}

	public String getAutor() {
		String msg = "";
		String espaco = " e ";
		for(int i=0; i < autor.length; i++) {
			msg = msg + autor[i].getNome() + "(" + autor[i].getAnoNascimento() + ")";
			if(autor.length == 2 && i < 1) {
				msg = msg + espaco;
			}
		}  
		return msg;
	}

	public String nomeAutorUmParaPesquisa() {
		String msg = "";		
		msg = msg + autor[0].getNome();
		return msg;
	}

	public String nomeAutorDoisParaPesquisa() {
		String msg = "";
		msg = msg + autor[1].getNome();
		return msg;
	}

	public int quantosAutores() {
		int x = 0;
		if(autor.length == 2) {
			x = 2;
		}
		return x;
	}
}

