
package com.tienda.domain;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="rol")
public class Rol implements Serializable {
    private static final long serialVersionUID =1L;
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idRol;
    private String nombre;
    private Long idUsuario;

  
}
