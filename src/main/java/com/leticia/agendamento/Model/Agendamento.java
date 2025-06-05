package com.leticia.agendamento.Model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cliente;
    private String servico;
    private LocalDate data;
    private LocalTime horario;

    // Construtor vazio (obrigatório pro JPA)
    public Agendamento() {
    }

    // Construtor com tudo (menos o ID, que é automático)
    public Agendamento(String cliente, String servico, LocalDate data, LocalTime horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    // Getters e Setters (acessar e mudar os dados)

    public Long getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
}
