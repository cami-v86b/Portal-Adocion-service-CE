package com.adopta.service.service;

import com.adopta.service.entity.Cliente;
import com.adopta.service.repository.ClienteRepository;
import com.adopta.service.utils.GenericResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.Optional;

import static com.adopta.service.utils.Global.*;

@AllArgsConstructor

@Service
@Transactional
public class ClienteService{
    private final ClienteRepository repository;
    //Metodo para iniciar sesion
    public GenericResponse<Cliente> login(String email, String contrasenia){
        Optional<Cliente> optU = this.repository.login(email, contrasenia);
        if(optU.isPresent()){
            return new GenericResponse<Cliente>(TIPO_AUTH, RPTA_OK, "Haz iniciado sesión correctamente", optU.get());
        }else{
            return new GenericResponse<Cliente>(TIPO_AUTH, RPTA_WARNING, "Lo sentimos, ese usuario no existe", new Cliente());
        }
    }

}

