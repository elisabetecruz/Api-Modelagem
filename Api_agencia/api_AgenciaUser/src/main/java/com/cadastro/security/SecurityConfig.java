package com.cadastro.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
@EnableMethodSecurity

public class SecurityConfig {

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SecurityFilterChain filterChain (HttpSecurity http )throws Exception{
		return http.csrf().disable().authorizeHttpRequests(auth -> auth
				.antMatchers("/","/create", "home", "/login","registrar","user/create","users/role" ).permitAll()
				.antMatchers("/usuario/acesso").permitAll()
				.anyRequest().authenticated()
				)
				.httpBasic(Customizer.withDefaults())
				.build();
				
	} 
}
