package com.github.eutkin.test.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "book_id", nullable = false)
    private Long id;

    @Column(name = "book_name", nullable = false)
    private String name;

    @ManyToOne
    @JoinTable(name = "author",
            joinColumns = {@JoinColumn(name = "author_id")}, inverseJoinColumns = {
            @JoinColumn(name = "book_id")})
    private Author author;

}
