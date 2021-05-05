package com.farmacia.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.logging.log4j.util.TriConsumer;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private String manipulados;	
	
	@NotNull
	private String nao_manipulados;
	
	@NotNull
	private String perfumaria;
	
	@NotNull
	private String higiene_pessoal;
	
	@NotNull
	private String suplementos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getManipulados() {
		return manipulados;
	}
	public void setManipulados(String manipulados) {
		this.manipulados = manipulados;
	}
	public String getNao_manipulados() {
		return nao_manipulados;
	}
	public void setNao_manipulados(String nao_manipulados) {
		this.nao_manipulados = nao_manipulados;
	}
	public String getPerfumaria() {
		return perfumaria;
	}
	public void setPerfumaria(String perfumaria) {
		this.perfumaria = perfumaria;
	}
	public String getHigiene_pessoal() {
		return higiene_pessoal;
	}
	public void setHigiene_pessoal(String higiene_pessoal) {
		this.higiene_pessoal = higiene_pessoal;
	}
	public String getSuplementos() {
		return suplementos;
	}
	public void setSuplementos(String suplementos) {
		this.suplementos = suplementos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
