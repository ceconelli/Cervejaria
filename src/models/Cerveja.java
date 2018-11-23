/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author gceconelli
 */
public class Cerveja {
    
    private int cod_cerveja;
    private int cod_marca;
    private int cod_estilo;
    private float graduacao;
    private float preco;

    public Cerveja(int cod_cerveja, int cod_marca, int cod_estilo, float graduacao, float preco) {
        this.cod_cerveja = cod_cerveja;
        this.cod_marca = cod_marca;
        this.cod_estilo = cod_estilo;
        this.graduacao = graduacao;
        this.preco = preco;
    }

    public int getCod_cerveja() {
        return cod_cerveja;
    }

    public void setCod_cerveja(int cod_cerveja) {
        this.cod_cerveja = cod_cerveja;
    }

    public int getCod_marca() {
        return cod_marca;
    }

    public void setCod_marca(int cod_marca) {
        this.cod_marca = cod_marca;
    }

    public int getCod_estilo() {
        return cod_estilo;
    }

    public void setCod_estilo(int cod_estilo) {
        this.cod_estilo = cod_estilo;
    }

    public float getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(float graduacao) {
        this.graduacao = graduacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
