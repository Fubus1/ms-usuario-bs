package cl.duoc.ms_usuario_bs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_usuario_bs.model.dto.ClienteDTO;
import cl.duoc.ms_usuario_bs.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> findPedidoById(@PathVariable("id") Long id) {
        ClienteDTO clienteDTO = clienteService.findClienteById(id);
        return (clienteDTO != null)?  new ResponseEntity<>(clienteDTO, HttpStatus.OK) :
                                     new ResponseEntity<>(HttpStatus.NOT_FOUND);     
                                        
    }
    

}
