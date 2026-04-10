package com.gabrielsilvestre.usuario.infraestructure.repository;

import com.gabriel.aprendendo_spring.infraestructure.entitiy.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {


}
