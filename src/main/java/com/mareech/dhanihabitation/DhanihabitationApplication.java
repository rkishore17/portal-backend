package com.mareech.dhanihabitation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
public class DhanihabitationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhanihabitationApplication.class, args);
	}
}

//@EnableWebSecurity
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//class SecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	@Override
//  protected void configure(HttpSecurity http) throws Exception {
//      http.authorizeRequests().antMatchers("/api/v1").permitAll();
//  }
//}