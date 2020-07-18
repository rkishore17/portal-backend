package com.mareech.dhanihabitation;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
    protected void configure(HttpSecurity http) throws Exception{	
        http.httpBasic().and().csrf().disable().cors()
        .and().authorizeRequests().antMatchers("/","/auth/**","/home/**","/validateOtp/**").permitAll().anyRequest().authenticated()
//        .and().addFilter(new JWTAuthorizationFilter(authenticationManager()))
//        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            ;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**","/js/**", "/images/**");
    }
}
