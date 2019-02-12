package br.edu.ifpb.cultural.booking.infra.model;

import br.edu.ifpb.cultural.booking.domain.Acento;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public interface AcentoRepository {

    List<Acento> getAll();
    Acento getById(Long idAcento);
    Acento save(Acento acento);
    void remove(Acento acento);

}
