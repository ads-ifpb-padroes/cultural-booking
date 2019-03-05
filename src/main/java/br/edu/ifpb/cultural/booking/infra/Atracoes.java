package br.edu.ifpb.cultural.booking.infra;

import br.edu.ifpb.cultural.booking.domain.Atracao;
import br.edu.ifpb.cultural.booking.infra.model.AtracaoRepository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class Atracoes implements AtracaoRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Atracao> getAll() {
        return manager.createQuery("FROM Atracao a").getResultList();
    }

    public Atracao getById(Long idAtracao) {
        return manager.find(Atracao.class, idAtracao);
    }

    public Atracao save(Atracao atracao) {
        manager.persist(atracao);
        return atracao;
    }

    public void remove(Atracao atracao) {
        manager.remove(atracao);
    }

}
