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
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calculaPreco() {
        double subtotal = this.preco * this.quantidade;
        if (this.quantidade <= 10) {
            return subtotal;
        }
        if (this.quantidade <= 20) {
            return subtotal - calculaDesconto(subtotal, 10);
        }
        if (this.quantidade <= 50) {
            return subtotal - calculaDesconto(subtotal, 20);
        }
        return subtotal - calculaDesconto(subtotal, 25);
    }

    private double calculaDesconto(double subtotal, int porcentagem) {
        return (subtotal * porcentagem) / 100;
    }

}
