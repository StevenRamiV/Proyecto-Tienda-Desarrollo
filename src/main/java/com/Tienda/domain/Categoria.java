
package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    // VERSION DE SERIALIZACION
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idCategoria; // Se transforma en id_categoria
    private String descripcion;
    private String rutaimagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="idCategoria")
    private List<Producto> productos;
    
    public Categoria() {
    }

    public Categoria(String descripcion, String rutaimagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaimagen = rutaimagen;
        this.activo = activo;
    }

    public void setRutaImagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getIdCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
