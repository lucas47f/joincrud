package com.join.crud.join_crud.service;

import com.join.crud.join_crud.model.Categoria;
import com.join.crud.join_crud.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizar(Long id, Categoria categoriaAtualizada) {
        categoriaAtualizada.setId(id);
        return categoriaRepository.save(categoriaAtualizada);
    }

    public void excluir(Long id) {
        categoriaRepository.deleteById(id);
    }
}