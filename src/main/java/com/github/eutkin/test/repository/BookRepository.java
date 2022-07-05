package com.github.eutkin.test.repository;

import com.github.eutkin.test.entity.Author;
import com.github.eutkin.test.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.lang.Nullable;

import java.util.List;

/*
Зачем нам интерфейс для книг, если нам надо искать автора?
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    /*
      То есть нам сначала надо найти автора, а потом найти все его книги? И сделать два запроса вместо одного с join?
      Выглядит не очень эффективно.
     */
    @Nullable
    List<Book> findBooksByAuthor(Author author);
}
