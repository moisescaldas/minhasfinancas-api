package com.github.moises.minhasfinancasbackend.model.repositories;

import com.github.moises.minhasfinancasbackend.model.entities.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
