package br.edu.ifpb.cultural.booking.controller;

import br.edu.ifpb.cultural.booking.domain.Atracao;
import br.edu.ifpb.cultural.booking.infra.model.AtracaoRepository;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class AtracaoController implements Serializable {

    @Inject
    private AtracaoRepository atracoes;

    public List<Atracao> getTodasAsAtracoes() {
        return atracoes.getAll();
    }

}
