package com.saga.demo.jwt.persona;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public PersonaController(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    /**
     * Busca una persona por su ID
     *
     * @param id id de la persona
     * @return Persona buscada
     */
    @GetMapping("/personas/{id}")
    public Persona getPersonaById(@PathVariable int id) {
        return PersonasDAO.getPersonaConId(id);
    }

    /**
     * Borra una persona por su ID
     *
     * @param id id de la persona
     */
    @DeleteMapping("/personas/{id}")
    public void deletePersona(@PathVariable int id) {
        PersonasDAO.deletePersonaConId(id);
    }

    /**
     * Actualiza una persona
     *
     * @param persona persona a actualizar
     */
    @PutMapping("/personas/")
    public void updatePersona(@RequestBody Persona persona) {
        PersonasDAO.actualizaPersona(persona);
    }

    /**
     * Lista todas las personas
     *
     * @return Lista de todas las personas
     */
    @GetMapping("/personas/")
    public List<Persona> getAllPersonas() {
        return PersonasDAO.getAllPersonas();
    }

    /**
     * Añade una persona
     *
     * @return Persona añadida
     */
    @PostMapping("/personas/")
    public Persona addPersona(@RequestBody Persona persona) {
        return PersonasDAO.insertaPersona(persona);
    }

}
