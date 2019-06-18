package br.carvalho.luis.trb02.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.carvalho.luis.trb02.model.Avaliador;

/**
 * IAvaliadorRepository
 */
@Repository
public interface IAvaliadorRepository extends JpaRepository<Avaliador,Long>
{

    
}