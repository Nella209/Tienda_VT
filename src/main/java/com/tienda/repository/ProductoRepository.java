
package com.tienda.repository;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductoRepository 
    extends JpaRepository<Producto, Long>{
    
    //  Consulta ampliada para recuperar los productos que tiene un
    //rango de precios ordenados por precio :b
    
    public List<Producto> findByPrecioBetweenOrderByPrecio(double precioInf, double precioSup);
    
    //  Consulta JPQL para recuperar los productos que tiene un
    //rango de precios ordenados por precio :b
    
    @Query(value = "SELECT a FROM Producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.precio")   
    public List<Producto> consultaJPQL(double precioInf, double precioSup);
    
//  Consulta SQL para recuperar los productos que tiene un
    //rango de precios ordenados por precio :b
    
    @Query(nativeQuery = true,
            value = "SELECT * FROM producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.precio")   
    public List<Producto> consultaSQL(double precioInf, double precioSup);
    
}
