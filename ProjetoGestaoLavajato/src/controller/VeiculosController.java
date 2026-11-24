/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Veiculo;

/**
 *
 * @author miche
 */
public class VeiculosController {
    
    
    private final List<Veiculo> listarVeiculos= new ArrayList<>();
    private long proximoId = 1;
    //thorow Exception  ele funciona avisando o java pode barrar e aparecer uma mensagem de erro
    public void cadastrarVeiculo(String modelo, String placa, String tipoVeiculo, Cliente cliente) throws Exception{
        //Verifica os campos
     if (modelo ==null|| modelo.trim().isEmpty() || placa == null || placa.trim().isEmpty()){
         throw new Exception("Informar modelo e placa do veiculo");
     } 
     if(cliente == null){
        throw new Exception("Selecione um Cliente");
     }
     Veiculo novoVeiculo = new Veiculo(proximoId++, modelo, placa.toUpperCase(), cliente);
      cliente.adicionarVeiculo(novoVeiculo);
      listarVeiculos.add(novoVeiculo);
      
    }
    public List<Veiculo> listarTodos(){
        return listarVeiculos;
    }
}
