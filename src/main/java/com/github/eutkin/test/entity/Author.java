package com.github.eutkin.test.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "author_id", nullable = false)
    private Long id;

    @Column(name = "author_name", nullable = false)
    private String name;

    /*
      По заданию нам надо найти автора и все его книги. Но Автор не ссылается на книги. Почему?
     */

}
