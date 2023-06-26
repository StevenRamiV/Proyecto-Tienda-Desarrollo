
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    // Metodo que retorna la lista de categorias
    public List<Categoria> getCategorias(boolean activos);
    
}
