
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
@Table(name="constante")
public class Constante implements Serializable {
    private static final long serialVersionUID =1L;
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idConstante;
    
    private String atributo;
    private String valor;
    
}
