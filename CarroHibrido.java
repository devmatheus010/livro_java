package exercicios_deittel;

public class CarroHibrido {
	private String nome, tipoBateria;
	private double consumoUrbano, consumoEstrada;
	
	//CONSTRUTOR PADRÃO
	public CarroHibrido(){
		
	}
	
	//MÉTODO CONSTRUTOR
	public CarroHibrido(String nome, String tipoBateria, double consumoUrbano, double consumoEstrada) {
		this.nome = nome;
		this.tipoBateria = tipoBateria;
		this.consumoUrbano = consumoUrbano;
		this.consumoEstrada = consumoEstrada;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipoBateria() {
		return tipoBateria;
	}
	
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	
	public double getConsumoUrbano() {
		return consumoUrbano;
	}
	
	public void setConsumoUrbano(double consumoUrbano) {
		this.consumoUrbano = consumoUrbano;
	}
	
	public double getConsumoEstrada() {
		return consumoEstrada;
	}
	
	public void setConsumoEstrada(double consumoEstrada) {
		this.consumoEstrada = consumoEstrada;
	}
}
	

