/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miche
 */
public enum StatusAgendamento {
 AGENDADO("Agendado"),
 EM_ANDAMENTO("Em Andamento"),
 CONCLUIDO("Concluido"),
 CANCELADO("Cancelado");
 
 private final String descricao;
 StatusAgendamento(String descricao){
     this.descricao=descricao;
 }
 @Override
 public String toString(){
     return descricao;
 }
}
