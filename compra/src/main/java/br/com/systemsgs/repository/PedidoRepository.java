package br.com.systemsgs.repository;

import br.com.systemsgs.model.ModelPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<ModelPedido, Long> {

}
