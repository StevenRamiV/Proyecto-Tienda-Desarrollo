
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table (name="rol")
public class Usuario implements Serializable{
     //Version de serializacion
    private static final long serialVersionUID = 1L;
    
    private Long idUsuario;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;
    
}
