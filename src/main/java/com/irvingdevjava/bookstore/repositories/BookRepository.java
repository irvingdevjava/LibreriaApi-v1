package com.irvingdevjava.bookstore.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.irvingdevjava.bookstore.models.BookModel;


public interface BookRepository extends JpaRepository<BookModel, UUID>{

    BookModel findBookModelByTitle(String title);
    @Query(value="SELECT * FROM tb_book WHERE publisher_id=:id", nativeQuery = true)
    List<BookModel> findBookByPublisher(@Param("id") UUID id);

}
