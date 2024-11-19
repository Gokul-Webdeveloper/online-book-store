package com.externalBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.externalBookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}
