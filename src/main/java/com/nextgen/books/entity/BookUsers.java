package com.nextgen.books.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "BOOK_USERS")
public class BookUsers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;
  //  private String role;
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name ="users_role", joinColumns =@JoinColumn(name = "users_id"), inverseJoinColumns = @JoinColumn(name = "roles_id"))
//    private Set<Roles> roles;
}
