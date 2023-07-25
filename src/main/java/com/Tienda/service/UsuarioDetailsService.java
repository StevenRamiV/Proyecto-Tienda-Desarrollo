
package com.Tienda.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UsuarioDetailsService {
    
    public UserDetails loadUserbyUsername(String username) throws UsernameNotFoundException;
}
