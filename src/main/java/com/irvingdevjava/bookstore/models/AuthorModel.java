package com.irvingdevjava.bookstore.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="TB_AUTHOR")
public class AuthorModel implements Serializable {
        private static final long serialVersionUID=1L;

        

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;

        @Column(nullable = false, unique = true)
        private String name;

        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        @ManyToMany(mappedBy = "authors", fetch= FetchType.LAZY)
        private Set<BookModel> books=new HashSet<>();

        public static long getSerialversionuid() {
            return serialVersionUID;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<BookModel> getBooks() {
            return books;
        }

        public void setBooks(Set<BookModel> books) {
            this.books = books;
        }

      
        


}
