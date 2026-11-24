/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miche
 */
public class Veiculo {
    private long id;
    private String modelo;
    private String placaveiculo;
    private Cliente cliente;
    //Construtor
    public Veiculo(long id, String modelo, String placaveiculo, Cliente cliente ){
        this.modelo=modelo;
        this.placaveiculo=placaveiculo;
        this.cliente=cliente;
        this.id=id;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

    public long getId() {
        return id;
    }


   

    public Cliente getCliente() {
        return cliente;
    }
//metodo que serve para transfomar um objeto em texto legivel (String)
 @Override
 public String toString(){
     return modelo +"("+placaveiculo + ")";
 }
    
}
