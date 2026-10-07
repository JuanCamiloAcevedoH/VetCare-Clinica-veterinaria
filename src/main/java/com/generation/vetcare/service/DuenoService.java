package com.generation.vetcare.service;

import com.generation.vetcare.model.Dueno;
import com.generation.vetcare.repository.DuenoRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DuenoService {

    private final DuenoRepository duenoRepository;

    public DuenoService(DuenoRepository duenoRepository) {

        this.duenoRepository = duenoRepository;
    }

    public List<Dueno> listarDuenos() {

        return duenoRepository.findAll();
    }

    public Optional<Dueno> buscarPorId(Long id) {

        return duenoRepository.findById(id);
    }

    public Dueno crearDueno(Dueno dueno) {
        return duenoRepository.save(dueno);
    }

}
