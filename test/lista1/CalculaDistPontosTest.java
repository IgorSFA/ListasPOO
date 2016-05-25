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
public class CalculaDistPontosTest {

    public CalculaDistPontosTest() {
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
    public void testPontosIguais() {
        // TODO review the generated test code and remove the default call to fail.
        Ponto p1 = new Ponto(0, 0, 0);
        Ponto p2 = new Ponto(0, 0, 0);
        //double dist = CalculaDistPontos.distancia(p1,p2);
        assertEquals(0, CalculaDistPontos.distancia(p1, p2), 0);
    }

    @Test
    public void testPontosVariadosEmX1() {
        // TODO review the generated test code and remove the default call to fail.
        Ponto p1 = new Ponto(0, 0, 0);
        Ponto p2 = new Ponto(1, 0, 0);
        //double dist = CalculaDistPontos.distancia(p1,p2);
        assertEquals(1, CalculaDistPontos.distancia(p1, p2), 0);
    }

    @Test
    public void testPontosVariadosEmX2() {
        // TODO review the generated test code and remove the default call to fail.
        Ponto p1 = new Ponto(0, 0, 0);
        Ponto p2 = new Ponto(2, 0, 0);
        //double dist = CalculaDistPontos.distancia(p1,p2);
        assertEquals(2, CalculaDistPontos.distancia(p1, p2), 0);
    }

    @Test
    public void testPontosVariadosEmXYZ() {
        // TODO review the generated test code and remove the default call to fail.
        Ponto p1 = new Ponto(2, -1, 3);
        Ponto p2 = new Ponto(1, 1, 5);
        //double dist = CalculaDistPontos.distancia(p1,p2);
        assertEquals(3, CalculaDistPontos.distancia(p1, p2), 0);
    }

}
