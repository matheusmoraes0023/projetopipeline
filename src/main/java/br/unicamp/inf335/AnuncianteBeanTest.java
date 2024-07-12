package br.unicamp.inf335;

import static org.junit.Assert.*;
import org.junit.Test;
import java.net.MalformedURLException;
//import java.net.URL;
import java.util.ArrayList;

public class AnuncianteBeanTest {
    
    @Test
    public void testNome() {
        AnuncianteBean anunciante = new AnuncianteBean();
        anunciante.setNome("João");
        assertEquals("João", anunciante.getNome());
    }
    
    @Test
    public void testCPF() {
        AnuncianteBean anunciante = new AnuncianteBean();
        anunciante.setCPF("12345678901");
        assertEquals("12345678901", anunciante.getCPF());
    }
    
    @Test
    public void testAnuncios() throws MalformedURLException {
        ProdutoBean produto1 = new ProdutoBean("123", "Celular", "Descrição do Celular", 1000.0, "Novo");
        ProdutoBean produto2 = new ProdutoBean("456", "Tablet", "Descrição do Tablet", 800.0, "Usado");
        
//        URL foto1 = new URL("https://picsum.photos/id/237/200/300");
//        URL foto2 = new URL("https://picsum.photos/id/237/200/300");
        
        AnuncioBean anuncio1 = new AnuncioBean(produto1, new ArrayList<>(), 0.1); 
        AnuncioBean anuncio2 = new AnuncioBean(produto2, new ArrayList<>(), 0.2); 
        
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);
        
        AnuncianteBean anunciante = new AnuncianteBean("Matheus", "9876", anuncios);
        
        assertEquals(anuncios, anunciante.getAnuncios());
    }
    
    @Test
    public void testValorMedioAnuncios() throws MalformedURLException {
        ProdutoBean produto1 = new ProdutoBean("123", "Celular", "Descrição do Celular", 1000.0, "Novo");
        ProdutoBean produto2 = new ProdutoBean("456", "Tablet", "Descrição do Tablet", 800.0, "Usado");
        
//      URL foto1 = new URL("https://picsum.photos/id/237/200/300");
//      URL foto2 = new URL("https://picsum.photos/id/237/200/300");

        AnuncioBean anuncio1 = new AnuncioBean(produto1, new ArrayList<>(), 0.2);
        AnuncioBean anuncio2 = new AnuncioBean(produto2, new ArrayList<>(), 0.2);

        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);

        AnuncianteBean anunciante = new AnuncianteBean("Matheus", "9876", anuncios);

        // Definindo o valor médio esperado (média dos valores dos produtos com desconto)
        Double valorDescontadoProduto1 = produto1.getValor() * 0.8; 
        Double valorDescontadoProduto2 = produto2.getValor() * 0.8; 
        
        Double valorEsperado = (valorDescontadoProduto1 + valorDescontadoProduto2) / 2;

        
        Double valorCalculado = Math.round(anunciante.valorMedioAnuncios() * 100.0) / 100.0;


        // Exibe o valor esperado
        System.out.println("VALOR ESPERADO: " + valorEsperado);
        System.out.println("VALOR CALCULADO: " + valorCalculado);


        // Verifica se o valor médio calculado é igual ao valor esperado
        assertEquals(valorEsperado, anunciante.valorMedioAnuncios(), 0.001);
    }
}
