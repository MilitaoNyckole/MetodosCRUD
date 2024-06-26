package com.projeto.java1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.java1.domain.Produto;

@Repository
public interface ProdutoRepository  extends  JpaRepository<Produto, Long>{

    
}
