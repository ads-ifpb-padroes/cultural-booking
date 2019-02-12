package br.edu.ifpb.cultural.booking.infra.model;

import br.edu.ifpb.cultural.booking.domain.Atracao;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public interface AtracaoRepository {

    List<Atracao> getAll();
    Atracao getById(Long idAtracao);
    Atracao save(Atracao atracao);
    void remove(Atracao atracao);

}
