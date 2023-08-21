package com.microservicio.email.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CorreoRequest {
    private String email;
    private String placa;
    private String mensaje;
    private String parqueaderoNombre;
}