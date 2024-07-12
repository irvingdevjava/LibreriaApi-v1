package com.irvingdevjava.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.bookstore.models.ReviewModel;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID>{
    
}
