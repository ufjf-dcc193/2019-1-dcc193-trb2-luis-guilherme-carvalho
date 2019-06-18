package br.carvalho.luis.trb02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.carvalho.luis.trb02.model.Revisao;

/**
 * IRevisaoRepository
 */
@Repository
public interface IRevisaoRepository extends JpaRepository<Revisao, Long>
{

    
}