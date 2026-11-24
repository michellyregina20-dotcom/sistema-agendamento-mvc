/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author miche
 */
public class Agendamento {
  private long id;
private Cliente cliente;
private Veiculo veiculo;
private TipoServico tiposervico;
private LocalDateTime dataHora;
private StatusAgendamento status;

//Construtor
public Agendamento(){
    this.status=StatusAgendamento.AGENDADO;
}
public Agendamento(long id, Cliente cliente, Veiculo veiculo, TipoServico tipoServico, LocalDateTime dataHora){
    this.id=id;
    this.cliente=cliente;
    this.veiculo=veiculo;
    this.tiposervico=tipoServico;
    this.dataHora=dataHora;
    this.status=StatusAgendamento.AGENDADO;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoServico getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(TipoServico tiposervico) {
        this.tiposervico = tiposervico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusAgendamento getStatus() {
        return status;
    }
    public void setStatus(StatusAgendamento status){
        this.status=status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    

    

public void agendarServico(){
    this.status=StatusAgendamento.EM_ANDAMENTO;
    
}
public void concluir(){
    this.status=StatusAgendamento.CONCLUIDO;
}
public void cancelar(){
    this.status=StatusAgendamento.CANCELADO;
}

}
