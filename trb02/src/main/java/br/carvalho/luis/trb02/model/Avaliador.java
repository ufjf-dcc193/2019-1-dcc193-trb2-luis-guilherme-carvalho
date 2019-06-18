package br.carvalho.luis.trb02.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Avaliador{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private String email;

    @ManyToMany
    private List<AreaConhecimento> areaConhecimentos;

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the areaConhecimentos
     */
    public List<AreaConhecimento> getAreaConhecimentos() {
        return areaConhecimentos;
    }

    /**
     * @param areaConhecimentos the areaConhecimentos to set
     */
    public void setAreaConhecimentos(List<AreaConhecimento> areaConhecimentos) {
        this.areaConhecimentos = areaConhecimentos;
    }    
}