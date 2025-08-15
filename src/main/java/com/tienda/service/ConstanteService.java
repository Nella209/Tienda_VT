package com.tienda.service;

import com.tienda.domain.Constante;
import com.tienda.repository.ConstanteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConstanteService {

    // Permite crear una unica instancia d constanteRepository, y la crea de manera automatica sin hacerle un new
    @Autowired
    private ConstanteRepository constanteRepository;

    @Transactional(readOnly = true)
    public List<Constante> getConstantes(boolean activo) {

        var lista = constanteRepository.findAll();
        /*Solo porque existe el activo
        Se valida solo si se quieren las constantes activas*/
        if (activo) {
      //      lista.removeIf(c -> !c.isActivo());

        }
        return lista;

    }

    @Transactional(readOnly = true)
    public Constante getConstante(Constante constante) {
        return constanteRepository.findById(constante.getIdConstante())
                .orElse(null);
    }

    @Transactional
    public void save(Constante constante) {
        constanteRepository.save(constante);
    }

    @Transactional
    public boolean delete(Constante constante) {
        try {
            constanteRepository.delete(constante);
            constanteRepository.flush();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
