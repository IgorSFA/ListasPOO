/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Igor
 */
public class ProdutoTest {

    public ProdutoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCompra1Produto() {
        Produto nescau = new Produto("Nescau", 2.5, 1);
        assertEquals(2.5, nescau.calculaPreco(), 0);
    }

    @Test
    public void testCompra10Produtos() {
        Produto nescau = new Produto("Nescau", 2.5, 10);
        assertEquals(25, nescau.calculaPreco(), 0);
    }

    @Test
    public void testCompra20Produtos() {
        Produto guaravita = new Produto("Guaravita", 2, 20);
        assertEquals(36, guaravita.calculaPreco(), 0);
    }

    @Test
    public void testCompra30Produtos() {
        Produto miojo = new Produto("Miojo", 1, 30);
        assertEquals(24, miojo.calculaPreco(), 0);
    }

    @Test
    public void testCompra100Produtos() {
        Produto miojo = new Produto("Miojo", 1, 100);
        assertEquals(75, miojo.calculaPreco(), 0);
    }
}
