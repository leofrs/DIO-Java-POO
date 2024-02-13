package com.leo.dio.oop;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudos> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudos> conteudoConluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp (Bootcamp bootecamp) {
		this.conteudoInscrito.addAll(bootecamp.getConteudos());
		bootecamp.getDevsInscritos().add(this);
	}
	
	public void progredir () {
		Optional<Conteudos> conteudo =this.conteudoInscrito.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudoConluidos.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		} else {
			System.err.println("Você não está matrículado em nenhum conteúdo");
		}
	}
	
	public double calcularTotalXP () {
		return this.conteudoConluidos.stream().mapToDouble(Conteudos::calculoXP).sum();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudos> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudos> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudos> getConteudoConluidos() {
		return conteudoConluidos;
	}

	public void setConteudoConluidos(Set<Conteudos> conteudoConluidos) {
		this.conteudoConluidos = conteudoConluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConluidos, conteudoInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConluidos, other.conteudoConluidos)
				&& Objects.equals(conteudoInscrito, other.conteudoInscrito) && Objects.equals(nome, other.nome);
	}
	
	
}
