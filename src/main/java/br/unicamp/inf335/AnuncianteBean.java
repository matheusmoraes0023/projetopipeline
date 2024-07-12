/**
 * 
 */
package br.unicamp.inf335;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author bonacin
 * Classe que representa um anunciante, com respectivos dados e anuncios associados
 */

public class AnuncianteBean {
	/**
	 * Nome do anunciante
	 */

	private String nome;
	/**
	 * CPF do anunciante
	 */
	private String CPF;
	/**
	 * Lista de anuncios de um anunciante
	 */
	private ArrayList<AnuncioBean> anuncios;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public ArrayList<AnuncioBean> getAnuncios() {
		return anuncios;
	}
	public void setAnuncios(ArrayList<AnuncioBean> anuncios) {
		this.anuncios = anuncios;
	}
	
	/**
	 * Construtor deafult
	 */
	public AnuncianteBean() {
		nome = "";
		CPF = "";
		anuncios = new ArrayList<AnuncioBean>();
	}
	
	
	/**
	 * Construtor com parametros
	 * @param nome
	 * @param CPF
	 * @param anuncios
	 */
	public AnuncianteBean(String nome, String CPF, ArrayList<AnuncioBean> anuncios) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.anuncios = anuncios;
	}
	

	/**
	 * Inclui novo anuncio na lista de anuncios de um anunciante
	 * @param nAnuncio Anuncio a ser incluido
	 */
	public void addAnuncio (AnuncioBean nAnuncio) {
		anuncios.add(nAnuncio);	
	}
	
	/**
	 * Inclui novo anuncio na lista de anuncios de um anunciante
	 * @param nAnuncio Anuncio a ser incluido
	 */
	public void removeAnuncio (int i) {
		anuncios.remove(i);	
	}
	
	/**
	 * Calcula o valor medio de anuncios de um anuciante
	 * @return valor medio dos anuncios 
	 */
	public Double valorMedioAnuncios() {
	    if (anuncios.isEmpty()) {
	        return 0.0; 
	    } else {
	        Double soma = 0.0;
	        for (AnuncioBean an : anuncios) {
	            soma += an.getValor();
	        }
	        return soma / anuncios.size();
	    }
	}


}
