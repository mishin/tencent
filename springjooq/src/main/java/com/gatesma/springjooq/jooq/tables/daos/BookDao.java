/*
 * This file is generated by jOOQ.
 */
package com.gatesma.springjooq.jooq.tables.daos;


import com.gatesma.springjooq.jooq.tables.Book;
import com.gatesma.springjooq.jooq.tables.records.BookRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookDao extends DAOImpl<BookRecord, com.gatesma.springjooq.jooq.tables.pojos.Book, Integer> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(Book.BOOK, com.gatesma.springjooq.jooq.tables.pojos.Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    public BookDao(Configuration configuration) {
        super(Book.BOOK, com.gatesma.springjooq.jooq.tables.pojos.Book.class, configuration);
    }

    @Override
    public Integer getId(com.gatesma.springjooq.jooq.tables.pojos.Book object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchById(Integer... values) {
        return fetch(Book.BOOK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.gatesma.springjooq.jooq.tables.pojos.Book fetchOneById(Integer value) {
        return fetchOne(Book.BOOK.ID, value);
    }

    /**
     * Fetch records that have <code>author_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchRangeOfAuthorId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.AUTHOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>author_id IN (values)</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchByAuthorId(Integer... values) {
        return fetch(Book.BOOK.AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchByTitle(String... values) {
        return fetch(Book.BOOK.TITLE, values);
    }

    /**
     * Fetch records that have <code>published_in BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchRangeOfPublishedIn(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.PUBLISHED_IN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>published_in IN (values)</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchByPublishedIn(Integer... values) {
        return fetch(Book.BOOK.PUBLISHED_IN, values);
    }

    /**
     * Fetch records that have <code>language_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchRangeOfLanguageId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Book.BOOK.LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<com.gatesma.springjooq.jooq.tables.pojos.Book> fetchByLanguageId(Integer... values) {
        return fetch(Book.BOOK.LANGUAGE_ID, values);
    }
}
