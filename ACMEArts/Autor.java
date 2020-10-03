package ACMEArts;

public class Autor {

	private String nome;

	private int anoNascimento;

	private Filme[] filme;

	public Autor(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public Autor() {
		nome = "";
	//	anoNascimento = -1;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}
}
