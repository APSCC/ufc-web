package br.ufc.crateus.web.loja.model;

public enum Pais {

	BRASIL("Brasil", "BRA"), COLOMBIA("COL", "Colombia"), URUGUAI("Uruguai", "URU");

	private String nome;
	private String sigla;

	private Pais(String nome, String sigla) {
		setNome(nome);
		setSigla(sigla);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pais [nome=" + nome + ", sigla=" + sigla + "]";
	}

	public static Pais get(String value) {
		for (Pais pais : Pais.values()) {
			if(pais.getSigla().equals(value)){
				return pais;
			}
		}
		return null;
	}
}
