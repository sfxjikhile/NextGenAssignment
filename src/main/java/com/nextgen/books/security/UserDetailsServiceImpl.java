package com.nextgen.books.security;

import com.nextgen.books.entity.BookUsers;
import com.nextgen.books.repository.BookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final BookUserRepository bookUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        BookUsers user = bookUserRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid email specified");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), new BCryptPasswordEncoder().encode(user.getPassword()), new ArrayList<>());
    }
}
