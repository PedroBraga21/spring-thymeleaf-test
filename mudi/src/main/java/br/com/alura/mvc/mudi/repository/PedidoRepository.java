package br.com.alura.mvc.mudi.repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(StatusPedido aguardando);

//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<Pedido> recuperaTodosOsPedidos(){
//        Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
//        return query.getResultList();
//    }


}
