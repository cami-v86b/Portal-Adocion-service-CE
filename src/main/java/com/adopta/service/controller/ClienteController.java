package com.adopta.service.controller;

import com.adopta.service.entity.Cliente;
import com.adopta.service.service.ClienteService;
import com.adopta.service.utils.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/usuario")
public class ClienteController {
    private final ClienteService service;
    @PostMapping("/login")
    public GenericResponse<Cliente> login(HttpServletRequest request){
        String email = request.getParameter("email");
        String contrasenia = request.getParameter("pass");
        return this.service.login(email, contrasenia);
    }

}
