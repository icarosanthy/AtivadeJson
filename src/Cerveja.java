
public class Cerveja {

	private String malte;
	private String nome;
	private String marca;
	private String ano;
	
	
	public String getMalte() {
		return malte;
	}


	public void setMalte(String malte) {
		this.malte = malte;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	@Override
	public String toString() {
		return "Cerveja [ano=" + ano + ", malte=" + malte + ", marca=" + marca + ", nome=" + nome + "]";
	}
}
