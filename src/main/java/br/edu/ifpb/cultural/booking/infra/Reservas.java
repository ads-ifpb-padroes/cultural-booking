package br.edu.ifpb.cultural.booking.infra;

import br.edu.ifpb.cultural.booking.domain.Reserva;
import br.edu.ifpb.cultural.booking.infra.model.ReservaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Reservas implements ReservaRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Reserva> getAll() {
        return manager.createQuery("SELECT r FROM Reserva r").getResultList();
    }

    public Reserva getById(Long idReserva) {
        return manager.find(Reserva.class, idReserva);
    }

    public Reserva save(Reserva reserva) {
        manager.persist(reserva);
        return reserva;
    }

    public void remove(Reserva reserva) {
        manager.remove(reserva);
    }

}
