package com.leo.dio.oop;

public class Curso extends Conteudos {
	
	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [title=" + getTitle() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	@Override
	public double calculoXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
}
