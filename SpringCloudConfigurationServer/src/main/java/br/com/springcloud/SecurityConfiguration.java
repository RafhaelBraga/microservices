package br.com.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	
	//https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        .csrf()
        .ignoringAntMatchers("/encrypt/**")
        .ignoringAntMatchers("/decrypt/**");
        
        return http.build();
    }
		
}