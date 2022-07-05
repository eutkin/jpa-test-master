package com.github.eutkin.test;

import com.github.eutkin.test.entity.Author;
import com.github.eutkin.test.repository.AuthorRepository;
import com.github.eutkin.test.repository.BookRepository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpaTestApplication implements ApplicationRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public JpaTestApplication(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaTestApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {

        final Author author = authorRepository.findAuthorByName("А.С. Пушкин");
        System.out.println(bookRepository.findBooksByAuthor(author));
    }
}
