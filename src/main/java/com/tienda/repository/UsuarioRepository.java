package com.tienda.repository;

import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

    //Esta consulta ampliada se usa para "activar" un usuario desde el correo enviado...
    public Usuario findByUsernameAndPassword(String username, String Password);

    //
    public Usuario findByUsernameOrCorreo(String username, String correo);

    //Esta consulta ampliada se usa para validar si un "username" o "correo" han sido utilizados por otro usuario
    public boolean existsByUsernameOrCorreo(String username, String correo);

}
