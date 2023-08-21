package com.microservicio.email.controller;

import com.microservicio.email.dto.MensajeResponse;
import com.microservicio.email.model.CorreoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CorreoController {
    @Autowired
    private JavaMailSender javaMailSender;
    @PostMapping(path = "/enviar-correo",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public MensajeResponse enviarCorreo(@RequestBody CorreoRequest correoRequest) {

        System.out.println("Solicitud recibida: " + correoRequest.toString());

        return new MensajeResponse("Correo Enviado");
    }
}