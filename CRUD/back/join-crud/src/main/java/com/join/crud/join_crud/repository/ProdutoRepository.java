package com.join.crud.join_crud.repository;

import com.join.crud.join_crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
