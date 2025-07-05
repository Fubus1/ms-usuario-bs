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


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;



@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente", description = "Operaciones relacionadas con la entidad Cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Operation(
        summary = "Buscar cliente por ID",
        description = "Retorna los datos de un cliente específico según su ID."
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Cliente encontrado",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = ClienteDTO.class))),
        @ApiResponse(responseCode = "404", description = "Cliente no encontrado", content = @Content)
    })
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> findPedidoById(@PathVariable("id") Long id) {
        ClienteDTO clienteDTO = clienteService.findClienteById(id);
        return (clienteDTO != null) ? 
            new ResponseEntity<>(clienteDTO, HttpStatus.OK) :
            new ResponseEntity<>(HttpStatus.NOT_FOUND);     
    }
}