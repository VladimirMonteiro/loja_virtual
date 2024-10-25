package com.outercode.lojaVirtual.services;


import com.outercode.lojaVirtual.models.Acesso;
import com.outercode.lojaVirtual.repositories.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso) {
        return acessoRepository.save(acesso);
    }
}
