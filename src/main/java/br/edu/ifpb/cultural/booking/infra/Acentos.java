package br.edu.ifpb.cultural.booking.infra;

import br.edu.ifpb.cultural.booking.domain.Acento;
import br.edu.ifpb.cultural.booking.infra.model.AcentoRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Acentos implements AcentoRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Acento> getAll() {
        return manager.createQuery("SELECT a FROM Acento a").getResultList();
    }

    public Acento getById(Long idAcento) {
        return manager.find(Acento.class, idAcento);
    }

    public Acento save(Acento acento) {
        manager.persist(acento);
        return acento;
    }

    public void remove(Acento acento) {
        manager.remove(acento);
    }

}
