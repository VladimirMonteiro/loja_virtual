package com.outercode.lojaVirtual.controllers;

import com.outercode.lojaVirtual.models.Acesso;
import com.outercode.lojaVirtual.repositories.AcessoRepository;
import com.outercode.lojaVirtual.services.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @Autowired
    private AcessoRepository acessoRepository;


    @PostMapping(value = "/salvarAcesso")
    public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso) {
        return ResponseEntity.ok().body(acessoService.save(acesso));
    }

    @PostMapping(value = "/deleteAcesso")
    public ResponseEntity<?> deleteAcessor(@RequestBody Acesso acesso) {

        acessoRepository.deleteById(acesso.getId());
        return ResponseEntity.ok().build();

    }
}
