/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miche
 */
public class Cliente {
    private long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<Veiculo> veiculos;
    
    
    //Construtor
    public Cliente(){
        this.veiculos=new ArrayList<>();
    }
   //Contrutor
    public Cliente(long id, String nome, String cpf, String telefone, String email){
       this.id=id;
       this.nome=nome;
       this.cpf=cpf;
       this.telefone=telefone;
       this.email=email;
       this.veiculos= new ArrayList<>();
       
    }
    //Metodos de acesso 
    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
   
    
}
