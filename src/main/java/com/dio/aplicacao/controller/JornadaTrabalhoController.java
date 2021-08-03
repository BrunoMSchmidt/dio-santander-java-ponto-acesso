package com.dio.aplicacao.controller;

import com.dio.aplicacao.model.JornadaTrabalho;
import com.dio.aplicacao.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @GetMapping
    public List<JornadaTrabalho> getAll(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{id}")
    public JornadaTrabalho getById(@PathVariable Long id){
        return jornadaTrabalhoService.findById(id);
    }

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable Long id){
        jornadaTrabalhoService.deleteById(id);
    }




}
