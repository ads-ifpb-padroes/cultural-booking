package br.edu.ifpb.cultural.booking.infra.model;

import br.edu.ifpb.cultural.booking.domain.Acento;

import java.util.List;

public interface AcentoRepository {

    List<Acento> getAll();
    Acento getById(Long idAcento);
    Acento save(Acento acento);
    void remove(Acento acento);

}
