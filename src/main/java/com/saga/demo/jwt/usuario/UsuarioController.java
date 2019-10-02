package com.saga.demo.jwt.usuario;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsuarioController(UsuarioRepository usuarioRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping(value = {"/users/", "/users"})
    public void saveUsuario(@RequestBody Usuario user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        usuarioRepository.save(user);
    }

    @GetMapping(value = {"/users/", "/users"})
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping(value = {"/users/{username}/", "/users/{username}"})
    public Usuario getUsuario(@PathVariable String username) {
        return usuarioRepository.findByUsername(username);
    }

    @GetMapping(value = {"/users/menu/", "/users/menu"})
    public Menu menu() {
        Menu menu = new Menu();

        /*List<MenuItem> l1 = new ArrayList<>();
        List<MenuItem> l2 = new ArrayList<>();
        List<MenuItem> l3 = new ArrayList<>();
        List<MenuItem> l4 = new ArrayList<>();

        l3.add(new MenuItem("Nueva Oficina", "/oficina/nueva"));
        l3.add(new MenuItem("Borrar Oficina", "/oficina/borrar"));
        l3.add(new MenuItem("Editar Oficina", "/oficina/editar"));

        l4.add(new MenuItem("Nueva Usuario", "/user/nuevo"));
        l4.add(new MenuItem("Borrar Usuario", "/user/borrar"));
        l4.add(new MenuItem("Editar Usuario", "/user/editar"));

        l2.add(new MenuItem("Usuarios", "/admin/user", l4));
        l2.add(new MenuItem("Oficinas", "", l3));

        l1.add(new MenuItem("Home", "/item1"));
        l1.add(new MenuItem("Administracion", "", l2));
        l1.add(new MenuItem("Consultas", "/item2"));
        l1.add(new MenuItem("Informes", "/item3"));
        l1.add(new MenuItem("Alarmas", "/item4"));
        l1.add(new MenuItem("Salir", "/logout"));
        return new Menu(l1);*/

        List<MenuItem> litado = new ArrayList<MenuItem>();
        litado.add(new MenuItem().name("Inicio").uri("/"));
        litado.add(new MenuItem().name("Oficinas").uri("/oficinas"));
        litado.add(new MenuItem().name("Consultas").uri("/consultas"));
        litado.add(new MenuItem().name("Salir").uri("/salir"));
        return new Menu(litado);
    }
}
