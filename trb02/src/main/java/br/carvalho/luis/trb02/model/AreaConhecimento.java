package br.carvalho.luis.trb02.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * AreaConhecimento
 */
@Entity
public class AreaConhecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;

    @ManyToMany
    private List<Avaliador> avaliadores;

    @OneToMany
    private List<Trabalho> trabalhos;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the avaliadores
     */
    public List<Avaliador> getAvaliadores() {
        return avaliadores;
    }

    /**
     * @return the trabalhos
     */
    public List<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    /**
     * @param avaliadores the avaliadores to set
     */
    public void setAvaliadores(List<Avaliador> avaliadores) {
        this.avaliadores = avaliadores;
    }
    
    /**
     * @param trabalhos the trabalhos to set
     */
    public void setTrabalhos(List<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }
    
}