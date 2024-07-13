package com.irvingdevjava.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.bookstore.models.BookModel;


public interface BookRepository extends JpaRepository<BookModel, UUID>{

    // BookModel findBookModelByTitle(String title);
    // @Query(value="SELECT * FROM tb_book WHERE publisher_id=:id", nativeQuery = true)
    // List<BookModel> findBooksByPublisherId(@Param("id") UUID id);

}
