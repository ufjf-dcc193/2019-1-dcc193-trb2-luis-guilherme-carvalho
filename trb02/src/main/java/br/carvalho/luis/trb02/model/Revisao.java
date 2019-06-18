package br.carvalho.luis.trb02.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Revisao
 */
@Entity
public class Revisao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String descricao;

    @ManyToOne
    private Trabalho trabalho;

    @ManyToOne
    private Avaliador avaliador;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the avaliador
     */
    public Avaliador getAvaliador() {
        return avaliador;
    }
    
    /**
     * @param avaliador the avaliador to set
     */
    public void setAvaliador(Avaliador avaliador) {
        this.avaliador = avaliador;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the trabalho
     */
    public Trabalho getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }    
}