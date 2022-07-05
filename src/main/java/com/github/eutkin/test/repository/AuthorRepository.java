package com.github.eutkin.test.repository;

import com.github.eutkin.test.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.lang.Nullable;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Nullable
    Author findAuthorByName(String name);
}
