package com.leticia.agendamento.controller;

import com.leticia.agendamento.Model.Agendamento;
import com.leticia.agendamento.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository repository;

    @PostMapping
    public Agendamento criarAgendamento(@RequestBody Agendamento novoAgendamento) {
        return repository.save(novoAgendamento);
    }
}

