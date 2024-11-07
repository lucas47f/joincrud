package com.join.crud.join_crud.repository;

import com.join.crud.join_crud.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}