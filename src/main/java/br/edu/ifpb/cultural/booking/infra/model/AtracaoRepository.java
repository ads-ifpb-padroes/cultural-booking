package br.edu.ifpb.cultural.booking.infra.model;

import br.edu.ifpb.cultural.booking.domain.Atracao;

import java.io.Serializable;
import java.util.List;

public interface AtracaoRepository extends Serializable {

    List<Atracao> getAll();
    Atracao getById(Long idAtracao);
    Atracao save(Atracao atracao);
    void remove(Atracao atracao);

}
