package br.edu.ifpb.cultural.booking.controller;

import br.edu.ifpb.cultural.booking.domain.Atracao;
import br.edu.ifpb.cultural.booking.infra.model.AtracaoRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class AtracaoController implements Serializable {

    @Inject
    private AtracaoRepository atracaoRepository;
    private List<Atracao> atracoes;

    @PostConstruct
    public void init() {
        this.atracoes = atracaoRepository.getAll();
    }

//    Getters and Setters
    public List<Atracao> getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(List<Atracao> atracoes) {
        this.atracoes = atracoes;
    }

}
