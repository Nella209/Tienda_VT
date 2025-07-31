
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
@Table(name="producto")
public class Producto implements Serializable {
    private static final long serialVersionUID =1L;
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProducto;
    //private Long idCategoria;
    //Ya no es necesario
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_Categoria")
    private Categoria categoria;
}
