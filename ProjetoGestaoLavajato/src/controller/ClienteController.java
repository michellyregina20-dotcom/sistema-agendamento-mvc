/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author miche
 */
public class ClienteController {
   
    private final List<model.Cliente> listaClientes = new ArrayList<>();
    private long proximoId = 1;
    
  public void cadastrar(long id, String nome, String cpf, String telefone, String email) throws Exception {
      //disparo de mensagem caso os campos nao sejam prechidos certos
        if (nome == null || nome.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            throw new Exception("Nome e CPF são obrigatórios");
        }

        // Verifica se já existe algum cliente com o mesmo ID
        for (model.Cliente c : listaClientes) {
            if (c.getId() == id) {
                throw new Exception("Já existe um cliente cadastrado com o ID " + id + "!");
            }
        }

        Cliente novoCliente = new Cliente(id, nome, cpf, telefone, email);
        listaClientes.add(novoCliente);
    }
    public List<model.Cliente> listarTodos() {
        return listaClientes;
    }
    public void excluir(long id){
        listaClientes.removeIf(cliente -> cliente.getId() ==id);
    }
    
}
