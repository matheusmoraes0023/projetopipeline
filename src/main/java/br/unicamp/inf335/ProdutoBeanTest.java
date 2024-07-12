package br.unicamp.inf335;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProdutoBeanTest {

    @Test
    public void testGetCodigo() {
        ProdutoBean produto = new ProdutoBean();
        produto.setCodigo("123");

        assertEquals("123", produto.getCodigo());
    }

    @Test
    public void testGetNome() {
        ProdutoBean produto = new ProdutoBean();
        produto.setNome("Produto de Teste");

        assertEquals("Produto de Teste", produto.getNome());
    }

    @Test
    public void testGetDescricao() {
        ProdutoBean produto = new ProdutoBean();
        produto.setDescricao("Descrição do Produto");

        assertEquals("Descrição do Produto", produto.getDescricao());
    }

    @Test
    public void testGetValor() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);

        assertEquals(100.0, produto.getValor(), 0.001);
    }

    @Test
    public void testGetEstado() {
        ProdutoBean produto = new ProdutoBean();
        produto.setEstado("Novo");

        assertEquals("Novo", produto.getEstado());
    }
}
