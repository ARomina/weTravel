package ar.edu.unlam.tallerweb1.modelo;

public class Categoria {

	private Long id;
	private String categoria;
	
	//Constructor
	public Categoria(){
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
