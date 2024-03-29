package br.edu.infnet.AppFreteHidroviario.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TBalsaGraneleira")
public class BalsaGraneleira extends Embarcacoes {

	private float capacidade;
	private String modelo;
	private boolean limpeza;
	
	public BalsaGraneleira() {
		
	}

	public BalsaGraneleira(String frota, String nome, float valor, float comprimento, float largura, float altura, boolean limpeza, String modelo, float capacidade) {
		super(frota, nome, valor, comprimento, largura, altura);
		this.limpeza = limpeza;
		this.modelo = modelo;
		this.capacidade = capacidade;
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
	public void setCapacidade(float capacidade) {
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
