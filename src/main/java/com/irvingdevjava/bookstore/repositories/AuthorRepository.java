package com.irvingdevjava.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.bookstore.models.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID>{
    
}
