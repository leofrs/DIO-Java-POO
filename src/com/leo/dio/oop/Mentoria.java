package com.leo.dio.oop;

import java.time.LocalDate;

public class Mentoria extends Conteudos {
	
	private  LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [title=" + getTitle() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	@Override
	public double calculoXP() {
		return XP_PADRAO + 10d;
	}
	
}
