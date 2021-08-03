package com.dio.aplicacao.service;

import com.dio.aplicacao.model.JornadaTrabalho;
import com.dio.aplicacao.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JornadaTrabalhoService {
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoRepository.findAll();
    }

    public JornadaTrabalho findById(Long id){
        return jornadaTrabalhoRepository.findById(id).orElse(null);
        // OU LANÇANDO EXCESSÃO
//        return jornadaTrabalhoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Objeto não encontrado!"));
//    Também é possível usar o ResponseEntity
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(JornadaTrabalho jornadaTrabalho){
        jornadaTrabalhoRepository.delete(jornadaTrabalho);
    }

    public void deleteById(Long id){
        jornadaTrabalhoRepository.deleteById(id);
    }

}
