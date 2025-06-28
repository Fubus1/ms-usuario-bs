package cl.duoc.ms_usuario_bs.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_usuario_bs.model.dto.ClienteDTO;

@FeignClient(name = "ms-cliente-bd", url = "${CLIENTE_SERVICE_URL}")
public interface ClienteBsFeignCliente {
    @GetMapping("/cliente/{id}")
    public ResponseEntity<ClienteDTO> findClienteById(@PathVariable("id") Long id);

}