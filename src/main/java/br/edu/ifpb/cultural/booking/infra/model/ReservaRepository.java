package br.edu.ifpb.cultural.booking.infra.model;

import br.edu.ifpb.cultural.booking.domain.Atracao;
import br.edu.ifpb.cultural.booking.domain.Reserva;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public interface ReservaRepository {

    List<Reserva> getAll();
    Reserva getById(Long idReserva);
    Reserva save(Reserva reserva);
    void remove(Reserva reserva);

}
