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

    @GetMapping 
    public Iterable<Agendamento> listarAgendamentos() {
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Agendamento buscarAgendamentoPorId(@PathVariable Long id) {
        return repository.findById(id).map(agendamento -> {
            agendamento.setCliente(dadosAtualizados.getCliente());
            agendamento.setServico(dadosAtualizados.getServico());
            agendamento.setData(dadosAtualizados.getData());
            agendamento.setHorario(dadosAtualizados.getHorario());
            return repository.save(agendamento);
            }).orElseThrow(() -> new RuntimeException("Agendamento não encontrado com id: " + id));
    }

    @DeleteMapping("/{id}")
public void deletarAgendamento(@PathVariable Long id) {
    if (repository.existsById(id)) {
        repository.deleteById(id);
    } else {
        throw new RuntimeException("Agendamento com id " + id + " não encontrado.");
    }
}


}






