package cl.duoc.ms_usuario_bs.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(description = "DTO que representa los datos de un cliente en el sistema")
public class ClienteDTO {

    @Schema(description = "ID único del cliente", example = "1001")
    private Long id_cliente;

    @Schema(description = "Nombre completo del cliente", example = "Carlos Ramírez")
    private String nombre;

    @Schema(description = "Contraseña del cliente", example = "MiClaveSegura2025")
    private String contrasena;

    @Schema(description = "Dirección del cliente", example = "Calle Falsa 123, Santiago")
    private String direccion;

    @Schema(description = "Correo electrónico del cliente", example = "carlos.ramirez@example.com")
    private String email;

    @Schema(description = "Número de teléfono del cliente", example = "+56987654321")
    private String telefono;
}

