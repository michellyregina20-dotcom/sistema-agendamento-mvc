/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.TipoServico;

/**
 *
 * @author miche
 */
public class ServicoController {
    
    public void cadastrar(long id, String nome, String descricao, double preco) throws Exception {
        if (id <= 0) {
            throw new Exception("O ID deve ser maior que zero!");
        }
        for (TipoServico s : listarServicos) {
            if (s.getId() == id) {
                throw new Exception("Já existe um serviço com este ID!");
            }
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("O nome do serviço é obrigatório!");
        }
        if (preco <= 0) {
            throw new Exception("O preço deve ser maior que zero!");
        }
        listarServicos.add(new TipoServico(id, nome.trim(), descricao, preco));
    }
    
    
    //Criação de lista
     private final List<TipoServico> listarServicos = new ArrayList<>();
     //Controle de numeração automatica para que cada serviço tenha numeração unica
     private long proximoId = 1;
     public ServicoController(){
         // O sistema e criado Já inicia com os 3 serviços principais cadastrados
        listarServicos.add(new TipoServico(1, "Ducha Rápida", "Lavagem externa com agua", 35.00));
    listarServicos.add(new TipoServico(2, "Lavagem simples", "Lavagem externa + aspiração interna", 55.00));
    listarServicos.add(new TipoServico(3, "Lavagem com cera", "Lavagem completa + cera liquida ou em pasta", 75.00));
    listarServicos.add(new TipoServico(4, "Lavagem Tecnica", "Limpeza minuciosa com pincéis e produtos", 150.00));
        
     }
     //Vadidacao
     public void editar(TipoServico servicoEditado) throws Exception {
        if (servicoEditado.getNome() == null || servicoEditado.getNome().trim().isEmpty()) {
            throw new Exception("O nome do serviço é obrigatório!");
        }
        //Verifica se o preço é menor que zer talves eu devesse fazer uma classe de pagamento para deixar mais organizado esse metodo
        if (servicoEditado.getPreco() <= 0) {
            throw new Exception("O preço deve ser maior que zero");
        }

        for (int i = 0; i < listarServicos.size(); i++) {
            if (listarServicos.get(i).getId() == servicoEditado.getId()) {
                listarServicos.set(i, servicoEditado);
                break;
            }
        }
    }
    
     

    
    public List<TipoServico> listarTodos() {
        return listarServicos;
    }

    }

