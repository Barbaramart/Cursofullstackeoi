package com.fran.anotaciones2.entidades;

// default package
// Generated 16 mar 2023 11:49:07 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "libros")
public class Libros implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo;
	private Set<Autores> autoreses = new HashSet<Autores>(0);

	public Libros() {
	}

	public Libros(int id) {
		this.id = id;
	}

	public Libros(int id, String titulo, Set<Autores> autoreses) {
		this.id = id;
		this.titulo = titulo;
		this.autoreses = autoreses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "titulo", length = 60)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "escribir", joinColumns = {
			@JoinColumn(name = "codlibro", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "codautor", nullable = false, updatable = false) })
	public Set<Autores> getAutoreses() {
		return this.autoreses;
	}

	public void setAutoreses(Set<Autores> autoreses) {
		this.autoreses = autoreses;
	}

	@Override
	public String toString() {
		return "Id: " + id + " titulo: " + titulo;
	}
	
	
	

}
