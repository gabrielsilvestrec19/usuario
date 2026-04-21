package com.gabrielsilvestre.usuario.business;

import com.gabrielsilvestre.usuario.business.converter.UsuarioConverter;
import com.gabrielsilvestre.usuario.business.dto.UsuarioDTO;
import com.gabrielsilvestre.usuario.infraestructure.entitiy.Usuario;
import com.gabrielsilvestre.usuario.infraestructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
