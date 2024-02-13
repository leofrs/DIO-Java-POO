package com.leo.dio.oop;

public abstract class Conteudos {
	
	protected static final double XP_PADRAO = 10d;
	private  String title;
	private  String descricao;
	
	public abstract double calculoXP();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
