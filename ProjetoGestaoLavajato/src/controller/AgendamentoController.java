/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Agendamento;
import model.Cliente;
import model.StatusAgendamento;
import model.TipoServico;
import model.Veiculo;

/**
 *
 * @author miche
 */
public class AgendamentoController {
    //Guardar os agendamento na lista
    private final List<Agendamento> listarAgendamentos = new ArrayList<>();
    private long proximoId =1;
    
    //Verifica se os dados enviados estao vazios se faltar dados ele devolve como falso caso verdadeiro e guarda na lista de devolve verdadeiro
    public boolean agendarServico(Cliente cliente, Veiculo veiculo, TipoServico tipoServico, LocalDateTime dataHora) throws Exception{
        if (cliente == null || veiculo == null || tipoServico == null || dataHora == null){
            return false;
        }
        Agendamento novo = new Agendamento(proximoId++, cliente, veiculo, tipoServico,dataHora);
        listarAgendamentos.add(novo);
        return true;
    }
    //Percorre a lista de agendados ate encontrar o idagendamento e altera seu estado como agendado ou concluido
    public void alteraStatus(long idAgendamento, StatusAgendamento novoStatus){
        for(Agendamento ag: listarAgendamentos){
            if (ag.getId() == idAgendamento){
                ag.setStatus(novoStatus);
                break;
            }
        }
    }
    //devolve a lista completa de agementos registrados
    public List<Agendamento> listarTodos(){
        return listarAgendamentos;
    }
}
