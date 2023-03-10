package br.edu.infnet.AppFreteHidroviario.model.domain;

public class BalsaGraneleira extends Embarcacoes {
	

	private double capacidade;
	private String modelo;
	private boolean limpeza;
	
	public BalsaGraneleira(Integer frota, String nome, float valor, float comprimento, float largura, float altura, boolean limpeza, String modelo, double capacidade) {
		super(frota, nome, valor, comprimento, largura, altura);
		this.capacidade = capacidade;
		this.modelo = modelo;
		this.limpeza = limpeza;
		
	}
	
	public BalsaGraneleira(String nome, String valor, String comprimento, String largura, String altura, String limpeza, String modelo, String capacidade) {
		super(nome, valor, comprimento, largura, altura);
		
	}

	private float valorLimpeza() {
		return limpeza ? 10000 : 0;
	}
	
	
	@Override
	public float calcularValorFrete() {
		return getValor() + valorLimpeza();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(capacidade);
		sb.append(";");
		sb.append(modelo);
		sb.append(";");
		sb.append(limpeza);		
		
		return sb.toString();
	}
	
	
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isLimpeza() {
		return limpeza;
	}
	public void setLimpeza(boolean limpeza) {
		this.limpeza = limpeza;
	}
}
