package br.carvalho.luis.trb02.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.carvalho.luis.trb02.model.AreaConhecimento;

/**
 * IAreaConhecimentoRepository
 */
@Repository
public interface IAreaConhecimentoRepository extends JpaRepository<AreaConhecimento, Long>{

    
}