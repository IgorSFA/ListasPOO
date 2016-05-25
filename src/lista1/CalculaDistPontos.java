/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author Igor
 */
public class CalculaDistPontos {

    public static double distancia(Ponto p1, Ponto p2) {
        double deltax = p1.getX() > p2.getX() ? p1.getX() - p2.getX() : p2.getX() - p1.getX(),
                deltay = p1.getY() > p2.getY() ? p1.getY() - p2.getY() : p2.getY() - p1.getY(),
                deltaz = p1.getZ() > p2.getZ() ? p1.getZ() - p2.getZ() : p2.getZ() - p1.getZ();
        return Math.sqrt(Math.pow(deltax, 2) + Math.pow(deltay, 2) + Math.pow(deltaz, 2));
        //return 1;

    }
}
