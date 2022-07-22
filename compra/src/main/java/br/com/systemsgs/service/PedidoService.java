package br.com.systemsgs.service;

import br.com.systemsgs.model.ModelPedido;
import br.com.systemsgs.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public ModelPedido salvar(ModelPedido modelPedido){
        return pedidoRepository.save(modelPedido);
    }

}
