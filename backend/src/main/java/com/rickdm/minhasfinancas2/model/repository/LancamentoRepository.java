package com.rickdm.minhasfinancas2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rickdm.minhasfinancas2.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
