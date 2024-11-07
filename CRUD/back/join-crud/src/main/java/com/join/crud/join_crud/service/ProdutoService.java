package com.join.crud.join_crud.service;

import com.join.crud.join_crud.model.Produto;
import com.join.crud.join_crud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
   
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodas() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {
        produtoAtualizado.setId(id);
        return produtoRepository.save(produtoAtualizado);
    }

    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }
}