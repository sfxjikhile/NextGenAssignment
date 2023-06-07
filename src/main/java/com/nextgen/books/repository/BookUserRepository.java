package com.nextgen.books.repository;

import com.nextgen.books.entity.BookUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookUserRepository extends JpaRepository<BookUsers, Long> {
    BookUsers findByEmail(String email);
}
