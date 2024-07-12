package br.unicamp.inf335;

import java.net.URL;
import java.util.ArrayList;

public class AnuncioBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Produto anunciado
	 */
	private ProdutoBean produto;
	/**
	 * Lista de Fotos do anúncio
	 */
	private ArrayList<URL> fotosUrl;
	/**
	 * Fração de desconto sendo 0 (0%) e 1 (100%)
	 */
	private Double desconto;

	public ProdutoBean getProduto() {
		return produto;
	}

	public void setProduto(ProdutoBean produto) {
		this.produto = produto;
	}

	public ArrayList<URL> getFotosUrl() {
		return fotosUrl;
	}

	public void setFotosUrl(ArrayList<URL> fotosUrl) {
		this.fotosUrl = fotosUrl;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Construtor default
	 */
	public AnuncioBean() {
		produto = new ProdutoBean();
		fotosUrl = new ArrayList<URL>();
		desconto = 0.0;
	}

	/**
	 * Construtor com parâmetros
	 * 
	 * @param produto
	 * @param fotosUrl
	 * @param desconto
	 */
	public AnuncioBean(ProdutoBean produto, ArrayList<URL> fotosUrl, Double desconto) {
		super();
		this.produto = produto;
		this.fotosUrl = fotosUrl;
		this.desconto = desconto;
	}

	/**
	 * Calcula valor do anúncio
	 * 
	 * @return retorna valor do produto com desconto
	 */
	public Double getValor() {
		return produto.getValor() * (1 - desconto);
	}
}
