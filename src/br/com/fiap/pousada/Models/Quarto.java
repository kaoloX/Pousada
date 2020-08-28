/*
 * Manutenção de fonte
 * Autor: Gabriel Garcia Pereira
 * Data: Pousada - DDD
 * Manutenção: Implementação Inicial
 */

package br.com.fiap.pousada.Models;

import br.com.fiap.pousada.Models.Enums.Categoria;

public class Quarto {
	private int numero;
	private Categoria categoria;
	private int maxPessoas;
	private double valorDiaria;

	// CONSTRUTOR
	public Quarto(int numero, Categoria categoria, int maxPessoas, double valorDiaria) {
		super();
		this.numero = numero;
		this.categoria = categoria;
		this.maxPessoas = maxPessoas;
		this.valorDiaria = valorDiaria;
	}

	// GETTERS SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getMaxPessoas() {
		return maxPessoas;
	}

	public void setMaxPessoas(int maxPessoas) {
		this.maxPessoas = maxPessoas;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

}
