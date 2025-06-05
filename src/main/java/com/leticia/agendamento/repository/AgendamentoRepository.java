package com.leticia.agendamento.repository;

import com.leticia.agendamento.Model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}

