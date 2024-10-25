package com.outercode.lojaVirtual.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebConfigSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Desabilita CSRF para permitir requisições sem bloqueios
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()  // Permite todas as requisições
                )
                .headers(headers -> headers.disable())  // Para permitir iframes, se necessário
                .cors(cors -> cors.disable())  // Desabilita CORS globalmente, se necessário
                .formLogin(form -> form.disable());  // Desabilita o login baseado em formulário

        return http.build();
    }
}
