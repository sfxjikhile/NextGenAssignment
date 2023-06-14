package com.nextgen.books.repository;

import com.nextgen.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findBookById(int id);

    Book findBookByName(String name);

    @Modifying
    @Query(value = "delete from Book b where b.book_name = :name", nativeQuery = true)
    void deleteBookByName (String name);
}
