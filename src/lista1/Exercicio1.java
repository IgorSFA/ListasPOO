/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resp =' ';
        double a, b, c;
        do{
            System.out.print("Digite o a: ");
            a = in.nextDouble();
            in.nextLine();
            System.out.print("Digite o b: ");
            b = in.nextDouble();
            in.nextLine();
            System.out.print("Digite o c: ");
            c = in.nextDouble();
            in.nextLine();
            System.out.println("A sua equação é:\n"+a+"x² + "+b+"x +"+c+"\n?");
            resp = in.next().charAt(0);
            in.nextLine();
        }while(resp =='n');
        double delta = Math.pow(b, 2)-(4*a*c);
        double x1 = (-b+Math.pow(delta, 2))/2*a;
        double x2 = (-b-Math.pow(delta, 2))/2*a;
        System.out.println("As raízes são as seguintes:\n"+x1+"\t"+x2);
    }
}
