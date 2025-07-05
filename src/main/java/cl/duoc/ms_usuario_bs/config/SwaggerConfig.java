package cl.duoc.ms_usuario_bs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                   .info(new Info().title("API de usuario (ms-usuario-bs)")
                                    .description("Microservicio tipo BS (business service)  se encarga de manejar la lógica de negocio del sistema."
                                    + "Recibe solicitudes desde el BFF, realiza validaciones o cálculos necesarios, y se comunica con el microservicio de base de datos para guardar o consultar información.")
                                    .version("1.0.0"));
    }

    

}
