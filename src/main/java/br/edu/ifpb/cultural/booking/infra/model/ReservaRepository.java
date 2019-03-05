package br.edu.ifpb.cultural.booking.infra.model;

import br.edu.ifpb.cultural.booking.domain.Reserva;

import java.util.List;

public interface ReservaRepository {

    List<Reserva> getAll();
    Reserva getById(Long idReserva);
    Reserva save(Reserva reserva);
    void remove(Reserva reserva);

}
