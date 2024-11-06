package com.example.ServidorSura5.REPOSITORIOS;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRepositorioEnfermedad extends JpaRepository <Enfermedad, Long> {
}
