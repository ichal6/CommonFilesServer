package com.lechowicz.servercommonfiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity(debug = true)
public class SecurityConfig{
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/")
                .mvcMatcher("/graphiql")
                .mvcMatcher("/graphql/")
                .authorizeRequests()
                .mvcMatchers("/")
                .access("hasAuthority('SCOPE_articles.read')")
                .mvcMatchers(("/graphiql/"))
                .access("hasAuthority('SCOPE_articles.read')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }
}
