package com.vinivx.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinivx.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
