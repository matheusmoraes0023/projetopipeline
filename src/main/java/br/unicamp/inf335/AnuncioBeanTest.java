package br.unicamp.inf335;

import static org.junit.Assert.*;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class AnuncioBeanTest {
    
    @Test
    public void testGetValorSemDesconto() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);
        
        AnuncioBean anuncio = new AnuncioBean(produto, new ArrayList<>(),0.2);
        
        assertEquals(80.00, anuncio.getValor(), 0.001);
    }
    
    @Test
    public void testGetValorComDesconto() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);
        
        AnuncioBean anuncio = new AnuncioBean(produto, new ArrayList<>(), 0.2); // 20% de desconto
        
        assertEquals(80.0, anuncio.getValor(), 0.001);
    }
    
    @Test
    public void testSetProduto() {
        ProdutoBean produto = new ProdutoBean();
        
        AnuncioBean anuncio = new AnuncioBean();
        anuncio.setProduto(produto);
        
        assertEquals(produto, anuncio.getProduto());
    }
    
    @Test
    public void testSetFotosUrl() throws MalformedURLException {
        URL foto1 = new URL("https://picsum.photos/id/237/200/300");
        URL foto2 = new URL("https://picsum.photos/id/237/200/300");
        
        ArrayList<URL> fotosUrl = new ArrayList<>();
        fotosUrl.add(foto1);
        fotosUrl.add(foto2);
        
        AnuncioBean anuncio = new AnuncioBean();
        anuncio.setFotosUrl(fotosUrl);
        
        assertEquals(fotosUrl, anuncio.getFotosUrl());
    }
    
    @Test
    public void testSetDesconto() {
        AnuncioBean anuncio = new AnuncioBean();
        anuncio.setDesconto(0.3);
        
        assertEquals(0.3, anuncio.getDesconto(), 0.001);
    }
}
