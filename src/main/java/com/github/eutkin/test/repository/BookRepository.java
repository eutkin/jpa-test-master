package com.github.eutkin.test.repository;

import com.github.eutkin.test.entity.Author;
import com.github.eutkin.test.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.lang.Nullable;

import java.util.List;
public interface BookRepository extends JpaRepository<Book, Long> {

    @Nullable
    List<Book> findBooksByAuthor(Author author);
}
