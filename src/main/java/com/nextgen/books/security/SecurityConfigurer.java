//package com.nextgen.books.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//
//@Configuration
//public class SecurityConfigurer {
//
////    @Bean
////    UserDetailsService userDetailsService() {
////        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
////        UserDetails user = User.withUsername("janet")
////                .password(passwordEncoder().encode("p@ssword"))
////                .authorities("read").build();
////        userDetailsService.createUser(user);
////        return userDetailsService;
////    }
//
//    @Bean
//    BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        //http.authorizeHttpRequests().anyRequest().authenticated();
//        http.httpBasic();
//        http.authorizeHttpRequests().anyRequest().authenticated();
//        http.addFilterBefore(new MySecurityFilter(), BasicAuthenticationFilter.class);
//        http.csrf().disable();
//        return http.build();
//    }
//}
