package cl.duoc.ms_usuario_bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_usuario_bs.clients.ClienteBsFeignCliente;
import cl.duoc.ms_usuario_bs.model.dto.ClienteDTO;

@Service
public class ClienteService {
    @Autowired
    ClienteBsFeignCliente clienteBsFeignCliente;
    public ClienteDTO findClienteById(Long id){
        ClienteDTO clienteDTO = clienteBsFeignCliente.findClienteById(id).getBody();
        return clienteDTO;
    }

}
