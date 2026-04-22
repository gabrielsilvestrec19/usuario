package com.gabrielsilvestre.usuario.infraestructure.repository;


import com.gabrielsilvestre.usuario.infraestructure.entitiy.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone,Long> {
}
