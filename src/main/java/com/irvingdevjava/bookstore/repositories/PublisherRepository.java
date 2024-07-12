package com.irvingdevjava.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.bookstore.models.PublisherModel;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID>{

}
